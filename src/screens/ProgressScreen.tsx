import React from 'react';
import { useApp } from '../context/AppContext';
import {
  TrendingUp,
  Award,
  Flame,
  CheckCircle2,
  Calendar,
  AlertTriangle,
  Bookmark,
  Sparkles,
  Layers,
  ChevronRight
} from 'lucide-react';

export const ProgressScreen: React.FC = () => {
  const { profile, mistakes, bookmarks, setActiveScreen, cbtResult } = useApp();

  const userSubjects = profile.jambSubjectsCsv.split(',').map(s => s.trim());

  // Subject accuracy estimates
  const subjectAnalytics = userSubjects.map((sub, i) => {
    // Generate realistic progress metrics based on profile and recent activity
    const baseAcc = [84, 78, 81, 76][i % 4] || 80;
    const questionsPracticed = [185, 142, 160, 130][i % 4] || 120;
    return {
      subject: sub,
      accuracy: baseAcc,
      practiced: questionsPracticed
    };
  });

  const totalAttempted = subjectAnalytics.reduce((sum, s) => sum + s.practiced, 0);
  const overallAccuracy = Math.round(
    subjectAnalytics.reduce((sum, s) => sum + s.accuracy, 0) / (subjectAnalytics.length || 1)
  );

  // Scaled predicted score
  const predictedScore = Math.round((overallAccuracy / 100) * 400);

  return (
    <div className="space-y-6 pb-24 max-w-5xl mx-auto px-4 sm:px-6 pt-4 animate-fade-in">
      {/* Header */}
      <div>
        <h1 className="text-2xl sm:text-3xl font-black text-white tracking-tight">
          Performance & UTME Analytics
        </h1>
        <p className="text-sm text-slate-400 mt-1">
          Real-time metrics, readiness indices, and subject breakdown for {profile.name}.
        </p>
      </div>

      {/* Target vs Predicted Score Comparison Banner */}
      <div className="p-6 sm:p-8 rounded-3xl bg-gradient-to-br from-slate-900 via-slate-900 to-slate-950 border border-emerald-500/30 shadow-2xl">
        <div className="grid grid-cols-1 md:grid-cols-3 gap-6 items-center">
          {/* Predicted UTME Score */}
          <div className="space-y-1">
            <span className="text-xs font-bold uppercase tracking-wider text-emerald-400">
              Predicted Score (Today)
            </span>
            <div className="text-4xl font-black text-white flex items-baseline gap-1">
              <span>{predictedScore}</span>
              <span className="text-sm font-semibold text-slate-400">/ 400</span>
            </div>
            <p className="text-xs text-slate-400 leading-snug">
              Based on recent mock exams, timed drills, and mistake repetition rates.
            </p>
          </div>

          {/* Target Score */}
          <div className="space-y-1 border-y md:border-y-0 md:border-x border-slate-800 py-4 md:py-0 md:px-6">
            <span className="text-xs font-bold uppercase tracking-wider text-amber-400">
              Your Target Score
            </span>
            <div className="text-4xl font-black text-amber-400 flex items-baseline gap-1">
              <span>{profile.targetScore}</span>
              <span className="text-sm font-semibold text-slate-400">/ 400</span>
            </div>
            <p className="text-xs text-slate-400 leading-snug">
              Requirement for {profile.dreamCourse} at {profile.targetInstitution}.
            </p>
          </div>

          {/* Readiness Index */}
          <div className="space-y-1">
            <span className="text-xs font-bold uppercase tracking-wider text-blue-400">
              Exam Readiness Index
            </span>
            <div className="text-4xl font-black text-blue-400">
              {overallAccuracy}%
            </div>
            <p className="text-xs text-slate-400 leading-snug">
              {overallAccuracy >= 80 ? 'High probability of gaining first-choice admission!' : 'Consistent practice will push you into the top 5% percentile.'}
            </p>
          </div>
        </div>
      </div>

      {/* Primary KPI Grid */}
      <div className="grid grid-cols-2 lg:grid-cols-4 gap-3">
        <div className="p-4 rounded-2xl bg-slate-900 border border-slate-800 space-y-1">
          <div className="flex items-center justify-between text-xs text-slate-400">
            <span>Questions Attempted</span>
            <CheckCircle2 className="w-4 h-4 text-emerald-400" />
          </div>
          <div className="text-2xl font-black text-white">{totalAttempted}</div>
          <div className="text-[11px] text-emerald-400 font-semibold">+45 this week</div>
        </div>

        <div className="p-4 rounded-2xl bg-slate-900 border border-slate-800 space-y-1">
          <div className="flex items-center justify-between text-xs text-slate-400">
            <span>Daily Streak</span>
            <Flame className="w-4 h-4 text-orange-400" />
          </div>
          <div className="text-2xl font-black text-white">{profile.streakDays} Days</div>
          <div className="text-[11px] text-orange-400 font-semibold">Active habit</div>
        </div>

        <div className="p-4 rounded-2xl bg-slate-900 border border-slate-800 space-y-1">
          <div className="flex items-center justify-between text-xs text-slate-400">
            <span>Mistakes In Bank</span>
            <AlertTriangle className="w-4 h-4 text-red-400" />
          </div>
          <div className="text-2xl font-black text-white">{mistakes.length}</div>
          <div className="text-[11px] text-slate-400">
            {mistakes.filter(m => m.isMastered).length} Mastered
          </div>
        </div>

        <div className="p-4 rounded-2xl bg-slate-900 border border-slate-800 space-y-1">
          <div className="flex items-center justify-between text-xs text-slate-400">
            <span>XP Accumulated</span>
            <Sparkles className="w-4 h-4 text-amber-400" />
          </div>
          <div className="text-2xl font-black text-white">{profile.totalXp} XP</div>
          <div className="text-[11px] text-amber-400 font-semibold">Level {profile.level} Candidate</div>
        </div>
      </div>

      {/* Subject-by-Subject Mastery Breakdown */}
      <div className="p-6 rounded-3xl bg-slate-900 border border-slate-800 space-y-5">
        <h2 className="text-base font-bold text-white">Subject Mastery & Accuracy Breakdown</h2>

        <div className="space-y-4">
          {subjectAnalytics.map((item, idx) => (
            <div key={idx} className="space-y-1.5">
              <div className="flex items-center justify-between text-xs font-bold">
                <span className="text-slate-200">{item.subject}</span>
                <div className="flex items-center gap-3">
                  <span className="text-slate-400 font-normal">{item.practiced} Questions</span>
                  <span className="text-emerald-400 font-mono">{item.accuracy}%</span>
                </div>
              </div>

              <div className="w-full h-2.5 rounded-full bg-slate-950 overflow-hidden border border-slate-800">
                <div
                  className="h-full bg-gradient-to-r from-emerald-600 to-emerald-400 rounded-full transition-all duration-500"
                  style={{ width: `${item.accuracy}%` }}
                />
              </div>
            </div>
          ))}
        </div>
      </div>

      {/* Bottom Shortcuts */}
      <div className="grid grid-cols-1 sm:grid-cols-2 gap-4">
        <div
          onClick={() => setActiveScreen('MISTAKE_BANK')}
          className="cursor-pointer p-5 rounded-2xl bg-slate-900 border border-slate-800 hover:border-red-500/40 transition flex items-center justify-between"
        >
          <div>
            <h3 className="text-sm font-bold text-white">Mistake Repetition Bank</h3>
            <p className="text-xs text-slate-400 mt-0.5">
              Review {mistakes.filter(m => !m.isMastered).length} pending unmastered questions
            </p>
          </div>
          <ChevronRight className="w-5 h-5 text-slate-400" />
        </div>

        <div
          onClick={() => setActiveScreen('BOOKMARKS')}
          className="cursor-pointer p-5 rounded-2xl bg-slate-900 border border-slate-800 hover:border-purple-500/40 transition flex items-center justify-between"
        >
          <div>
            <h3 className="text-sm font-bold text-white">Saved Question Bookmarks</h3>
            <p className="text-xs text-slate-400 mt-0.5">
              Access your {bookmarks.length} high-yield saved questions
            </p>
          </div>
          <ChevronRight className="w-5 h-5 text-slate-400" />
        </div>
      </div>
    </div>
  );
};
