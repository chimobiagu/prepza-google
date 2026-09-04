import React, { useState } from 'react';
import { useApp } from '../context/AppContext';
import {
  Bookmark,
  ArrowLeft,
  Play,
  Trash2,
  Bot,
  Volume2,
  ChevronDown,
  ChevronUp
} from 'lucide-react';

export const BookmarksScreen: React.FC = () => {
  const {
    bookmarks,
    questions,
    toggleBookmark,
    practiceBookmarks,
    setActiveScreen,
    askAiAboutQuestion,
    speakText
  } = useApp();

  const [expandedId, setExpandedId] = useState<string | null>(null);

  const bookmarkedQuestions = questions.filter(q => bookmarks.includes(q.id));
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

        {bookmarkedQuestions.length > 0 && (
          <button
            onClick={practiceBookmarks}
            className="flex items-center gap-1.5 px-4 py-2 rounded-xl bg-purple-500 hover:bg-purple-400 text-slate-950 text-xs font-black uppercase tracking-wider shadow-lg shadow-purple-950/40 transition"
          >
            <Play className="w-3.5 h-3.5 fill-current" />
            <span>Practice Bookmarks ({bookmarkedQuestions.length})</span>
          </button>
        )}
      </div>

      {/* Header Info */}
      <div className="p-6 rounded-3xl bg-slate-900 border border-slate-800 space-y-2">
        <div className="flex items-center gap-2 text-xs font-bold uppercase tracking-wider text-purple-400">
          <Bookmark className="w-4 h-4" />
          <span>High-Yield Bookmarks</span>
        </div>
        <h1 className="text-2xl font-black text-white">Saved Questions & Key Concepts</h1>
        <p className="text-xs text-slate-300 leading-relaxed">
          Questions you marked during practice sessions for quick reference and pre-exam revision.
        </p>
      </div>

      {/* List */}
      {bookmarkedQuestions.length === 0 ? (
        <div className="p-12 text-center rounded-3xl bg-slate-900/60 border border-slate-800 space-y-3">
          <Bookmark className="w-10 h-10 text-purple-400 mx-auto" />
          <h2 className="text-base font-bold text-white">No bookmarked questions yet</h2>
          <p className="text-xs text-slate-400 max-w-sm mx-auto">
            Click the bookmark ribbon icon during any practice session or mock exam to pin questions here.
          </p>
        </div>
      ) : (
        <div className="space-y-4">
          {bookmarkedQuestions.map(q => {
            const isExpanded = expandedId === q.id;

            return (
              <div
                key={q.id}
                className="p-5 rounded-3xl bg-slate-900 border border-slate-800 space-y-4 transition hover:border-slate-700"
              >
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-2">
                    <span className="text-xs font-bold text-purple-400 uppercase tracking-wider">
                      {q.subject}
                    </span>
                    <span className="text-[11px] text-slate-400">
                      • {q.topic}
                    </span>
                  </div>

                  <div className="flex items-center gap-2">
                    <button
                      onClick={() => speakText(`${q.questionText}. Option ${optionLetters[q.correctAnswerIndex]} is correct.`)}
                      className="p-1.5 rounded-lg text-slate-400 hover:text-white"
                      title="Read aloud"
                    >
                      <Volume2 className="w-4 h-4" />
                    </button>

                    <button
                      onClick={() => toggleBookmark(q.id)}
                      className="p-1.5 rounded-lg text-red-400 hover:bg-red-950/50"
                      title="Remove bookmark"
                    >
                      <Trash2 className="w-4 h-4" />
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
                  <span className="text-slate-400">Year: {q.year}</span>
                  <span className="text-emerald-400 font-bold">
                    Correct Option: {optionLetters[q.correctAnswerIndex]}
                  </span>
                </div>

                {isExpanded && (
                  <div className="pt-3 border-t border-slate-800 space-y-3">
                    <div className="p-3.5 rounded-xl bg-slate-950 text-xs text-slate-300 leading-relaxed font-sans">
                      <div className="font-bold text-purple-400 mb-1">Step-by-Step Solution:</div>
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
