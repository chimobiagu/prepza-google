import React from 'react';
import { useApp } from '../context/AppContext';
import { MainTab } from '../types';
import { Home, Layers, BarChart3, BookOpen, Bot } from 'lucide-react';

export const TabNavigation: React.FC = () => {
  const { mainTab, setMainTab, activeScreen, setActiveScreen } = useApp();

  const tabs: { key: MainTab; label: string; icon: React.ComponentType<{ className?: string }> }[] = [
    { key: 'HOME', label: 'Home', icon: Home },
    { key: 'PRACTICE', label: 'Practice & CBT', icon: Layers },
    { key: 'PROGRESS', label: 'Analytics', icon: BarChart3 },
    { key: 'LIBRARY', label: 'Literature', icon: BookOpen }
  ];

  const handleSelectTab = (tab: MainTab) => {
    setActiveScreen('MAIN_TABS');
    setMainTab(tab);
  };

  return (
    <nav className="fixed bottom-0 left-0 right-0 z-30 bg-slate-950/95 border-t border-slate-800/80 backdrop-blur-lg py-2 px-3 sm:px-8">
      <div className="max-w-md mx-auto flex items-center justify-between">
        {tabs.map(item => {
          const Icon = item.icon;
          const isActive = activeScreen === 'MAIN_TABS' && mainTab === item.key;
          return (
            <button
              key={item.key}
              onClick={() => handleSelectTab(item.key)}
              className={`flex flex-col items-center justify-center gap-1 py-1 px-3 rounded-xl transition-all relative ${
                isActive
                  ? 'text-emerald-400 font-bold'
                  : 'text-slate-400 hover:text-slate-200 font-medium'
              }`}
            >
              <div className="relative">
                <Icon className={`w-5 h-5 transition-transform ${isActive ? 'scale-110' : ''}`} />
                {isActive && (
                  <span className="absolute -top-1 -right-1 w-2 h-2 rounded-full bg-emerald-500 animate-pulse" />
                )}
              </div>
              <span className="text-[11px] tracking-tight">{item.label}</span>
            </button>
          );
        })}

        {/* Floating AI Button in Tab Bar */}
        <button
          onClick={() => setActiveScreen('AI_TUTOR')}
          className={`flex flex-col items-center justify-center gap-1 py-1 px-3 rounded-xl transition-all ${
            activeScreen === 'AI_TUTOR'
              ? 'text-teal-400 font-bold'
              : 'text-slate-400 hover:text-teal-300 font-medium'
          }`}
        >
          <div className="relative p-1 rounded-lg bg-teal-500/10 border border-teal-500/30">
            <Bot className="w-4 h-4 text-teal-400" />
          </div>
          <span className="text-[11px] tracking-tight">AI Tutor</span>
        </button>
      </div>
    </nav>
  );
};
