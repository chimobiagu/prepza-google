import React from 'react';
import { useApp } from '../context/AppContext';
import {
  Flame,
  Calendar,
  Layers,
  BookOpen,
  Bot,
  AlertTriangle,
  Bookmark,
  Sparkles,
  ChevronRight,
  TrendingUp,
  Download,
  Users,
  Target
} from 'lucide-react';

export const HomeScreen: React.FC = () => {
  const {
    profile,
    questions,
    startCbtExam,
    startPractice,
    setActiveScreen,
    setMainTab,
    mistakes,
    bookmarks,
    offlinePacks,
    friends
  } = useApp();

  const userSubjects = profile.jambSubjectsCsv.split(',').map(s => s.trim());

  // Compute days until JAMB exam
  const daysUntilExam = Math.max(
    0,
    Math.ceil((profile.jambExamDateTimestamp - Date.now()) / (1000 * 60 * 60 * 24))
  );

  const unmasteredMistakesCount = mistakes.filter(m => !m.isMastered).length;

  const handleStartQuickDrill = () => {
    // Filter questions by user's 4 subjects
    const relevant = questions.filter(q =>
      userSubjects.some(
        s => q.subject.toLowerCase() === s.toLowerCase() ||
             (s.toLowerCase().includes('english') && q.subject.toLowerCase().includes('english'))
      )
    );
    const pool = relevant.length > 0 ? relevant : questions;
    // Shuffle and pick 15
    const shuffled = [...pool].sort(() => 0.5 - Math.random()).slice(0, 15);
    startPractice(shuffled);
  };

  const handleStartFullCbt = () => {
    startCbtExam(userSubjects, 'Full 4-Subject UTME Mock Exam', 120);
  };

  return (
    <div className="space-y-6 pb-24 max-w-5xl mx-auto px-4 sm:px-6 pt-4 animate-fade-in">
      {/* Hero Welcome & Target Banner */}
      <div className="relative overflow-hidden rounded-3xl bg-gradient-to-br from-emerald-900 via-slate-900 to-slate-950 border border-emerald-500/30 p-6 sm:p-8 shadow-xl">
        <div className="absolute top-0 right-0 -mr-16 -mt-16 w-64 h-64 bg-emerald-500/10 rounded-full blur-3xl pointer-events-none" />

        <div className="relative z-10 flex flex-col md:flex-row md:items-center justify-between gap-6">
          <div>
            <div className="flex items-center gap-2 mb-2">
              <span className="text-xs font-bold uppercase tracking-wider text-emerald-400 bg-emerald-500/10 border border-emerald-500/20 px-2.5 py-1 rounded-full">
                Target: {profile.targetInstitution}
              </span>
              <span className="text-xs text-slate-400 font-medium">
                • {profile.dreamCourse}
              </span>
            </div>

            <h1 className="text-2xl sm:text-3xl font-black tracking-tight text-white">
              Welcome back, {profile.name.split(' ')[0]}! 👋
            </h1>
            <p className="text-sm text-slate-300 mt-1 max-w-xl leading-relaxed">
              Your personal road to a <span className="text-emerald-400 font-bold">{profile.targetScore}+</span> UTME score is active. Complete today's drill to maintain your streak!
            </p>
          </div>

          {/* Quick Exam Countdown & Stats Pill */}
          <div className="flex items-center gap-3 bg-slate-950/70 border border-slate-800 p-3.5 rounded-2xl shrink-0 backdrop-blur-md">
            <div className="p-2.5 rounded-xl bg-emerald-500/20 text-emerald-400">
              <Calendar className="w-6 h-6" />
            </div>
            <div>
              <div className="text-xs text-slate-400 font-semibold uppercase tracking-wider">
                JAMB UTME 2025
              </div>
              <div className="text-xl font-black text-white flex items-baseline gap-1">
                <span>{daysUntilExam}</span>
                <span className="text-xs font-medium text-slate-400">Days Left</span>
              </div>
            </div>
          </div>
        </div>

        {/* 4 Selected Subjects Badges */}
        <div className="mt-6 pt-4 border-t border-slate-800/80 flex flex-wrap items-center gap-2">
          <span className="text-xs text-slate-400 font-medium">Your 4 Subjects:</span>
          {userSubjects.map((sub, idx) => (
            <span
              key={idx}
              className="text-xs font-semibold px-2.5 py-1 rounded-lg bg-slate-800/90 text-emerald-300 border border-slate-700"
            >
              {sub}
            </span>
          ))}
        </div>
      </div>

      {/* Primary Action Bento Grid */}
      <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-4">
        {/* Full CBT Mock Exam */}
        <div
          onClick={handleStartFullCbt}
          className="group cursor-pointer rounded-2xl bg-gradient-to-br from-emerald-950/60 to-slate-900 border border-emerald-500/40 p-5 hover:border-emerald-400 hover:shadow-lg hover:shadow-emerald-900/20 transition-all"
        >
          <div className="flex items-center justify-between mb-3">
            <div className="p-3 rounded-xl bg-emerald-500/20 text-emerald-400 group-hover:scale-110 transition-transform">
              <Layers className="w-5 h-5" />
            </div>
            <span className="text-[10px] font-bold uppercase tracking-wider text-emerald-300 bg-emerald-500/10 px-2 py-0.5 rounded-full border border-emerald-500/20">
              Timed Mock
            </span>
          </div>
          <h2 className="text-base font-bold text-white group-hover:text-emerald-300 transition-colors">
            Full CBT Mock Exam
          </h2>
          <p className="text-xs text-slate-400 mt-1">
            Real UTME test simulation with 4 subjects, timer, and authentic question palette.
          </p>
          <div className="mt-4 flex items-center gap-1 text-xs font-bold text-emerald-400 group-hover:translate-x-1 transition-transform">
            <span>Launch CBT Simulator</span>
            <ChevronRight className="w-4 h-4" />
          </div>
        </div>

        {/* Daily Practice Drill */}
        <div
          onClick={handleStartQuickDrill}
          className="group cursor-pointer rounded-2xl bg-slate-900/80 border border-slate-800 p-5 hover:border-slate-700 hover:shadow-lg transition-all"
        >
          <div className="flex items-center justify-between mb-3">
            <div className="p-3 rounded-xl bg-blue-500/20 text-blue-400 group-hover:scale-110 transition-transform">
              <Sparkles className="w-5 h-5" />
            </div>
            <span className="text-[10px] font-bold uppercase tracking-wider text-blue-300 bg-blue-500/10 px-2 py-0.5 rounded-full border border-blue-500/20">
              15 Questions
            </span>
          </div>
          <h2 className="text-base font-bold text-white group-hover:text-blue-300 transition-colors">
            Daily Practice Drill
          </h2>
          <p className="text-xs text-slate-400 mt-1">
            Instant explanations, voice read-aloud, and topic mastery tracking.
          </p>
          <div className="mt-4 flex items-center gap-1 text-xs font-bold text-blue-400 group-hover:translate-x-1 transition-transform">
            <span>Start Quick Drill</span>
            <ChevronRight className="w-4 h-4" />
          </div>
        </div>

        {/* 24/7 AI Tutor */}
        <div
          onClick={() => setActiveScreen('AI_TUTOR')}
          className="group cursor-pointer rounded-2xl bg-slate-900/80 border border-teal-500/30 p-5 hover:border-teal-400 hover:shadow-lg transition-all"
        >
          <div className="flex items-center justify-between mb-3">
            <div className="p-3 rounded-xl bg-teal-500/20 text-teal-400 group-hover:scale-110 transition-transform">
              <Bot className="w-5 h-5" />
            </div>
            <span className="text-[10px] font-bold uppercase tracking-wider text-teal-300 bg-teal-500/10 px-2 py-0.5 rounded-full border border-teal-500/20">
              Gemini AI
            </span>
          </div>
          <h2 className="text-base font-bold text-white group-hover:text-teal-300 transition-colors">
            24/7 AI Study Tutor
          </h2>
          <p className="text-xs text-slate-400 mt-1">
            Ask complex derivations, Literature analysis, and high-frequency exam traps.
          </p>
          <div className="mt-4 flex items-center gap-1 text-xs font-bold text-teal-400 group-hover:translate-x-1 transition-transform">
            <span>Chat with Tutor</span>
            <ChevronRight className="w-4 h-4" />
          </div>
        </div>

        {/* Prescribed Literature Reader */}
        <div
          onClick={() => {
            setMainTab('LIBRARY');
            setActiveScreen('MAIN_TABS');
          }}
          className="group cursor-pointer rounded-2xl bg-slate-900/80 border border-slate-800 p-5 hover:border-amber-500/40 hover:shadow-lg transition-all"
        >
          <div className="flex items-center justify-between mb-3">
            <div className="p-3 rounded-xl bg-amber-500/20 text-amber-400 group-hover:scale-110 transition-transform">
              <BookOpen className="w-5 h-5" />
            </div>
            <span className="text-[10px] font-bold uppercase tracking-wider text-amber-300 bg-amber-500/10 px-2 py-0.5 rounded-full border border-amber-500/20">
              Novel Reader
            </span>
          </div>
          <h2 className="text-base font-bold text-white group-hover:text-amber-300 transition-colors">
            UTME Literature Reader
          </h2>
          <p className="text-xs text-slate-400 mt-1">
            "The Life Changer", "Second-Class Citizen", themes, and character breakdowns.
          </p>
          <div className="mt-4 flex items-center gap-1 text-xs font-bold text-amber-400 group-hover:translate-x-1 transition-transform">
            <span>Read Chapters</span>
            <ChevronRight className="w-4 h-4" />
          </div>
        </div>
      </div>

      {/* Secondary Modules: Mistake Bank, Bookmarks, Offline Packs, Leaderboard */}
      <div className="grid grid-cols-1 md:grid-cols-3 gap-4">
        {/* Mistake Bank Card */}
        <div
          onClick={() => setActiveScreen('MISTAKE_BANK')}
          className="cursor-pointer rounded-2xl bg-slate-900 border border-slate-800 p-5 hover:border-red-500/40 transition"
        >
          <div className="flex items-center justify-between mb-2">
            <div className="flex items-center gap-2">
              <div className="p-2 rounded-lg bg-red-500/20 text-red-400">
                <AlertTriangle className="w-4 h-4" />
              </div>
              <h2 className="text-sm font-bold text-white">Mistake Bank</h2>
            </div>
            <span className="text-xs font-bold px-2 py-0.5 rounded-md bg-red-950 text-red-300 border border-red-900">
              {unmasteredMistakesCount} Pending
            </span>
          </div>
          <p className="text-xs text-slate-400">
            Review and master past mistakes to avoid repeating them on exam day.
          </p>
        </div>

        {/* Bookmarked Questions */}
        <div
          onClick={() => setActiveScreen('BOOKMARKS')}
          className="cursor-pointer rounded-2xl bg-slate-900 border border-slate-800 p-5 hover:border-purple-500/40 transition"
        >
          <div className="flex items-center justify-between mb-2">
            <div className="flex items-center gap-2">
              <div className="p-2 rounded-lg bg-purple-500/20 text-purple-400">
                <Bookmark className="w-4 h-4" />
              </div>
              <h2 className="text-sm font-bold text-white">Saved Bookmarks</h2>
            </div>
            <span className="text-xs font-bold px-2 py-0.5 rounded-md bg-purple-950 text-purple-300 border border-purple-900">
              {bookmarks.length} Saved
            </span>
          </div>
          <p className="text-xs text-slate-400">
            Quickly access high-yield questions saved during practice.
          </p>
        </div>

        {/* Offline Packs */}
        <div
          onClick={() => setActiveScreen('OFFLINE_PACKS')}
          className="cursor-pointer rounded-2xl bg-slate-900 border border-slate-800 p-5 hover:border-emerald-500/40 transition"
        >
          <div className="flex items-center justify-between mb-2">
            <div className="flex items-center gap-2">
              <div className="p-2 rounded-lg bg-emerald-500/20 text-emerald-400">
                <Download className="w-4 h-4" />
              </div>
              <h2 className="text-sm font-bold text-white">Offline Packs</h2>
            </div>
            <span className="text-xs font-bold px-2 py-0.5 rounded-md bg-emerald-950 text-emerald-300 border border-emerald-900">
              {offlinePacks.filter(p => p.isDownloaded).length} Ready
            </span>
          </div>
          <p className="text-xs text-slate-400">
            Download subjects for offline practice with 0% data usage.
          </p>
        </div>
      </div>

      {/* Peer Leaderboard & Study Buddies Snippet */}
      <div className="rounded-2xl bg-slate-900/80 border border-slate-800 p-5">
        <div className="flex items-center justify-between mb-4">
          <div className="flex items-center gap-2">
            <Users className="w-5 h-5 text-emerald-400" />
            <h2 className="text-base font-bold text-white">Study Buddy Leaderboard</h2>
          </div>
          <button
            onClick={() => setActiveScreen('FRIENDS')}
            className="text-xs text-emerald-400 hover:text-emerald-300 font-semibold"
          >
            View All Friends &rarr;
          </button>
        </div>

        <div className="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-4 gap-3">
          {friends.slice(0, 4).map((friend, i) => (
            <div
              key={friend.id}
              className="flex items-center justify-between p-3 rounded-xl bg-slate-950 border border-slate-800"
            >
              <div className="flex items-center gap-2.5">
                <div className="w-7 h-7 rounded-full bg-slate-800 flex items-center justify-center text-xs font-bold text-slate-300">
                  #{i + 1}
                </div>
                <div>
                  <div className="text-xs font-bold text-slate-200">{friend.name}</div>
                  <div className="text-[10px] text-slate-400">{friend.accuracyPercent}% Accuracy</div>
                </div>
              </div>
              <div className="flex items-center gap-1 text-xs font-bold text-orange-400">
                <Flame className="w-3.5 h-3.5" />
                <span>{friend.streakDays}d</span>
              </div>
            </div>
          ))}
        </div>
      </div>
    </div>
  );
};
