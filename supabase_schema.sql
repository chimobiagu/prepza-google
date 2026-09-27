-- ====================================================================
-- PREPZA JAMB CBT - CANONICAL SUPABASE SCHEMA & ROW LEVEL SECURITY
-- ====================================================================

-- 1. questions (Canonical Question Repository)
CREATE TABLE IF NOT EXISTS public.questions (
    id TEXT PRIMARY KEY,
    subject TEXT NOT NULL,
    topic TEXT NOT NULL,
    year TEXT NOT NULL DEFAULT '2024',
    question_text TEXT NOT NULL,
    option_a TEXT NOT NULL,
    option_b TEXT NOT NULL,
    option_c TEXT NOT NULL,
    option_d TEXT NOT NULL,
    correct_answer_index INTEGER NOT NULL CHECK (correct_answer_index BETWEEN 0 AND 3),
    explanation TEXT NOT NULL,
    passage_text TEXT,
    difficulty TEXT NOT NULL DEFAULT 'Medium',
    origin_type TEXT NOT NULL DEFAULT 'JAMB_ORIGINAL',
    origin_label TEXT NOT NULL DEFAULT 'Original JAMB Question',
    is_verified_jamb BOOLEAN NOT NULL DEFAULT TRUE,
    image_url TEXT,
    content_version INTEGER NOT NULL DEFAULT 1,
    is_disabled BOOLEAN NOT NULL DEFAULT FALSE,
    updated_at BIGINT NOT NULL DEFAULT (EXTRACT(EPOCH FROM NOW()) * 1000)::BIGINT
);

CREATE INDEX IF NOT EXISTS idx_questions_subject ON public.questions(subject);
CREATE INDEX IF NOT EXISTS idx_questions_version ON public.questions(content_version);
CREATE INDEX IF NOT EXISTS idx_questions_updated ON public.questions(updated_at);
CREATE INDEX IF NOT EXISTS idx_questions_disabled ON public.questions(is_disabled);

-- 2. question_versions (Audit Log & Revisions History)
CREATE TABLE IF NOT EXISTS public.question_versions (
    version_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    question_id TEXT NOT NULL REFERENCES public.questions(id) ON DELETE CASCADE,
    content_version INTEGER NOT NULL,
    question_text TEXT NOT NULL,
    option_a TEXT NOT NULL,
    option_b TEXT NOT NULL,
    option_c TEXT NOT NULL,
    option_d TEXT NOT NULL,
    correct_answer_index INTEGER NOT NULL,
    explanation TEXT NOT NULL,
    image_url TEXT,
    edited_by TEXT NOT NULL,
    change_reason TEXT,
    created_at BIGINT NOT NULL DEFAULT (EXTRACT(EPOCH FROM NOW()) * 1000)::BIGINT
);

CREATE INDEX IF NOT EXISTS idx_qversions_qid ON public.question_versions(question_id);

-- 3. question_reports (User Flagging / Error Reporting System)
CREATE TABLE IF NOT EXISTS public.question_reports (
    report_id TEXT PRIMARY KEY,
    question_id TEXT NOT NULL REFERENCES public.questions(id) ON DELETE CASCADE,
    user_id TEXT NOT NULL,
    subject TEXT NOT NULL,
    exam_year TEXT,
    question_source TEXT,
    question_text TEXT NOT NULL,
    option_a TEXT NOT NULL,
    option_b TEXT NOT NULL,
    option_c TEXT NOT NULL,
    option_d TEXT NOT NULL,
    current_answer_key INTEGER NOT NULL,
    current_explanation TEXT NOT NULL,
    selected_reason TEXT NOT NULL,
    user_written_report TEXT DEFAULT '',
    timestamp BIGINT NOT NULL,
    app_version TEXT NOT NULL DEFAULT '1.0',
    report_status TEXT NOT NULL DEFAULT 'PENDING', -- PENDING, REVIEWED, RESOLVED, REJECTED
    admin_decision TEXT,                          -- APPROVE_NO_CHANGE, CORRECT_QUESTION, DISABLE_QUESTION, DUPLICATE
    admin_notes TEXT,
    resolved_at BIGINT
);

CREATE INDEX IF NOT EXISTS idx_qreports_qid ON public.question_reports(question_id);
CREATE INDEX IF NOT EXISTS idx_qreports_status ON public.question_reports(report_status);
CREATE INDEX IF NOT EXISTS idx_qreports_timestamp ON public.question_reports(timestamp);

-- 4. question_report_events (Audit Timeline for Reports)
CREATE TABLE IF NOT EXISTS public.question_report_events (
    event_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    report_id TEXT NOT NULL REFERENCES public.question_reports(report_id) ON DELETE CASCADE,
    actor_id TEXT NOT NULL,
    event_type TEXT NOT NULL, -- SUBMITTED, REVIEW_STARTED, STATUS_CHANGED, QUESTION_CORRECTED
    notes TEXT,
    created_at BIGINT NOT NULL DEFAULT (EXTRACT(EPOCH FROM NOW()) * 1000)::BIGINT
);

-- 5. question_images (Supabase Storage Reference Metadata)
CREATE TABLE IF NOT EXISTS public.question_images (
    image_id TEXT PRIMARY KEY,
    question_id TEXT NOT NULL REFERENCES public.questions(id) ON DELETE CASCADE,
    storage_path TEXT NOT NULL,
    public_url TEXT,
    alt_text TEXT,
    caption TEXT,
    created_at BIGINT NOT NULL DEFAULT (EXTRACT(EPOCH FROM NOW()) * 1000)::BIGINT
);

-- 6. user_bookmarks (User Bookmarks by Stable Question ID)
CREATE TABLE IF NOT EXISTS public.user_bookmarks (
    user_id TEXT NOT NULL,
    question_id TEXT NOT NULL REFERENCES public.questions(id) ON DELETE CASCADE,
    note TEXT,
    created_at BIGINT NOT NULL DEFAULT (EXTRACT(EPOCH FROM NOW()) * 1000)::BIGINT,
    PRIMARY KEY(user_id, question_id)
);

-- ====================================================================
-- ROW LEVEL SECURITY (RLS) POLICIES
-- ====================================================================

ALTER TABLE public.questions ENABLE ROW LEVEL SECURITY;
ALTER TABLE public.question_versions ENABLE ROW LEVEL SECURITY;
ALTER TABLE public.question_reports ENABLE ROW LEVEL SECURITY;
ALTER TABLE public.question_report_events ENABLE ROW LEVEL SECURITY;
ALTER TABLE public.question_images ENABLE ROW LEVEL SECURITY;
ALTER TABLE public.user_bookmarks ENABLE ROW LEVEL SECURITY;

-- 1. questions RLS:
-- Anyone (students, anon) can read active questions
CREATE POLICY "Public students can read questions"
    ON public.questions
    FOR SELECT
    USING (true);

-- Only authenticated admins with app_metadata role = 'admin' or service_role can INSERT/UPDATE/DELETE
CREATE POLICY "Only admins can modify questions"
    ON public.questions
    FOR ALL
    USING (
        auth.jwt() -> 'app_metadata' ->> 'role' = 'admin'
        OR auth.role() = 'service_role'
    );

-- 2. question_reports RLS:
-- Students can insert new reports
CREATE POLICY "Students can submit question reports"
    ON public.question_reports
    FOR INSERT
    WITH CHECK (true);

-- Students can read their own reports
CREATE POLICY "Students can read their own reports"
    ON public.question_reports
    FOR SELECT
    USING (
        user_id = auth.uid()::text
        OR auth.jwt() -> 'app_metadata' ->> 'role' = 'admin'
        OR auth.role() = 'service_role'
    );

-- Only admins can update reports (resolve/review)
CREATE POLICY "Admins can update question reports"
    ON public.question_reports
    FOR UPDATE
    USING (
        auth.jwt() -> 'app_metadata' ->> 'role' = 'admin'
        OR auth.role() = 'service_role'
    );

-- 3. user_bookmarks RLS:
CREATE POLICY "Users can manage their own bookmarks"
    ON public.user_bookmarks
    FOR ALL
    USING (user_id = auth.uid()::text);
