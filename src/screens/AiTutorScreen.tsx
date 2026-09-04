import React, { useState, useRef, useEffect } from 'react';
import { useApp } from '../context/AppContext';
import { TUTOR_PERSONAS } from '../data/defaultData';
import { TutorPersonaKey } from '../types';
import {
  Bot,
  Send,
  Sparkles,
  ArrowLeft,
  Volume2,
  BookOpen,
  Atom,
  Zap,
  GraduationCap
} from 'lucide-react';

export const AiTutorScreen: React.FC = () => {
  const {
    aiMessages,
    isAiLoading,
    sendAiMessage,
    selectedTutorPersona,
    setSelectedTutorPersona,
    setActiveScreen,
    speakText
  } = useApp();

  const [input, setInput] = useState<string>('');
  const messagesEndRef = useRef<HTMLDivElement>(null);

  useEffect(() => {
    messagesEndRef.current?.scrollIntoView({ behavior: 'smooth' });
  }, [aiMessages, isAiLoading]);

  const activePersonaObj = TUTOR_PERSONAS.find(p => p.key === selectedTutorPersona) || TUTOR_PERSONAS[0];

  const handleSend = (textToSend?: string) => {
    const msg = textToSend || input;
    if (!msg.trim() || isAiLoading) return;
    sendAiMessage(msg);
    setInput('');
  };

  const personaIcons: Record<TutorPersonaKey, React.ComponentType<{ className?: string }>> = {
    GENERAL_COACH: GraduationCap,
    STEM_SPECIALIST: Atom,
    RAPID_SPRINT: Zap,
    LITERATURE_ANALYST: BookOpen
  };

  const suggestionPrompts: Record<TutorPersonaKey, string[]> = {
    GENERAL_COACH: [
      "What is the best exam strategy for the 120-minute CBT time limit?",
      "How do I choose between two very close options in English Comprehension?",
      "Explain the rules of subject-verb agreement with 'neither...nor'"
    ],
    STEM_SPECIALIST: [
      "Derive the maximum height formula for a projectile launched at angle θ",
      "Explain how to balance redox reactions using the oxidation number method",
      "Show step-by-step how to find the derivative of y = 3x⁴ - 5x² + 7"
    ],
    RAPID_SPRINT: [
      "Give me the quick formula summary for Electric Circuits (Ohm's & Resistors)",
      "Give me high-yield rules for identifying primary stress in 3-syllable nouns",
      "Quick summary of Graham's Law of Diffusion with common examples"
    ],
    LITERATURE_ANALYST: [
      "Analyze the character and moral downfall of Salma in 'The Life Changer'",
      "What are the major themes and conflicts in Buchi Emecheta's 'Second-Class Citizen'?",
      "Contrast the ideals of Baroka and Lakunle in 'The Lion and the Jewel'"
    ]
  };

  return (
    <div className="pb-24 max-w-4xl mx-auto px-4 sm:px-6 pt-4 space-y-4 animate-fade-in flex flex-col h-[calc(100vh-5rem)]">
      {/* Top Header & Persona Selector */}
      <div className="bg-slate-900/90 border border-slate-800 p-4 rounded-3xl backdrop-blur-md shrink-0 space-y-3">
        <div className="flex items-center justify-between">
          <div className="flex items-center gap-3">
            <button
              onClick={() => setActiveScreen('MAIN_TABS')}
              className="p-2 rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-300 transition"
            >
              <ArrowLeft className="w-4 h-4" />
            </button>
            <div className="flex items-center gap-2.5">
              <div className="p-2 rounded-xl bg-gradient-to-br from-emerald-500 to-teal-600 text-slate-950 font-bold">
                <Bot className="w-5 h-5" />
              </div>
              <div>
                <h1 className="text-base font-extrabold text-white flex items-center gap-2">
                  <span>Prepza 24/7 AI Study Tutor</span>
                  <span className="text-[10px] uppercase font-bold px-2 py-0.5 rounded-full bg-teal-500/20 text-teal-300 border border-teal-500/30">
                    {activePersonaObj.engineName}
                  </span>
                </h1>
                <p className="text-xs text-slate-400">
                  {activePersonaObj.tagline}
                </p>
              </div>
            </div>
          </div>
        </div>

        {/* Persona Switcher Tabs */}
        <div className="grid grid-cols-2 sm:grid-cols-4 gap-2 pt-2 border-t border-slate-800">
          {TUTOR_PERSONAS.map(p => {
            const Icon = personaIcons[p.key];
            const isSelected = selectedTutorPersona === p.key;

            return (
              <button
                key={p.key}
                onClick={() => setSelectedTutorPersona(p.key)}
                className={`p-2.5 rounded-2xl border text-left transition flex items-center gap-2.5 ${
                  isSelected
                    ? 'bg-teal-950/80 border-teal-500 text-teal-300 shadow-sm'
                    : 'bg-slate-950 border-slate-800 text-slate-400 hover:border-slate-700 hover:text-slate-200'
                }`}
              >
                <div className={`p-1.5 rounded-lg ${isSelected ? 'bg-teal-500 text-slate-950' : 'bg-slate-800 text-slate-400'}`}>
                  <Icon className="w-3.5 h-3.5" />
                </div>
                <div className="truncate">
                  <div className="text-xs font-bold truncate">{p.displayName}</div>
                </div>
              </button>
            );
          })}
        </div>
      </div>

      {/* Chat Messages Container */}
      <div className="flex-1 overflow-y-auto space-y-4 p-4 rounded-3xl bg-slate-950/60 border border-slate-800/80">
        {aiMessages.map((msg, i) => {
          const isUser = msg.sender === 'user';

          return (
            <div
              key={msg.id || i}
              className={`flex items-start gap-3 ${isUser ? 'flex-row-reverse' : 'flex-row'}`}
            >
              <div
                className={`w-8 h-8 rounded-full flex items-center justify-center text-xs font-bold shrink-0 mt-1 ${
                  isUser
                    ? 'bg-emerald-600 text-white'
                    : 'bg-gradient-to-br from-teal-500 to-emerald-600 text-slate-950 shadow-md shadow-teal-900/30'
                }`}
              >
                {isUser ? 'You' : <Bot className="w-4 h-4" />}
              </div>

              <div
                className={`max-w-[85%] sm:max-w-[75%] p-4 rounded-2xl text-xs sm:text-sm leading-relaxed ${
                  isUser
                    ? 'bg-emerald-600 text-white rounded-tr-none shadow-md shadow-emerald-950/30'
                    : 'bg-slate-900 border border-slate-800 text-slate-200 rounded-tl-none space-y-2'
                }`}
              >
                <div className="whitespace-pre-line font-sans select-text">
                  {msg.text}
                </div>

                {!isUser && (
                  <div className="flex items-center justify-between pt-2 border-t border-slate-800/80 text-[11px] text-slate-400">
                    <span>{activePersonaObj.displayName}</span>
                    <button
                      onClick={() => speakText(msg.text)}
                      className="p-1 rounded text-slate-400 hover:text-white transition"
                      title="Read explanation aloud"
                    >
                      <Volume2 className="w-3.5 h-3.5" />
                    </button>
                  </div>
                )}
              </div>
            </div>
          );
        })}

        {isAiLoading && (
          <div className="flex items-center gap-3">
            <div className="w-8 h-8 rounded-full bg-teal-600/30 border border-teal-500/40 flex items-center justify-center text-teal-300 shrink-0">
              <Bot className="w-4 h-4 animate-spin" />
            </div>
            <div className="p-3.5 rounded-2xl bg-slate-900 border border-slate-800 text-xs text-slate-400 flex items-center gap-2">
              <Sparkles className="w-3.5 h-3.5 text-teal-400 animate-pulse" />
              <span>Analyzing UTME syllabus and generating response...</span>
            </div>
          </div>
        )}

        <div ref={messagesEndRef} />
      </div>

      {/* Suggested Prompt Chips */}
      <div className="flex items-center gap-2 overflow-x-auto pb-1 shrink-0">
        {suggestionPrompts[selectedTutorPersona].map((prompt, idx) => (
          <button
            key={idx}
            onClick={() => handleSend(prompt)}
            disabled={isAiLoading}
            className="px-3 py-1.5 rounded-xl bg-slate-900 hover:bg-slate-800 border border-slate-800 text-slate-300 text-xs font-medium whitespace-nowrap transition shrink-0"
          >
            {prompt}
          </button>
        ))}
      </div>

      {/* Message Input Box */}
      <div className="shrink-0 bg-slate-900 border border-slate-800 p-2.5 rounded-2xl flex items-center gap-2">
        <input
          type="text"
          value={input}
          onChange={e => setInput(e.target.value)}
          onKeyDown={e => e.key === 'Enter' && handleSend()}
          placeholder={`Ask ${activePersonaObj.displayName} anything (e.g. physics equation, character theme)...`}
          disabled={isAiLoading}
          className="flex-1 bg-transparent px-3 py-1.5 text-sm text-white placeholder-slate-500 focus:outline-none"
        />
        <button
          onClick={() => handleSend()}
          disabled={!input.trim() || isAiLoading}
          className="p-2.5 rounded-xl bg-emerald-500 hover:bg-emerald-400 disabled:opacity-40 text-slate-950 transition font-bold shadow-md shadow-emerald-950/30 shrink-0"
        >
          <Send className="w-4 h-4" />
        </button>
      </div>
    </div>
  );
};
