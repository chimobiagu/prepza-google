import React from 'react';
import { useApp } from '../context/AppContext';
import { PassageViewer } from '../components/PassageViewer';
import {
  ArrowLeft,
  Volume2,
  Bookmark,
  Bot,
  ChevronLeft,
  ChevronRight,
  CheckCircle2,
  XCircle,
  HelpCircle,
  Sparkles,
  Award
} from 'lucide-react';

export const QuestionPracticeScreen: React.FC = () => {
  const {
    practiceQuestions,
    practiceIndex,
    practiceAnswers,
    showPracticeExplanation,
    answerPractice,
    nextPractice,
    prevPractice,
    togglePracticeExplanation,
    setActiveScreen,
    toggleBookmark,
    isBookmarked,
    askAiAboutQuestion,
    speakText
  } = useApp();

  const currentQ = practiceQuestions[practiceIndex];

  if (!currentQ) {
    return (
      <div className="min-h-[60vh] flex flex-col items-center justify-center p-6 text-center text-white">
        <h2 className="text-xl font-bold">No questions loaded</h2>
        <button
          onClick={() => setActiveScreen('MAIN_TABS')}
          className="mt-4 px-4 py-2 bg-emerald-500 text-slate-950 font-bold rounded-xl"
        >
          Return to Home
        </button>
      </div>
    );
  }

  const selectedAnswer = practiceAnswers[currentQ.id];
  const isAnswered = selectedAnswer !== undefined;
  const isCorrect = selectedAnswer === currentQ.correctAnswerIndex;
  const bookmarked = isBookmarked(currentQ.id);

  const optionLetters = ['A', 'B', 'C', 'D'];
  const options = [currentQ.optionA, currentQ.optionB, currentQ.optionC, currentQ.optionD];

  const handleReadAloud = () => {
    let textToSpeak = `${currentQ.subject}. ${currentQ.questionText}. `;
    options.forEach((opt, idx) => {
      textToSpeak += `Option ${optionLetters[idx]}: ${opt}. `;
    });
    speakText(textToSpeak);
  };

  return (
    <div className="pb-24 max-w-4xl mx-auto px-4 sm:px-6 pt-4 animate-fade-in space-y-4">
      {/* Top Controls Bar */}
      <div className="flex items-center justify-between bg-slate-900/90 border border-slate-800 p-3 rounded-2xl backdrop-blur-md">
        <div className="flex items-center gap-3">
          <button
            onClick={() => setActiveScreen('MAIN_TABS')}
            className="p-2 rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-300 transition"
            title="Return"
          >
            <ArrowLeft className="w-4 h-4" />
          </button>
          <div>
            <div className="flex items-center gap-2">
              <span className="text-xs font-extrabold text-emerald-400 uppercase tracking-wider">
                {currentQ.subject}
              </span>
              <span className="text-[10px] px-2 py-0.5 rounded-full bg-slate-800 text-slate-400 border border-slate-700">
                {currentQ.topic}
              </span>
            </div>
            <div className="text-xs text-slate-400 mt-0.5">
              Question {practiceIndex + 1} of {practiceQuestions.length} • {currentQ.year}
            </div>
          </div>
        </div>

        <div className="flex items-center gap-2">
          {/* Read aloud TTS */}
          <button
            onClick={handleReadAloud}
            className="p-2 rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-300 hover:text-emerald-400 transition"
            title="Read Question Aloud (Speech)"
          >
            <Volume2 className="w-4 h-4" />
          </button>

          {/* Bookmark */}
          <button
            onClick={() => toggleBookmark(currentQ.id)}
            className={`p-2 rounded-xl border transition ${
              bookmarked
                ? 'bg-purple-950/60 border-purple-500 text-purple-300'
                : 'bg-slate-800 border-slate-700 text-slate-400 hover:text-white'
            }`}
            title="Save Bookmark"
          >
            <Bookmark className="w-4 h-4" />
          </button>
        </div>
      </div>

      {/* Reading Passage if available */}
      {currentQ.passageText && (
        <PassageViewer
          passageText={currentQ.passageText}
          title={`${currentQ.subject} Reading Passage`}
        />
      )}

      {/* Question Card */}
      <div className="p-6 rounded-3xl bg-slate-900 border border-slate-800 shadow-xl space-y-6">
        {/* Question Header & Prompt */}
        <div className="space-y-2">
          <div className="flex items-center justify-between text-[11px] text-slate-400 font-semibold uppercase tracking-wider">
            <span>{currentQ.originLabel || 'JAMB UTME Past Question'}</span>
            <span className="px-2 py-0.5 rounded bg-slate-800 text-slate-300">
              {currentQ.difficulty || 'Medium'}
            </span>
          </div>

          <h2 className="text-base sm:text-lg font-bold text-slate-100 leading-relaxed font-sans">
            {currentQ.questionText}
          </h2>
        </div>

        {/* Option Selection Grid */}
        <div className="space-y-3">
          {options.map((opt, idx) => {
            const isChosen = selectedAnswer === idx;
            const isCorrectOption = idx === currentQ.correctAnswerIndex;

            let cardStyle = 'bg-slate-950/80 border-slate-800 text-slate-200 hover:border-slate-700 hover:bg-slate-900/60';
            let badgeStyle = 'bg-slate-800 text-slate-300';

            if (isAnswered) {
              if (isCorrectOption) {
                cardStyle = 'bg-emerald-950/70 border-emerald-500 text-emerald-100 shadow-md shadow-emerald-950/30';
                badgeStyle = 'bg-emerald-500 text-slate-950 font-black';
              } else if (isChosen && !isCorrectOption) {
                cardStyle = 'bg-red-950/70 border-red-500 text-red-100 shadow-md shadow-red-950/30';
                badgeStyle = 'bg-red-500 text-white font-black';
              } else {
                cardStyle = 'bg-slate-950/40 border-slate-900 text-slate-500 opacity-60';
              }
            }

            return (
              <button
                key={idx}
                onClick={() => answerPractice(idx)}
                className={`w-full p-4 rounded-2xl border text-left flex items-start gap-3.5 transition-all text-sm ${cardStyle}`}
              >
                <span className={`w-6 h-6 rounded-xl flex items-center justify-center text-xs font-bold shrink-0 mt-0.5 transition ${badgeStyle}`}>
                  {optionLetters[idx]}
                </span>
                <span className="flex-1 font-medium leading-normal">{opt}</span>

                {isAnswered && isCorrectOption && (
                  <CheckCircle2 className="w-5 h-5 text-emerald-400 shrink-0 mt-0.5" />
                )}
                {isAnswered && isChosen && !isCorrectOption && (
                  <XCircle className="w-5 h-5 text-red-400 shrink-0 mt-0.5" />
                )}
              </button>
            );
          })}
        </div>

        {/* Feedback Banner & Explanation */}
        {isAnswered && (
          <div className="pt-2 space-y-4">
            <div className={`p-4 rounded-2xl flex items-center justify-between border ${
              isCorrect
                ? 'bg-emerald-950/40 border-emerald-500/40 text-emerald-300'
                : 'bg-red-950/40 border-red-500/40 text-red-300'
            }`}>
              <div className="flex items-center gap-2 font-bold text-sm">
                {isCorrect ? (
                  <>
                    <CheckCircle2 className="w-5 h-5 text-emerald-400" />
                    <span>Correct! Great work! (+10 XP)</span>
                  </>
                ) : (
                  <>
                    <XCircle className="w-5 h-5 text-red-400" />
                    <span>Incorrect • Correct option is {optionLetters[currentQ.correctAnswerIndex]}</span>
                  </>
                )}
              </div>

              <button
                onClick={togglePracticeExplanation}
                className="text-xs underline font-semibold hover:brightness-125"
              >
                {showPracticeExplanation ? 'Hide Explanation' : 'View Explanation'}
              </button>
            </div>

            {/* Explanation box */}
            {showPracticeExplanation && (
              <div className="p-5 rounded-2xl bg-slate-950 border border-emerald-500/20 text-slate-200 text-sm leading-relaxed space-y-2">
                <div className="flex items-center gap-2 text-xs font-bold text-emerald-400 uppercase tracking-wider">
                  <Sparkles className="w-4 h-4" />
                  <span>Step-by-Step Solution & UTME Insight</span>
                </div>
                <p className="whitespace-pre-line font-sans">{currentQ.explanation}</p>
              </div>
            )}
          </div>
        )}

        {/* Bottom Actions Bar */}
        <div className="pt-4 border-t border-slate-800 flex flex-wrap items-center justify-between gap-3">
          <button
            onClick={() => askAiAboutQuestion(currentQ)}
            className="flex items-center gap-1.5 px-3.5 py-2 rounded-xl bg-teal-950/60 hover:bg-teal-900/60 border border-teal-500/40 text-xs font-bold text-teal-300 transition"
          >
            <Bot className="w-4 h-4" />
            <span>Ask 24/7 AI Tutor to Explain</span>
          </button>

          <div className="flex items-center gap-2">
            <button
              onClick={prevPractice}
              disabled={practiceIndex === 0}
              className="flex items-center gap-1 px-4 py-2 rounded-xl bg-slate-800 hover:bg-slate-700 disabled:opacity-30 text-xs font-bold text-slate-200 transition"
            >
              <ChevronLeft className="w-4 h-4" />
              <span>Previous</span>
            </button>

            {practiceIndex < practiceQuestions.length - 1 ? (
              <button
                onClick={nextPractice}
                className="flex items-center gap-1 px-5 py-2 rounded-xl bg-emerald-500 hover:bg-emerald-400 text-xs font-black text-slate-950 shadow-md shadow-emerald-950/40 transition"
              >
                <span>Next Question</span>
                <ChevronRight className="w-4 h-4" />
              </button>
            ) : (
              <button
                onClick={() => setActiveScreen('MAIN_TABS')}
                className="flex items-center gap-1 px-5 py-2 rounded-xl bg-gradient-to-r from-emerald-500 to-green-600 text-xs font-black text-slate-950 shadow-md transition"
              >
                <Award className="w-4 h-4" />
                <span>Finish Practice Drill</span>
              </button>
            )}
          </div>
        </div>
      </div>
    </div>
  );
};
