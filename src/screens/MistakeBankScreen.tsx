import React, { useState } from 'react';
import { useApp } from '../context/AppContext';
import {
  AlertTriangle,
  ArrowLeft,
  CheckCircle2,
  Play,
  RotateCcw,
  Bot,
  ChevronDown,
  ChevronUp
} from 'lucide-react';

export const MistakeBankScreen: React.FC = () => {
  const {
    mistakes,
    questions,
    toggleMistakeMastered,
    practiceMistakes,
    setActiveScreen,
    askAiAboutQuestion
  } = useApp();

  const [filter, setFilter] = useState<'UNMASTERED' | 'MASTERED' | 'ALL'>('UNMASTERED');
  const [expandedId, setExpandedId] = useState<string | null>(null);

  const displayedMistakes = mistakes.filter(m => {
    if (filter === 'UNMASTERED') return !m.isMastered;
    if (filter === 'MASTERED') return m.isMastered;
    return true;
  });

  const unmasteredCount = mistakes.filter(m => !m.isMastered).length;
  const optionLetters = ['A', 'B', 'C', 'D'];

  return (
    <div className="pb-24 max-w-4xl mx-auto px-4 sm:px-6 pt-4 space-y-6 animate-fade-in">
      {/* Top Bar */}
      <div className="flex items-center justify-between bg-slate-900 border border-slate-800 p-4 rounded-3xl">
        <button
          onClick={() => setActiveScreen('MAIN_TABS')}
          className="flex items-center gap-2 text-xs font-bold text-slate-300 hover:text-white"
        >
          <ArrowLeft className="w-4 h-4" />
          <span>Back to Dashboard</span>
        </button>

        {unmasteredCount > 0 && (
          <button
            onClick={practiceMistakes}
            className="flex items-center gap-1.5 px-4 py-2 rounded-xl bg-red-500 hover:bg-red-400 text-slate-950 text-xs font-black uppercase tracking-wider shadow-lg shadow-red-950/40 transition"
          >
            <Play className="w-3.5 h-3.5 fill-current" />
            <span>Practice Mistakes ({unmasteredCount})</span>
          </button>
        )}
      </div>

      {/* Header Info */}
      <div className="p-6 rounded-3xl bg-slate-900 border border-slate-800 space-y-2">
        <div className="flex items-center gap-2 text-xs font-bold uppercase tracking-wider text-red-400">
          <AlertTriangle className="w-4 h-4" />
          <span>Spaced Repetition Mistake Bank</span>
        </div>
        <h1 className="text-2xl font-black text-white">Targeted Mistake Remediation</h1>
        <p className="text-xs text-slate-300 leading-relaxed">
          Questions you've answered incorrectly are cataloged here. Re-drill them until you master every underlying UTME concept.
        </p>

        {/* Filter Pills */}
        <div className="flex items-center gap-2 pt-3">
          <button
            onClick={() => setFilter('UNMASTERED')}
            className={`px-3 py-1.5 rounded-xl text-xs font-bold transition ${
              filter === 'UNMASTERED'
                ? 'bg-red-500 text-slate-950'
                : 'bg-slate-950 text-slate-400 border border-slate-800'
            }`}
          >
            Needs Practice ({unmasteredCount})
          </button>
          <button
            onClick={() => setFilter('MASTERED')}
            className={`px-3 py-1.5 rounded-xl text-xs font-bold transition ${
              filter === 'MASTERED'
                ? 'bg-emerald-500 text-slate-950'
                : 'bg-slate-950 text-slate-400 border border-slate-800'
            }`}
          >
            Mastered ({mistakes.length - unmasteredCount})
          </button>
          <button
            onClick={() => setFilter('ALL')}
            className={`px-3 py-1.5 rounded-xl text-xs font-bold transition ${
              filter === 'ALL'
                ? 'bg-slate-200 text-slate-950'
                : 'bg-slate-950 text-slate-400 border border-slate-800'
            }`}
          >
            All ({mistakes.length})
          </button>
        </div>
      </div>

      {/* List */}
      {displayedMistakes.length === 0 ? (
        <div className="p-12 text-center rounded-3xl bg-slate-900/60 border border-slate-800 space-y-3">
          <CheckCircle2 className="w-10 h-10 text-emerald-400 mx-auto" />
          <h2 className="text-base font-bold text-white">No mistakes in this category</h2>
          <p className="text-xs text-slate-400 max-w-sm mx-auto">
            {filter === 'UNMASTERED'
              ? 'Great job! You have mastered all recorded mistakes.'
              : 'Keep practicing mocks and drills to automatically populate your mistake remediation bank.'}
          </p>
        </div>
      ) : (
        <div className="space-y-4">
          {displayedMistakes.map(item => {
            const q = questions.find(question => question.id === item.questionId);
            if (!q) return null;
            const isExpanded = expandedId === q.id;

            return (
              <div
                key={q.id}
                className="p-5 rounded-3xl bg-slate-900 border border-slate-800 space-y-4 transition hover:border-slate-700"
              >
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-2">
                    <span className="text-xs font-bold text-emerald-400 uppercase tracking-wider">
                      {q.subject}
                    </span>
                    <span className="text-[11px] text-slate-400">
                      • {q.topic}
                    </span>
                  </div>

                  <div className="flex items-center gap-2">
                    <button
                      onClick={() => toggleMistakeMastered(q.id)}
                      className={`flex items-center gap-1 px-2.5 py-1 rounded-xl text-xs font-bold border transition ${
                        item.isMastered
                          ? 'bg-emerald-950 text-emerald-300 border-emerald-500/40'
                          : 'bg-slate-800 text-slate-300 border-slate-700 hover:text-white'
                      }`}
                    >
                      <CheckCircle2 className="w-3.5 h-3.5" />
                      <span>{item.isMastered ? 'Mastered' : 'Mark Mastered'}</span>
                    </button>

                    <button
                      onClick={() => setExpandedId(isExpanded ? null : q.id)}
                      className="p-1 text-slate-400 hover:text-white"
                    >
                      {isExpanded ? <ChevronUp className="w-4 h-4" /> : <ChevronDown className="w-4 h-4" />}
                    </button>
                  </div>
                </div>

                <p className="text-sm font-semibold text-slate-200">{q.questionText}</p>

                <div className="p-3 rounded-2xl bg-slate-950 border border-slate-800/80 text-xs flex justify-between">
                  <span className="text-red-400">
                    Previous choice: Option {optionLetters[item.selectedWrongOptionIndex]}
                  </span>
                  <span className="text-emerald-400 font-bold">
                    Correct: Option {optionLetters[q.correctAnswerIndex]}
                  </span>
                </div>

                {isExpanded && (
                  <div className="pt-3 border-t border-slate-800 space-y-3">
                    <div className="p-3.5 rounded-xl bg-slate-950 text-xs text-slate-300 leading-relaxed font-sans">
                      <div className="font-bold text-emerald-400 mb-1">Step-by-Step Solution:</div>
                      {q.explanation}
                    </div>

                    <div className="flex justify-end">
                      <button
                        onClick={() => askAiAboutQuestion(q)}
                        className="flex items-center gap-1.5 px-3 py-1.5 rounded-xl bg-teal-950 hover:bg-teal-900 text-teal-300 border border-teal-500/30 text-xs font-semibold transition"
                      >
                        <Bot className="w-3.5 h-3.5" />
                        <span>Ask AI Tutor to Explain Deeper</span>
                      </button>
                    </div>
                  </div>
                )}
              </div>
            );
          })}
        </div>
      )}
    </div>
  );
};
