import React, { useState } from 'react';
import { useApp } from '../context/AppContext';
import { SUBJECT_REGISTRY } from '../data/subjects';
import {
  Layers,
  BookOpen,
  Calendar,
  Sparkles,
  Zap,
  Play,
  Filter,
  CheckCircle2,
  Clock,
  HelpCircle
} from 'lucide-react';

export const PracticeScreen: React.FC = () => {
  const { profile, questions, startCbtExam, startPractice } = useApp();

  const userSubjects = profile.jambSubjectsCsv.split(',').map(s => s.trim());
  const [selectedMode, setSelectedMode] = useState<'CBT' | 'SUBJECT' | 'YEAR' | 'SPEED'>('CBT');
  const [selectedSubject, setSelectedSubject] = useState<string>(userSubjects[0] || 'English Language');
  const [selectedYear, setSelectedYear] = useState<string>('2024');
  const [questionCount, setQuestionCount] = useState<number>(20);

  const years = ['2024', '2023', '2022', '2021', '2020', '2019', '2018', '2017', '2016'];

  const handleLaunchSession = () => {
    if (selectedMode === 'CBT') {
      startCbtExam(userSubjects, 'Full 4-Subject UTME Mock Exam', 120);
      return;
    }

    let filtered = questions.filter(q => {
      const matchSubject = q.subject.toLowerCase() === selectedSubject.toLowerCase() ||
        (selectedSubject.toLowerCase().includes('english') && q.subject.toLowerCase().includes('english'));
      
      if (selectedMode === 'YEAR') {
        return matchSubject && q.year === selectedYear;
      }
      return matchSubject;
    });

    if (filtered.length === 0) {
      filtered = questions.slice(0, questionCount);
    }

    const shuffled = [...filtered].sort(() => 0.5 - Math.random()).slice(0, questionCount);
    startPractice(shuffled);
  };

  return (
    <div className="space-y-6 pb-24 max-w-5xl mx-auto px-4 sm:px-6 pt-4 animate-fade-in">
      {/* Header */}
      <div>
        <h1 className="text-2xl sm:text-3xl font-black text-white tracking-tight">
          Practice & CBT Simulator
        </h1>
        <p className="text-sm text-slate-400 mt-1">
          Select your training mode, subject focus, and question parameters.
        </p>
      </div>

      {/* Mode Selection Cards */}
      <div className="grid grid-cols-2 lg:grid-cols-4 gap-3">
        <button
          onClick={() => setSelectedMode('CBT')}
          className={`p-4 rounded-2xl border text-left transition-all ${
            selectedMode === 'CBT'
              ? 'bg-emerald-950/70 border-emerald-500 shadow-lg shadow-emerald-950/40 text-white'
              : 'bg-slate-900 border-slate-800 text-slate-300 hover:border-slate-700'
          }`}
        >
          <div className="flex items-center justify-between mb-2">
            <div className={`p-2 rounded-xl ${selectedMode === 'CBT' ? 'bg-emerald-500 text-slate-950' : 'bg-slate-800 text-slate-400'}`}>
              <Layers className="w-5 h-5" />
            </div>
            {selectedMode === 'CBT' && <CheckCircle2 className="w-4 h-4 text-emerald-400" />}
          </div>
          <div className="text-sm font-bold">Full CBT Mock</div>
          <div className="text-[11px] text-slate-400 mt-0.5">4 subjects • 120 mins</div>
        </button>

        <button
          onClick={() => setSelectedMode('SUBJECT')}
          className={`p-4 rounded-2xl border text-left transition-all ${
            selectedMode === 'SUBJECT'
              ? 'bg-emerald-950/70 border-emerald-500 shadow-lg shadow-emerald-950/40 text-white'
              : 'bg-slate-900 border-slate-800 text-slate-300 hover:border-slate-700'
          }`}
        >
          <div className="flex items-center justify-between mb-2">
            <div className={`p-2 rounded-xl ${selectedMode === 'SUBJECT' ? 'bg-emerald-500 text-slate-950' : 'bg-slate-800 text-slate-400'}`}>
              <BookOpen className="w-5 h-5" />
            </div>
            {selectedMode === 'SUBJECT' && <CheckCircle2 className="w-4 h-4 text-emerald-400" />}
          </div>
          <div className="text-sm font-bold">Subject Drill</div>
          <div className="text-[11px] text-slate-400 mt-0.5">Focus on 1 subject</div>
        </button>

        <button
          onClick={() => setSelectedMode('YEAR')}
          className={`p-4 rounded-2xl border text-left transition-all ${
            selectedMode === 'YEAR'
              ? 'bg-emerald-950/70 border-emerald-500 shadow-lg shadow-emerald-950/40 text-white'
              : 'bg-slate-900 border-slate-800 text-slate-300 hover:border-slate-700'
          }`}
        >
          <div className="flex items-center justify-between mb-2">
            <div className={`p-2 rounded-xl ${selectedMode === 'YEAR' ? 'bg-emerald-500 text-slate-950' : 'bg-slate-800 text-slate-400'}`}>
              <Calendar className="w-5 h-5" />
            </div>
            {selectedMode === 'YEAR' && <CheckCircle2 className="w-4 h-4 text-emerald-400" />}
          </div>
          <div className="text-sm font-bold">Past Papers By Year</div>
          <div className="text-[11px] text-slate-400 mt-0.5">2010 to 2024 series</div>
        </button>

        <button
          onClick={() => setSelectedMode('SPEED')}
          className={`p-4 rounded-2xl border text-left transition-all ${
            selectedMode === 'SPEED'
              ? 'bg-emerald-950/70 border-emerald-500 shadow-lg shadow-emerald-950/40 text-white'
              : 'bg-slate-900 border-slate-800 text-slate-300 hover:border-slate-700'
          }`}
        >
          <div className="flex items-center justify-between mb-2">
            <div className={`p-2 rounded-xl ${selectedMode === 'SPEED' ? 'bg-emerald-500 text-slate-950' : 'bg-slate-800 text-slate-400'}`}>
              <Zap className="w-5 h-5" />
            </div>
            {selectedMode === 'SPEED' && <CheckCircle2 className="w-4 h-4 text-emerald-400" />}
          </div>
          <div className="text-sm font-bold">Speed Sprint</div>
          <div className="text-[11px] text-slate-400 mt-0.5">Rapid 10 Qs in 5 mins</div>
        </button>
      </div>

      {/* Configuration Area */}
      <div className="p-6 rounded-3xl bg-slate-900/90 border border-slate-800 space-y-6">
        {selectedMode === 'CBT' ? (
          <div className="p-4 rounded-2xl bg-emerald-950/30 border border-emerald-500/30 flex items-start gap-3">
            <div className="p-2 rounded-xl bg-emerald-500/20 text-emerald-400 shrink-0">
              <Clock className="w-5 h-5" />
            </div>
            <div>
              <h2 className="text-sm font-bold text-white">Authentic 4-Subject UTME Mock Simulation</h2>
              <p className="text-xs text-slate-300 mt-1 leading-relaxed">
                This mode bundles questions across your 4 chosen subjects: <span className="text-emerald-400 font-semibold">{userSubjects.join(', ')}</span>.
                It features standard 120-minute countdown timing, full question grid palette, question flagging, and an on-screen JAMB calculator.
              </p>
            </div>
          </div>
        ) : (
          <>
            {/* Subject Selector */}
            <div>
              <label className="block text-xs font-bold uppercase tracking-wider text-slate-400 mb-2">
                Select Subject
              </label>
              <div className="grid grid-cols-2 sm:grid-cols-3 md:grid-cols-4 gap-2">
                {SUBJECT_REGISTRY.map(sub => {
                  const isSelected = selectedSubject.toLowerCase() === sub.displayName.toLowerCase();
                  return (
                    <button
                      key={sub.id}
                      onClick={() => setSelectedSubject(sub.displayName)}
                      className={`p-3 rounded-xl border text-xs font-semibold text-left transition ${
                        isSelected
                          ? 'bg-emerald-950/70 border-emerald-500 text-emerald-300'
                          : 'bg-slate-950 border-slate-800 text-slate-400 hover:border-slate-700'
                      }`}
                    >
                      <div className="truncate">{sub.displayName}</div>
                      <div className="text-[10px] text-slate-400 font-normal mt-0.5">{sub.category}</div>
                    </button>
                  );
                })}
              </div>
            </div>

            {/* Year Selector (if Year mode) */}
            {selectedMode === 'YEAR' && (
              <div>
                <label className="block text-xs font-bold uppercase tracking-wider text-slate-400 mb-2">
                  Select Past Question Year
                </label>
                <div className="flex flex-wrap gap-2">
                  {years.map(yr => (
                    <button
                      key={yr}
                      onClick={() => setSelectedYear(yr)}
                      className={`px-4 py-2 rounded-xl border text-xs font-bold transition ${
                        selectedYear === yr
                          ? 'bg-emerald-500 text-slate-950 border-emerald-500'
                          : 'bg-slate-950 border-slate-800 text-slate-300 hover:border-slate-700'
                      }`}
                    >
                      {yr}
                    </button>
                  ))}
                </div>
              </div>
            )}

            {/* Question Count Selector */}
            <div>
              <label className="block text-xs font-bold uppercase tracking-wider text-slate-400 mb-2">
                Number of Questions
              </label>
              <div className="flex flex-wrap gap-2">
                {[10, 20, 30, 40].map(cnt => (
                  <button
                    key={cnt}
                    onClick={() => setQuestionCount(cnt)}
                    className={`px-4 py-2 rounded-xl border text-xs font-bold transition ${
                      questionCount === cnt
                        ? 'bg-emerald-500 text-slate-950 border-emerald-500'
                        : 'bg-slate-950 border-slate-800 text-slate-300 hover:border-slate-700'
                    }`}
                  >
                    {cnt} Questions
                  </button>
                ))}
              </div>
            </div>
          </>
        )}

        {/* Start Button */}
        <button
          onClick={handleLaunchSession}
          className="w-full py-4 px-6 rounded-2xl bg-gradient-to-r from-emerald-500 via-green-500 to-emerald-600 hover:brightness-110 text-slate-950 font-black text-sm uppercase tracking-wider flex items-center justify-center gap-2 shadow-xl shadow-emerald-950/50 transition-all hover:scale-[1.01]"
        >
          <Play className="w-4 h-4 fill-current" />
          <span>{selectedMode === 'CBT' ? 'Start Full CBT Mock Exam' : 'Start Practice Session'}</span>
        </button>
      </div>
    </div>
  );
};
