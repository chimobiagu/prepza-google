import React, { useState } from 'react';
import { useApp } from '../context/AppContext';
import { PassageViewer } from '../components/PassageViewer';
import {
  Clock,
  Calculator,
  Flag,
  ChevronLeft,
  ChevronRight,
  AlertTriangle,
  CheckCircle2,
  X,
  Send,
  HelpCircle
} from 'lucide-react';

export const CbtExamScreen: React.FC = () => {
  const {
    activeExam,
    answerExamQuestion,
    toggleFlagExamQuestion,
    setExamCurrentIndex,
    setExamSubject,
    submitExam,
    quitExam,
    setIsCalculatorOpen,
    profile
  } = useApp();

  const [showSubmitModal, setShowSubmitModal] = useState<boolean>(false);
  const [showQuitModal, setShowQuitModal] = useState<boolean>(false);

  if (!activeExam) {
    return null;
  }

  const currentQ = activeExam.questions[activeExam.currentQuestionIndex];
  if (!currentQ) return null;

  // Format timer
  const hours = Math.floor(activeExam.timerSecondsRemaining / 3600);
  const minutes = Math.floor((activeExam.timerSecondsRemaining % 3600) / 60);
  const seconds = activeExam.timerSecondsRemaining % 60;
  const timeFormatted = `${String(hours).padStart(2, '0')}:${String(minutes).padStart(2, '0')}:${String(seconds).padStart(2, '0')}`;

  const isLowTime = activeExam.timerSecondsRemaining < 300; // < 5 mins

  const selectedAnswer = activeExam.userAnswers[currentQ.id];
  const isFlagged = activeExam.flaggedIndices.includes(activeExam.currentQuestionIndex);

  // Group questions by subject for the tabs
  const subjectList = activeExam.subjects;
  const answeredCount = Object.keys(activeExam.userAnswers).length;
  const totalQuestions = activeExam.questions.length;
  const unansweredCount = totalQuestions - answeredCount;
  const flaggedCount = activeExam.flaggedIndices.length;

  const optionLetters = ['A', 'B', 'C', 'D'];
  const options = [currentQ.optionA, currentQ.optionB, currentQ.optionC, currentQ.optionD];

  const handleNext = () => {
    if (activeExam.currentQuestionIndex < totalQuestions - 1) {
      setExamCurrentIndex(activeExam.currentQuestionIndex + 1);
    }
  };

  const handlePrev = () => {
    if (activeExam.currentQuestionIndex > 0) {
      setExamCurrentIndex(activeExam.currentQuestionIndex - 1);
    }
  };

  return (
    <div className="min-h-screen bg-slate-950 text-white flex flex-col font-sans">
      {/* Top Header: Candidate details, Timer, Controls */}
      <header className="sticky top-0 z-30 bg-slate-900 border-b border-slate-800 px-4 py-2.5 shadow-md">
        <div className="max-w-7xl mx-auto flex flex-wrap items-center justify-between gap-3">
          {/* Candidate Info */}
          <div className="flex items-center gap-3">
            <div className="w-8 h-8 rounded-full bg-emerald-600 flex items-center justify-center font-bold text-xs">
              {profile.name.charAt(0)}
            </div>
            <div>
              <div className="text-xs font-bold text-slate-100 flex items-center gap-1.5">
                <span>{profile.name}</span>
                <span className="text-[10px] text-emerald-400 font-mono">UTME-2025-9921</span>
              </div>
              <div className="text-[11px] text-slate-400">
                {activeExam.mode} • 4 Subjects
              </div>
            </div>
          </div>

          {/* Timer Display */}
          <div className={`flex items-center gap-2 px-3.5 py-1.5 rounded-xl border font-mono font-bold text-base transition-colors ${
            isLowTime
              ? 'bg-red-950/80 border-red-500 text-red-400 animate-pulse'
              : 'bg-slate-950 border-slate-800 text-emerald-400'
          }`}>
            <Clock className="w-4 h-4" />
            <span>{timeFormatted}</span>
          </div>

          {/* Calculator, Flag, Quit, Submit */}
          <div className="flex items-center gap-2">
            <button
              onClick={() => setIsCalculatorOpen(true)}
              className="flex items-center gap-1.5 px-3 py-1.5 rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-300 text-xs font-bold transition"
              title="Open JAMB Calculator"
            >
              <Calculator className="w-3.5 h-3.5" />
              <span className="hidden sm:inline">Calculator</span>
            </button>

            <button
              onClick={() => setShowQuitModal(true)}
              className="px-3 py-1.5 rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-400 hover:text-white text-xs font-medium transition"
            >
              Exit
            </button>

            <button
              onClick={() => setShowSubmitModal(true)}
              className="flex items-center gap-1.5 px-4 py-1.5 rounded-xl bg-emerald-500 hover:bg-emerald-400 text-slate-950 text-xs font-black uppercase tracking-wider shadow-md shadow-emerald-950/40 transition"
            >
              <Send className="w-3 h-3" />
              <span>Submit</span>
            </button>
          </div>
        </div>

        {/* Subject Tabs */}
        <div className="max-w-7xl mx-auto mt-2 pt-2 border-t border-slate-800 flex items-center gap-1.5 overflow-x-auto pb-1">
          {subjectList.map(sub => {
            const isActive = currentQ.subject.toLowerCase() === sub.toLowerCase() ||
              (sub.toLowerCase().includes('english') && currentQ.subject.toLowerCase().includes('english'));
            
            // Count answered in this subject
            const subQuestions = activeExam.questions.filter(
              q => q.subject.toLowerCase() === sub.toLowerCase() ||
                   (sub.toLowerCase().includes('english') && q.subject.toLowerCase().includes('english'))
            );
            const subAnswered = subQuestions.filter(q => activeExam.userAnswers[q.id] !== undefined).length;

            return (
              <button
                key={sub}
                onClick={() => setExamSubject(sub)}
                className={`px-3 py-1.5 rounded-xl text-xs font-bold transition shrink-0 flex items-center gap-2 border ${
                  isActive
                    ? 'bg-emerald-950 border-emerald-500 text-emerald-300 shadow-sm'
                    : 'bg-slate-950/80 border-slate-800 text-slate-400 hover:text-slate-200'
                }`}
              >
                <span>{sub}</span>
                <span className="text-[10px] px-1.5 py-0.2 rounded-full bg-slate-800 text-slate-300 font-mono">
                  {subAnswered}/{subQuestions.length}
                </span>
              </button>
            );
          })}
        </div>
      </header>

      {/* Main Examination Body */}
      <div className="flex-1 max-w-7xl w-full mx-auto p-4 sm:p-6 grid grid-cols-1 lg:grid-cols-12 gap-6">
        {/* Left Column: Question & Choices (8 Cols) */}
        <main className="lg:col-span-8 flex flex-col justify-between space-y-6">
          <div className="space-y-4">
            {/* Question status bar */}
            <div className="flex items-center justify-between bg-slate-900/60 p-3 rounded-2xl border border-slate-800">
              <div className="flex items-center gap-2">
                <span className="text-xs font-black text-emerald-400 uppercase tracking-wider">
                  Question {activeExam.currentQuestionIndex + 1} of {totalQuestions}
                </span>
                <span className="text-[11px] px-2 py-0.5 rounded bg-slate-800 text-slate-400 font-medium">
                  {currentQ.subject}
                </span>
              </div>

              <button
                onClick={() => toggleFlagExamQuestion(activeExam.currentQuestionIndex)}
                className={`flex items-center gap-1.5 px-3 py-1 rounded-xl text-xs font-bold border transition ${
                  isFlagged
                    ? 'bg-amber-950/80 border-amber-500 text-amber-300'
                    : 'bg-slate-800 border-slate-700 text-slate-400 hover:text-white'
                }`}
              >
                <Flag className="w-3.5 h-3.5" />
                <span>{isFlagged ? 'Flagged' : 'Flag Question'}</span>
              </button>
            </div>

            {/* Reading Passage if any */}
            {currentQ.passageText && (
              <PassageViewer
                passageText={currentQ.passageText}
                title={`${currentQ.subject} UTME Passage`}
              />
            )}

            {/* Question Text */}
            <div className="p-6 rounded-3xl bg-slate-900 border border-slate-800 shadow-xl space-y-6">
              <p className="text-base sm:text-lg font-semibold text-slate-100 leading-relaxed font-sans">
                {currentQ.questionText}
              </p>

              {/* Options */}
              <div className="space-y-3">
                {options.map((opt, idx) => {
                  const isSelected = selectedAnswer === idx;

                  return (
                    <button
                      key={idx}
                      onClick={() => answerExamQuestion(currentQ.id, idx)}
                      className={`w-full p-4 rounded-2xl border text-left flex items-start gap-3.5 transition-all text-sm ${
                        isSelected
                          ? 'bg-emerald-950/80 border-emerald-500 text-emerald-100 shadow-md shadow-emerald-950/40'
                          : 'bg-slate-950/70 border-slate-800 text-slate-300 hover:border-slate-700 hover:bg-slate-900/40'
                      }`}
                    >
                      <span className={`w-6 h-6 rounded-xl flex items-center justify-center text-xs font-bold shrink-0 mt-0.5 transition ${
                        isSelected ? 'bg-emerald-500 text-slate-950 font-black' : 'bg-slate-800 text-slate-400'
                      }`}>
                        {optionLetters[idx]}
                      </span>
                      <span className="flex-1 font-medium leading-normal">{opt}</span>
                    </button>
                  );
                })}
              </div>
            </div>
          </div>

          {/* Navigation Controls */}
          <div className="flex items-center justify-between pt-4 border-t border-slate-800">
            <button
              onClick={handlePrev}
              disabled={activeExam.currentQuestionIndex === 0}
              className="flex items-center gap-1.5 px-5 py-2.5 rounded-2xl bg-slate-800 hover:bg-slate-700 disabled:opacity-30 text-xs font-bold text-slate-200 transition"
            >
              <ChevronLeft className="w-4 h-4" />
              <span>Previous</span>
            </button>

            <span className="text-xs text-slate-400 hidden sm:inline font-mono">
              Question {activeExam.currentQuestionIndex + 1} / {totalQuestions}
            </span>

            <button
              onClick={handleNext}
              disabled={activeExam.currentQuestionIndex === totalQuestions - 1}
              className="flex items-center gap-1.5 px-6 py-2.5 rounded-2xl bg-emerald-500 hover:bg-emerald-400 disabled:opacity-30 text-xs font-black text-slate-950 shadow-md shadow-emerald-950/40 transition"
            >
              <span>Next</span>
              <ChevronRight className="w-4 h-4" />
            </button>
          </div>
        </main>

        {/* Right Column: Question Numbers Palette (4 Cols) */}
        <aside className="lg:col-span-4 bg-slate-900 border border-slate-800 rounded-3xl p-5 shadow-xl flex flex-col justify-between">
          <div className="space-y-4">
            <div className="flex items-center justify-between border-b border-slate-800 pb-3">
              <h2 className="text-xs font-bold uppercase tracking-wider text-slate-300">
                Question Palette
              </h2>
              <span className="text-xs font-mono text-emerald-400 font-bold">
                {answeredCount}/{totalQuestions} Answered
              </span>
            </div>

            {/* Legend */}
            <div className="grid grid-cols-2 gap-2 text-[11px] text-slate-400">
              <div className="flex items-center gap-1.5">
                <span className="w-3 h-3 rounded bg-emerald-500" />
                <span>Attempted ({answeredCount})</span>
              </div>
              <div className="flex items-center gap-1.5">
                <span className="w-3 h-3 rounded bg-slate-800 border border-slate-700" />
                <span>Unattempted ({unansweredCount})</span>
              </div>
              <div className="flex items-center gap-1.5">
                <span className="w-3 h-3 rounded bg-amber-500" />
                <span>Flagged ({flaggedCount})</span>
              </div>
              <div className="flex items-center gap-1.5">
                <span className="w-3 h-3 rounded border-2 border-emerald-400" />
                <span>Current</span>
              </div>
            </div>

            {/* Palette Grid */}
            <div className="grid grid-cols-5 sm:grid-cols-6 lg:grid-cols-5 gap-2 max-h-[48vh] overflow-y-auto p-1">
              {activeExam.questions.map((q, idx) => {
                const isCurrent = idx === activeExam.currentQuestionIndex;
                const isAnswered = activeExam.userAnswers[q.id] !== undefined;
                const hasFlag = activeExam.flaggedIndices.includes(idx);

                let btnStyle = 'bg-slate-950 border-slate-800 text-slate-400 hover:border-slate-700';

                if (isAnswered) {
                  btnStyle = 'bg-emerald-600 text-white border-emerald-500 font-bold';
                }
                if (hasFlag) {
                  btnStyle = 'bg-amber-600 text-slate-950 border-amber-400 font-bold';
                }
                if (isCurrent) {
                  btnStyle += ' ring-2 ring-emerald-400 ring-offset-2 ring-offset-slate-900 scale-105';
                }

                return (
                  <button
                    key={idx}
                    onClick={() => setExamCurrentIndex(idx)}
                    className={`h-9 rounded-xl border text-xs flex items-center justify-center transition ${btnStyle}`}
                  >
                    {idx + 1}
                  </button>
                );
              })}
            </div>
          </div>

          {/* Quick Submit Prompt */}
          <div className="pt-4 border-t border-slate-800">
            <button
              onClick={() => setShowSubmitModal(true)}
              className="w-full py-3 rounded-2xl bg-emerald-500 hover:bg-emerald-400 text-slate-950 font-black text-xs uppercase tracking-wider shadow-lg shadow-emerald-950/40 transition"
            >
              Submit Examination
            </button>
          </div>
        </aside>
      </div>

      {/* Confirmation Modal Before Submit */}
      {showSubmitModal && (
        <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-black/80 backdrop-blur-sm animate-fade-in">
          <div className="w-full max-w-md bg-slate-900 border border-slate-700 rounded-3xl p-6 shadow-2xl text-white space-y-4">
            <div className="flex items-center gap-3">
              <div className="p-3 rounded-2xl bg-emerald-500/20 text-emerald-400">
                <CheckCircle2 className="w-6 h-6" />
              </div>
              <div>
                <h2 className="text-lg font-bold">Submit Your UTME Exam?</h2>
                <p className="text-xs text-slate-400">Review your answered status before final submission</p>
              </div>
            </div>

            <div className="p-4 rounded-2xl bg-slate-950 border border-slate-800 space-y-2 text-xs">
              <div className="flex justify-between text-slate-300">
                <span>Total Questions:</span>
                <span className="font-bold">{totalQuestions}</span>
              </div>
              <div className="flex justify-between text-emerald-400">
                <span>Answered:</span>
                <span className="font-bold">{answeredCount}</span>
              </div>
              <div className="flex justify-between text-amber-400">
                <span>Unanswered:</span>
                <span className="font-bold">{unansweredCount}</span>
              </div>
              <div className="flex justify-between text-slate-400">
                <span>Flagged for review:</span>
                <span className="font-bold">{flaggedCount}</span>
              </div>
            </div>

            {unansweredCount > 0 && (
              <p className="text-xs text-amber-300/90 leading-relaxed bg-amber-950/40 border border-amber-500/20 p-3 rounded-xl">
                Notice: You have {unansweredCount} unanswered questions remaining. Once submitted, your scores and explanations will be generated immediately.
              </p>
            )}

            <div className="flex items-center gap-3 pt-2">
              <button
                onClick={() => setShowSubmitModal(false)}
                className="flex-1 py-3 rounded-2xl bg-slate-800 hover:bg-slate-700 text-slate-300 text-xs font-bold transition"
              >
                Continue Exam
              </button>
              <button
                onClick={() => {
                  setShowSubmitModal(false);
                  submitExam();
                }}
                className="flex-1 py-3 rounded-2xl bg-emerald-500 hover:bg-emerald-400 text-slate-950 text-xs font-black uppercase tracking-wider shadow-lg shadow-emerald-950/40 transition"
              >
                Yes, Submit
              </button>
            </div>
          </div>
        </div>
      )}

      {/* Quit Modal */}
      {showQuitModal && (
        <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-black/80 backdrop-blur-sm animate-fade-in">
          <div className="w-full max-w-sm bg-slate-900 border border-slate-700 rounded-3xl p-6 shadow-2xl text-white space-y-4">
            <div className="flex items-center gap-3">
              <div className="p-3 rounded-2xl bg-red-500/20 text-red-400">
                <AlertTriangle className="w-6 h-6" />
              </div>
              <div>
                <h2 className="text-base font-bold">Abandon Examination?</h2>
                <p className="text-xs text-slate-400">Your exam session will be terminated.</p>
              </div>
            </div>

            <div className="flex items-center gap-3 pt-2">
              <button
                onClick={() => setShowQuitModal(false)}
                className="flex-1 py-3 rounded-2xl bg-slate-800 hover:bg-slate-700 text-slate-300 text-xs font-bold transition"
              >
                Resume
              </button>
              <button
                onClick={() => {
                  setShowQuitModal(false);
                  quitExam();
                }}
                className="flex-1 py-3 rounded-2xl bg-red-600 hover:bg-red-500 text-white text-xs font-bold transition"
              >
                Quit Exam
              </button>
            </div>
          </div>
        </div>
      )}
    </div>
  );
};
