import express from "express";
import path from "path";
import { createServer as createViteServer } from "vite";
import dotenv from "dotenv";
import { GoogleGenAI } from "@google/genai";

dotenv.config();

const app = express();
const PORT = 3000;

app.use(express.json({ limit: "10mb" }));

// Lazy initialization for Gemini AI SDK
let aiClient: GoogleGenAI | null = null;
function getAiClient(): GoogleGenAI | null {
  const apiKey = process.env.GEMINI_API_KEY;
  if (!apiKey) return null;
  if (!aiClient) {
    aiClient = new GoogleGenAI({ apiKey });
  }
  return aiClient;
}

// Health check endpoint
app.get("/api/health", (req, res) => {
  res.json({ status: "ok", app: "Prepza", version: "1.0.0" });
});

// AI Tutor endpoint
app.post("/api/gemini/tutor", async (req, res) => {
  try {
    const { message, persona, questionContext, history } = req.body;
    
    const client = getAiClient();
    
    // System prompt per persona
    let systemInstruction = `You are Prepza AI Tutor, an elite, articulate, and encouraging AI study coach for Nigerian students preparing for the Joint Admissions and Matriculation Board (JAMB) Unified Tertiary Matriculation Examination (UTME).
Provide clear, direct, and structured explanations. Use markdown headers (**Key Concept**, **Step-by-Step Breakdown**, **Common JAMB Trap**, **Exam Tip & Shortcut**). Keep the tone motivating, practical, and highly educational.`;

    if (persona === "STEM_SPECIALIST") {
      systemInstruction = `You are the Prepza STEM & Mathematics Master AI. Specialize in solving complex mathematics, physics, and chemistry problems for JAMB UTME candidates.
Always provide complete step-by-step calculations, clearly declare applicable formulas, explain algebraic transformations, check SI units, and highlight common sign and arithmetic mistakes.`;
    } else if (persona === "RAPID_SPRINT") {
      systemInstruction = `You are the Prepza Speed Revision AI. Your goal is lightning-fast, high-yield, concise exam revisions for Nigerian UTME candidates. Deliver snappy bullet points, instant formulas, quick memory mnemonics, and high-frequency past question tricks without long preambles.`;
    } else if (persona === "LITERATURE_ANALYST") {
      systemInstruction = `You are the Prepza Literature in English Specialist for JAMB UTME. Specialize in the official prescribed novel 'The Life Changer' by Khadija Abubakar Jalli, 'Second-Class Citizen' by Buchi Emecheta, 'The Lion and the Jewel' by Wole Soyinka, 'Look Back in Anger' by John Osborne, and prescribed poetry. Break down character motivations, plot conflicts, themes, quotes, and likely multiple-choice question angles tested by JAMB.`;
    }

    if (questionContext) {
      systemInstruction += `\n\nContext question being studied:\n${JSON.stringify(questionContext)}`;
    }

    if (client) {
      // Model selection according to persona: gemini-2.5-flash
      const modelName = persona === "STEM_SPECIALIST" ? "gemini-2.5-pro" : "gemini-2.5-flash";
      const contents = [];
      if (Array.isArray(history)) {
        for (const msg of history.slice(-6)) {
          contents.push({
            role: msg.isUser ? "user" : "model",
            parts: [{ text: msg.text }]
          });
        }
      }
      contents.push({
        role: "user",
        parts: [{ text: message || "Hello! Can you help me review for JAMB?" }]
      });

      const response = await client.models.generateContent({
        model: modelName,
        contents: contents,
        config: {
          systemInstruction: { parts: [{ text: systemInstruction }] },
          temperature: 0.7,
        }
      });

      const replyText = response.text || "I've analyzed your query. Let's break down this concept step-by-step.";
      return res.json({ reply: replyText });
    }

    // Fallback response when no API key is set in environment
    const cannedReplies: Record<string, string> = {
      default: `**Key Concept & Breakdown**\n\nGreat question! For JAMB UTME, mastering this topic requires understanding the fundamental principles rather than mere memorization.\n\n• **Core Principle**: In JAMB, examiners test application and speed.\n• **Step-by-Step Approach**: Read the question prompt carefully, eliminate any obviously incorrect choices, and apply direct formulas.\n• **Exam Tip**: Allocate no more than 40 seconds per question during the actual CBT exam!`,
      STEM_SPECIALIST: `**STEM Master Step-by-Step Solution**\n\n1. **Identify the Given Values & Target**:\n   State all physical or chemical parameters in standard SI units.\n2. **Applicable Formula**:\n   State the governing formula clearly before substitution.\n3. **Calculation**:\n   Work through arithmetic with unit cancellation.\n4. **JAMB Shortcut Tip**: Look out for standard ratios to save crucial seconds!`,
      LITERATURE_ANALYST: `**Literature Analysis & Character Insight**\n\n• **Context**: In UTME Literature texts like *The Life Changer*, questions frequently probe underlying motives, irony, and societal commentary.\n• **Key Takeaway**: Notice how moral choices reflect the overarching theme of integrity versus peer pressure.`,
      RAPID_SPRINT: `**Speed Revision Bullet Points**\n\n⚡ **Rapid Rules**:\n1. Eliminate extreme answers immediately.\n2. Verify subject-verb agreement or units before confirming.\n3. Keep your momentum going!`
    };

    const reply = cannedReplies[persona] || cannedReplies.default;
    res.json({ reply, isSimulated: true });
  } catch (error: any) {
    console.error("AI Tutor endpoint error:", error);
    res.status(500).json({ error: error.message || "Failed to process AI request" });
  }
});

async function startServer() {
  // Vite middleware in development
  if (process.env.NODE_ENV !== "production") {
    const vite = await createViteServer({
      server: { middlewareMode: true, host: "0.0.0.0", port: PORT },
      appType: "spa",
    });
    app.use(vite.middlewares);
  } else {
    const distPath = path.join(process.cwd(), "dist");
    app.use(express.static(distPath));
    app.get("*", (req, res) => {
      res.sendFile(path.join(distPath, "index.html"));
    });
  }

  app.listen(PORT, "0.0.0.0", () => {
    console.log(`Prepza server running on http://0.0.0.0:${PORT}`);
  });
}

startServer();
