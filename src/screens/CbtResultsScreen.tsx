import React, { useEffect, useState } from 'react';
import { useApp } from '../context/AppContext';
import confetti from 'canvas-confetti';
import {
  Award,
  CheckCircle2,
  XCircle,
  Clock,
  RotateCcw,
  BookOpen,
  Bot,
  Filter,
  ArrowLeft,
  ChevronDown,
  ChevronUp,
  Sparkles,
  Layers
} from 'lucide-react';

export const CbtResultsScreen: React.FC = () => {
  const { cbtResult, setActiveScreen, startCbtExam, askAiAboutQuestion } = useApp();
  const [filter, setFilter] = useState<'ALL' | 'CORRECT' | 'INCORRECT' | 'UNATTEMPTED'>('ALL');
  const [expandedQuestionId, setExpandedQuestionId] = useState<string | null>(null);

  useEffect(() => {
    if (cbtResult && cbtResult.percentage >= 60) {
      try {
        confetti({
          particleCount: 80,
          spread: 70,
          origin: { y: 0.6 }
        });
      } catch (e) {
        // ignore if canvas not supported
      }
    }
  }, [cbtResult]);

  if (!cbtResult) {
    return (
      <div className="min-h-[60vh] flex flex-col items-center justify-center p-6 text-center text-white">
        <h2 className="text-xl font-bold">No examination results available</h2>
        <button
          onClick={() => setActiveScreen('MAIN_TABS')}
          className="mt-4 px-5 py-2.5 bg-emerald-500 text-slate-950 font-bold rounded-xl"
        >
          Return to Dashboard
        </button>
      </div>
    );
  }

  // Filter questions
  const filteredQuestions = cbtResult.questions.filter(q => {
    const userChoice = cbtResult.userAnswers[q.id];
    if (filter === 'CORRECT') return userChoice === q.correctAnswerIndex;
    if (filter === 'INCORRECT') return userChoice !== undefined && userChoice !== q.correctAnswerIndex;
    if (filter === 'UNATTEMPTED') return userChoice === undefined;
    return true;
  });

  const durationMin = Math.floor(cbtResult.durationSeconds / 60);
  const durationSec = cbtResult.durationSeconds % 60;

  // Scale to 400 UTME standard points
  const scaledScore = Math.round((cbtResult.totalScore / (cbtResult.maxScore || 1)) * 400);

  const optionLetters = ['A', 'B', 'C', 'D'];

  return (
    <div className="pb-24 max-w-5xl mx-auto px-4 sm:px-6 pt-4 space-y-6 animate-fade-in">
      {/* Top Banner with Score */}
      <div className="relative overflow-hidden rounded-3xl bg-gradient-to-br from-emerald-950 via-slate-900 to-slate-950 border border-emerald-500/30 p-6 sm:p-8 shadow-2xl">
        <div className="flex flex-col md:flex-row md:items-center justify-between gap-6">
          <div>
            <div className="flex items-center gap-2 mb-2">
              <span className="text-xs font-bold uppercase tracking-wider text-emerald-400 bg-emerald-500/10 px-2.5 py-1 rounded-full border border-emerald-500/20">
                Examination Performance Report
              </span>
              <span className="text-xs text-slate-400">
                • {cbtResult.mode}
              </span>
            </div>

            <h1 className="text-2xl sm:text-3xl font-black text-white">
              {cbtResult.percentage >= 65 ? 'Outstanding Performance! 🎓' : 'Good Effort! Keep Pushing 💪'}
            </h1>
            <p className="text-sm text-slate-300 mt-1 max-w-lg leading-relaxed">
              You scored <span className="font-bold text-emerald-400">{cbtResult.totalScore}</span> out of{' '}
              <span className="font-bold text-white">{cbtResult.maxScore}</span> questions ({cbtResult.percentage}%).
            </p>
          </div>

          {/* Big Score Card */}
          <div className="flex items-center gap-4 bg-slate-950/80 border border-emerald-500/30 p-4 rounded-3xl shrink-0 shadow-lg">
            <div className="p-3 rounded-2xl bg-emerald-500/20 text-emerald-400">
              <Award className="w-8 h-8" />
            </div>
            <div>
              <div className="text-xs font-semibold text-slate-400 uppercase tracking-wider">
                Predicted UTME Score
              </div>
              <div className="text-3xl font-black text-emerald-400 flex items-baseline gap-1">
                <span>{scaledScore}</span>
                <span className="text-xs font-medium text-slate-400">/ 400</span>
              </div>
            </div>
          </div>
        </div>

        {/* Quick metrics: Time taken, Accuracy, XP */}
        <div className="mt-6 pt-4 border-t border-slate-800 grid grid-cols-2 sm:grid-cols-3 gap-3">
          <div className="flex items-center gap-2 text-xs text-slate-300">
            <Clock className="w-4 h-4 text-emerald-400" />
            <span>Time Taken: {durationMin}m {durationSec}s</span>
          </div>
          <div className="flex items-center gap-2 text-xs text-slate-300">
            <CheckCircle2 className="w-4 h-4 text-emerald-400" />
            <span>Accuracy: {cbtResult.percentage}%</span>
          </div>
          <div className="flex items-center gap-2 text-xs text-slate-300">
            <Sparkles className="w-4 h-4 text-amber-400" />
            <span>XP Earned: +{cbtResult.totalScore * 10} XP</span>
          </div>
        </div>
      </div>

      {/* Subject Breakdown Cards */}
      <div>
        <h2 className="text-sm font-bold uppercase tracking-wider text-slate-400 mb-3">
          Subject-by-Subject Score Breakdown
        </h2>

        <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-3">
          {cbtResult.breakdowns.map((b, idx) => (
            <div
              key={idx}
              className="p-4 rounded-2xl bg-slate-900 border border-slate-800 space-y-2"
            >
              <div className="flex items-center justify-between text-xs font-bold">
                <span className="text-slate-200 truncate pr-2">{b.subject}</span>
                <span className="text-emerald-400 font-mono">{b.score}/{b.total}</span>
              </div>

              <div className="w-full h-2 rounded-full bg-slate-800 overflow-hidden">
                <div
                  className="h-full bg-emerald-500 rounded-full transition-all duration-500"
                  style={{ width: `${b.percentage}%` }}
                />
              </div>

              <div className="flex justify-between text-[11px] text-slate-400 font-medium">
                <span>Accuracy</span>
                <span>{b.percentage}%</span>
              </div>
            </div>
          ))}
        </div>
      </div>

      {/* Question Review Section with Filter Tabs */}
      <div className="p-6 rounded-3xl bg-slate-900 border border-slate-800 space-y-6">
        <div className="flex flex-col sm:flex-row sm:items-center justify-between gap-4 border-b border-slate-800 pb-4">
          <div>
            <h2 className="text-base font-bold text-white">Question Solutions & Step-by-Step Review</h2>
            <p className="text-xs text-slate-400 mt-0.5">
              Review every answer choice, identify traps, and ask the AI Tutor for explanations.
            </p>
          </div>

          {/* Filter Pills */}
          <div className="flex items-center gap-1.5 overflow-x-auto pb-1">
            {(['ALL', 'CORRECT', 'INCORRECT', 'UNATTEMPTED'] as const).map(f => (
              <button
                key={f}
                onClick={() => setFilter(f)}
                className={`px-3 py-1.5 rounded-xl text-xs font-bold transition shrink-0 ${
                  filter === f
                    ? 'bg-emerald-500 text-slate-950 font-black'
                    : 'bg-slate-950 text-slate-400 hover:text-slate-200 border border-slate-800'
                }`}
              >
                {f}
              </button>
            ))}
          </div>
        </div>

        {/* Questions List */}
        <div className="space-y-4">
          {filteredQuestions.map((q, idx) => {
            const userChoice = cbtResult.userAnswers[q.id];
            const isCorrect = userChoice === q.correctAnswerIndex;
            const isExpanded = expandedQuestionId === q.id;

            return (
              <div
                key={q.id}
                className="rounded-2xl bg-slate-950 border border-slate-800/80 p-4 space-y-3 transition hover:border-slate-700"
              >
                {/* Header info */}
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-2">
                    <span className="text-xs font-bold text-emerald-400">
                      {q.subject}
                    </span>
                    <span className="text-[11px] text-slate-400">
                      • {q.topic}
                    </span>
                  </div>

                  <div className="flex items-center gap-2">
                    {userChoice === undefined ? (
                      <span className="text-xs font-semibold px-2 py-0.5 rounded bg-slate-800 text-slate-400">
                        Unattempted
                      </span>
                    ) : isCorrect ? (
                      <span className="flex items-center gap-1 text-xs font-bold px-2.5 py-0.5 rounded-full bg-emerald-950 text-emerald-400 border border-emerald-900">
                        <CheckCircle2 className="w-3.5 h-3.5" />
                        <span>Correct</span>
                      </span>
                    ) : (
                      <span className="flex items-center gap-1 text-xs font-bold px-2.5 py-0.5 rounded-full bg-red-950 text-red-400 border border-red-900">
                        <XCircle className="w-3.5 h-3.5" />
                        <span>Incorrect</span>
                      </span>
                    )}

                    <button
                      onClick={() => setExpandedQuestionId(isExpanded ? null : q.id)}
                      className="p-1 rounded-lg hover:bg-slate-800 text-slate-400 hover:text-white"
                    >
                      {isExpanded ? <ChevronUp className="w-4 h-4" /> : <ChevronDown className="w-4 h-4" />}
                    </button>
                  </div>
                </div>

                {/* Prompt */}
                <p className="text-sm font-semibold text-slate-200">
                  {q.questionText}
                </p>

                {/* Selected vs Correct */}
                <div className="grid grid-cols-1 sm:grid-cols-2 gap-2 text-xs pt-1">
                  <div className="p-2.5 rounded-xl bg-slate-900 border border-slate-800 flex items-center justify-between">
                    <span className="text-slate-400">Your Answer:</span>
                    <span className={`font-bold ${isCorrect ? 'text-emerald-400' : 'text-red-400'}`}>
                      {userChoice !== undefined ? `Option ${optionLetters[userChoice]}` : 'None'}
                    </span>
                  </div>

                  <div className="p-2.5 rounded-xl bg-slate-900 border border-slate-800 flex items-center justify-between">
                    <span className="text-slate-400">Correct Answer:</span>
                    <span className="font-bold text-emerald-400">
                      Option {optionLetters[q.correctAnswerIndex]}
                    </span>
                  </div>
                </div>

                {/* Expanded Details: Explanation & AI Ask */}
                {isExpanded && (
                  <div className="pt-3 border-t border-slate-800/80 space-y-3">
                    <div className="p-3.5 rounded-xl bg-slate-900/90 text-xs text-slate-300 leading-relaxed font-sans">
                      <div className="font-bold text-emerald-400 mb-1">Step-by-Step Solution:</div>
                      {q.explanation}
                    </div>

                    <div className="flex items-center justify-end">
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

        {/* Bottom Actions */}
        <div className="pt-4 border-t border-slate-800 flex flex-wrap items-center justify-between gap-3">
          <button
            onClick={() => setActiveScreen('MAIN_TABS')}
            className="flex items-center gap-2 px-5 py-2.5 rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-200 text-xs font-bold transition"
          >
            <ArrowLeft className="w-4 h-4" />
            <span>Return to Dashboard</span>
          </button>

          <button
            onClick={() => startCbtExam(cbtResult.breakdowns.map(b => b.subject), 'Full 4-Subject UTME Mock Exam', 120)}
            className="flex items-center gap-2 px-6 py-2.5 rounded-xl bg-emerald-500 hover:bg-emerald-400 text-slate-950 text-xs font-black uppercase tracking-wider shadow-lg shadow-emerald-950/40 transition"
          >
            <RotateCcw className="w-4 h-4" />
            <span>Retake This Exam</span>
          </button>
        </div>
      </div>
    </div>
  );
};
