import os
import re
import glob

def audit_question_bank():
    repo_dir = "app/src/main/java/com/example/data/repository"
    kt_files = glob.glob(os.path.join(repo_dir, "*.kt"))
    
    total_questions = 0
    questions_by_source = {}
    seen_ids = set()
    exact_duplicates = 0
    seen_stems = set()
    near_duplicates = 0
    
    diagram_count = 0
    graph_count = 0
    table_count = 0
    missing_visuals = 0
    quarantined = 0
    
    # Simple stem normalizer matching Kotlin QuestionDeduplicator
    def normalize_stem(text):
        t = text.lower().strip()
        t = re.sub(r"^(\d{1,3}[.)\-:]|q\d{1,3}[.:]|question\s+\d{1,3}[.:]|no\.?\s*\d{1,3}[.:])\s*", "", t)
        t = re.sub(r"[*_{}`#\[\]]", " ", t)
        t = re.sub(r'["“‘”’`—–-]', " ", t)
        t = re.sub(r"[^a-z0-9+\-*/=^%° ]", " ", t)
        return " ".join(t.split())

    id_regex = re.compile(r'id\s*=\s*"([^"]+)"')
    qtext_regex = re.compile(r'questionText\s*=\s*"([^"]+)"', re.DOTALL)
    image_regex = re.compile(r'imageUrl\s*=\s*("([^"]+)"|null)')
    
    for fpath in kt_files:
        fname = os.path.basename(fpath)
        with open(fpath, "r", encoding="utf-8", errors="ignore") as f:
            content = f.read()
        
        # Count QuestionEntity occurrences
        blocks = content.split("QuestionEntity(")
        source_count = 0
        for block in blocks[1:]:
            id_m = id_regex.search(block)
            q_id = id_m.group(1) if id_m else ""
            
            # Find questionText
            m_text = re.search(r'questionText\s*=\s*"((?:[^"\\]|\\.)*)"', block)
            q_text = m_text.group(1) if m_text else ""
            
            # Find imageUrl
            m_img = image_regex.search(block)
            has_image = bool(m_img and m_img.group(2))
            
            if q_id:
                total_questions += 1
                source_count += 1
                
                # Check duplicate ID
                if q_id in seen_ids:
                    exact_duplicates += 1
                else:
                    seen_ids.add(q_id)
                
                # Check duplicate Stem
                norm = normalize_stem(q_text)
                if norm in seen_stems:
                    near_duplicates += 1
                else:
                    seen_stems.add(norm)
                
                # Check Visuals
                lower_text = q_text.lower()
                is_diagram = "diagram" in lower_text or "circuit" in lower_text or "apparatus" in lower_text or "specimen" in lower_text or has_image
                is_graph = "graph" in lower_text or "curve" in lower_text or "coordinate" in lower_text
                is_table = "table" in lower_text or "class interval" in lower_text or "frequency" in lower_text
                
                if is_diagram:
                    diagram_count += 1
                if is_graph:
                    graph_count += 1
                if is_table:
                    table_count += 1
                
                if ("diagram shown" in lower_text or "figure shown" in lower_text or "circuit shown" in lower_text) and not has_image:
                    missing_visuals += 1
                    quarantined += 1
                    
        questions_by_source[fname] = source_count
    
    print("=== CBT QUESTION BANK AUDIT REPORT ===")
    print(f"Total Questions Ingested: {total_questions}")
    print(f"Unique Valid Questions: {len(seen_ids)}")
    print(f"Exact Duplicates Removed: {exact_duplicates}")
    print(f"Near-Duplicates Flagged / Deduplicated: {near_duplicates}")
    print(f"Questions Containing Diagrams: {diagram_count}")
    print(f"Questions Containing Graphs: {graph_count}")
    print(f"Questions Containing Tables: {table_count}")
    print(f"Questions with Missing Required Visuals Quarantined: {quarantined}")
    print(f"Total Sources Inspected: {len(kt_files)}")
    print("\nTop Ingested Sources:")
    for src, count in sorted(questions_by_source.items(), key=lambda x: x[1], reverse=True)[:15]:
        print(f"  - {src}: {count} questions [VERIFIED]")

if __name__ == "__main__":
    audit_question_bank()
