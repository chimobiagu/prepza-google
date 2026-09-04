import React from 'react';
import { useApp } from '../context/AppContext';
import {
  Flame,
  Calculator,
  Moon,
  Sun,
  Crown,
  Settings,
  Sparkles,
  Bot
} from 'lucide-react';

export const Navbar: React.FC = () => {
  const {
    profile,
    daysRemainingInTrial,
    setShowUpgradeModal,
    setShowSettingsModal,
    setIsCalculatorOpen,
    themeMode,
    toggleTheme,
    setActiveScreen
  } = useApp();

  return (
    <header className="sticky top-0 z-40 w-full border-b border-slate-800/80 bg-slate-950/80 backdrop-blur-md px-4 py-3 sm:px-6 transition-colors">
      <div className="max-w-7xl mx-auto flex items-center justify-between gap-4">
        {/* Logo and Brand */}
        <div className="flex items-center gap-3">
          <div
            onClick={() => setActiveScreen('MAIN_TABS')}
            className="flex items-center gap-2.5 cursor-pointer group"
          >
            <div className="w-9 h-9 rounded-xl bg-gradient-to-br from-emerald-500 to-green-700 flex items-center justify-center shadow-lg shadow-emerald-900/30 text-white font-black text-xl tracking-tighter group-hover:scale-105 transition-transform">
              P
            </div>
            <div>
              <div className="flex items-center gap-1.5">
                <span className="font-extrabold text-lg tracking-tight text-white">
                  Prepza
                </span>
                <span className="text-[10px] uppercase font-bold tracking-wider px-1.5 py-0.5 rounded bg-emerald-500/20 text-emerald-400 border border-emerald-500/30">
                  UTME 2025
                </span>
              </div>
              <p className="text-[11px] text-slate-400 hidden sm:block">
                Target: {profile.targetScore}/400 • {profile.targetInstitution.split(' ')[0]}
              </p>
            </div>
          </div>
        </div>

        {/* Center/Right Stats & Controls */}
        <div className="flex items-center gap-2 sm:gap-3">
          {/* Trial / Plus Status Pill */}
          <button
            onClick={() => setShowUpgradeModal(true)}
            className={`flex items-center gap-1.5 text-xs font-semibold px-2.5 py-1.5 rounded-lg border transition-all ${
              profile.isPlusSubscriber
                ? 'bg-amber-500/10 text-amber-300 border-amber-500/30 hover:bg-amber-500/20'
                : 'bg-emerald-950/50 text-emerald-300 border-emerald-500/30 hover:bg-emerald-900/40'
            }`}
          >
            <Crown className="w-3.5 h-3.5 text-amber-400" />
            <span className="hidden sm:inline">
              {profile.isPlusSubscriber ? 'Plus Active' : `${daysRemainingInTrial} Days Trial`}
            </span>
            <span className="sm:hidden">
              {profile.isPlusSubscriber ? 'Plus' : `${daysRemainingInTrial}d`}
            </span>
          </button>

          {/* Daily Streak */}
          <div className="flex items-center gap-1 text-xs font-bold px-2.5 py-1.5 rounded-lg bg-orange-500/10 text-orange-400 border border-orange-500/20">
            <Flame className="w-4 h-4 text-orange-400 animate-pulse" />
            <span>{profile.streakDays}</span>
            <span className="text-[10px] text-orange-400/80 hidden sm:inline">Days</span>
          </div>

          {/* XP Badge */}
          <div className="hidden md:flex items-center gap-1 text-xs font-bold px-2.5 py-1.5 rounded-lg bg-blue-500/10 text-blue-400 border border-blue-500/20">
            <Sparkles className="w-3.5 h-3.5 text-blue-400" />
            <span>{profile.totalXp} XP</span>
          </div>

          {/* AI Tutor Quick Access */}
          <button
            onClick={() => setActiveScreen('AI_TUTOR')}
            className="flex items-center gap-1.5 text-xs font-medium px-2.5 py-1.5 rounded-lg bg-gradient-to-r from-emerald-600 to-teal-600 text-white hover:brightness-110 transition shadow-sm"
            title="Ask AI Study Coach"
          >
            <Bot className="w-3.5 h-3.5" />
            <span className="hidden sm:inline">24/7 AI Tutor</span>
          </button>

          {/* JAMB Calculator Button */}
          <button
            onClick={() => setIsCalculatorOpen(true)}
            className="p-2 rounded-lg text-slate-300 hover:text-white bg-slate-900/80 hover:bg-slate-800 border border-slate-700/60 transition"
            title="Open JAMB Standard CBT Calculator"
          >
            <Calculator className="w-4 h-4" />
          </button>

          {/* Dark / Light Toggle */}
          <button
            onClick={toggleTheme}
            className="p-2 rounded-lg text-slate-300 hover:text-white bg-slate-900/80 hover:bg-slate-800 border border-slate-700/60 transition"
            title="Toggle Light/Dark Theme"
          >
            {themeMode === 'dark' ? (
              <Sun className="w-4 h-4 text-amber-300" />
            ) : (
              <Moon className="w-4 h-4 text-slate-200" />
            )}
          </button>

          {/* Settings Button */}
          <button
            onClick={() => setShowSettingsModal(true)}
            className="p-2 rounded-lg text-slate-300 hover:text-white bg-slate-900/80 hover:bg-slate-800 border border-slate-700/60 transition"
            title="Academic Profile & Settings"
          >
            <Settings className="w-4 h-4" />
          </button>
        </div>
      </div>
    </header>
  );
};
