import React, { useState } from 'react';
import { useApp } from '../context/AppContext';
import { SUBJECT_REGISTRY } from '../data/subjects';
import { X, Check, Save, RotateCcw, Award, Sparkles, Moon, Sun } from 'lucide-react';

export const AcademicSettingsModal: React.FC = () => {
  const {
    showSettingsModal,
    setShowSettingsModal,
    profile,
    updateProfile,
    themeMode,
    toggleTheme
  } = useApp();

  const [name, setName] = useState<string>(profile.name);
  const [targetScore, setTargetScore] = useState<number>(profile.targetScore);
  const [targetInstitution, setTargetInstitution] = useState<string>(profile.targetInstitution);
  const [dreamCourse, setDreamCourse] = useState<string>(profile.dreamCourse);
  const [studyGoalMinutes, setStudyGoalMinutes] = useState<number>(profile.studyGoalMinutesPerDay);

  const selectedSubjects = profile.jambSubjectsCsv.split(',').map(s => s.trim());
  const [currentSubjects, setCurrentSubjects] = useState<string[]>(selectedSubjects);

  if (!showSettingsModal) return null;

  const handleToggleSubject = (subjectName: string) => {
    if (subjectName.toLowerCase().includes('english')) {
      // English is compulsory in JAMB
      return;
    }

    if (currentSubjects.includes(subjectName)) {
      if (currentSubjects.length <= 2) return; // Keep at least 2
      setCurrentSubjects(prev => prev.filter(s => s !== subjectName));
    } else {
      if (currentSubjects.length >= 4) {
        // Swap out the last non-english one
        const withoutLast = currentSubjects.slice(0, 3);
        setCurrentSubjects([...withoutLast, subjectName]);
      } else {
        setCurrentSubjects(prev => [...prev, subjectName]);
      }
    }
  };

  const handleSave = () => {
    updateProfile({
      name,
      targetScore,
      targetInstitution,
      dreamCourse,
      studyGoalMinutesPerDay: studyGoalMinutes,
      jambSubjectsCsv: currentSubjects.join(',')
    });
    setShowSettingsModal(false);
  };

  const handleResetDefaults = () => {
    localStorage.clear();
    window.location.reload();
  };

  return (
    <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-black/75 backdrop-blur-sm overflow-y-auto">
      <div className="w-full max-w-xl bg-slate-900 border border-slate-700/80 rounded-2xl shadow-2xl text-white overflow-hidden my-6">
        {/* Header */}
        <div className="flex items-center justify-between px-6 py-4 bg-slate-800/80 border-b border-slate-700">
          <div className="flex items-center gap-2">
            <Award className="w-5 h-5 text-emerald-400" />
            <h2 className="text-base font-bold text-slate-100">Academic Profile & Preferences</h2>
          </div>
          <button
            onClick={() => setShowSettingsModal(false)}
            className="p-1 rounded-lg hover:bg-slate-700 text-slate-400 hover:text-white transition"
          >
            <X className="w-5 h-5" />
          </button>
        </div>

        {/* Content Body */}
        <div className="p-6 space-y-6 max-h-[75vh] overflow-y-auto">
          {/* Student Info */}
          <div className="grid grid-cols-1 sm:grid-cols-2 gap-4">
            <div>
              <label className="block text-xs font-semibold text-slate-400 uppercase tracking-wider mb-1.5">
                Candidate Name
              </label>
              <input
                type="text"
                value={name}
                onChange={e => setName(e.target.value)}
                className="w-full px-3.5 py-2.5 rounded-xl bg-slate-950 border border-slate-700 text-sm focus:border-emerald-500 focus:outline-none transition"
              />
            </div>

            <div>
              <label className="block text-xs font-semibold text-slate-400 uppercase tracking-wider mb-1.5">
                Target UTME Score (Max: 400)
              </label>
              <input
                type="number"
                min="180"
                max="400"
                value={targetScore}
                onChange={e => setTargetScore(Number(e.target.value))}
                className="w-full px-3.5 py-2.5 rounded-xl bg-slate-950 border border-slate-700 text-sm font-bold text-emerald-400 focus:border-emerald-500 focus:outline-none transition"
              />
            </div>
          </div>

          {/* Dream Course and University */}
          <div className="grid grid-cols-1 sm:grid-cols-2 gap-4">
            <div>
              <label className="block text-xs font-semibold text-slate-400 uppercase tracking-wider mb-1.5">
                Dream Course / Faculty
              </label>
              <input
                type="text"
                value={dreamCourse}
                onChange={e => setDreamCourse(e.target.value)}
                className="w-full px-3.5 py-2.5 rounded-xl bg-slate-950 border border-slate-700 text-sm focus:border-emerald-500 focus:outline-none transition"
              />
            </div>

            <div>
              <label className="block text-xs font-semibold text-slate-400 uppercase tracking-wider mb-1.5">
                Target Institution
              </label>
              <input
                type="text"
                value={targetInstitution}
                onChange={e => setTargetInstitution(e.target.value)}
                className="w-full px-3.5 py-2.5 rounded-xl bg-slate-950 border border-slate-700 text-sm focus:border-emerald-500 focus:outline-none transition"
              />
            </div>
          </div>

          {/* UTME Subject Combination */}
          <div>
            <div className="flex items-center justify-between mb-2">
              <label className="text-xs font-semibold text-slate-400 uppercase tracking-wider">
                UTME 4-Subject Combination ({currentSubjects.length}/4 Selected)
              </label>
              <span className="text-[11px] text-emerald-400 font-medium">
                English is compulsory
              </span>
            </div>

            <div className="grid grid-cols-2 sm:grid-cols-3 gap-2">
              {SUBJECT_REGISTRY.map(sub => {
                const isSelected = currentSubjects.some(
                  s => s.toLowerCase() === sub.displayName.toLowerCase() ||
                       (sub.displayName.toLowerCase().includes('english') && s.toLowerCase().includes('english'))
                );
                const isCompulsory = sub.isCoreCompulsory;

                return (
                  <button
                    key={sub.id}
                    type="button"
                    onClick={() => handleToggleSubject(sub.displayName)}
                    className={`flex items-center justify-between p-2.5 rounded-xl border text-xs font-medium transition text-left ${
                      isSelected
                        ? 'bg-emerald-950/60 border-emerald-500 text-emerald-300'
                        : 'bg-slate-950/60 border-slate-800 text-slate-400 hover:border-slate-700'
                    }`}
                  >
                    <span className="truncate pr-1">{sub.displayName}</span>
                    {isSelected && (
                      <span className="w-4 h-4 rounded-full bg-emerald-500 text-slate-950 flex items-center justify-center shrink-0">
                        <Check className="w-3 h-3 stroke-[3]" />
                      </span>
                    )}
                    {isCompulsory && !isSelected && (
                      <span className="text-[10px] text-amber-400 shrink-0">Req</span>
                    )}
                  </button>
                );
              })}
            </div>
          </div>

          {/* Daily Goal & App Theme */}
          <div className="grid grid-cols-1 sm:grid-cols-2 gap-4 pt-2">
            <div>
              <label className="block text-xs font-semibold text-slate-400 uppercase tracking-wider mb-1.5">
                Daily Study Goal (Minutes)
              </label>
              <input
                type="number"
                min="15"
                max="180"
                step="5"
                value={studyGoalMinutes}
                onChange={e => setStudyGoalMinutes(Number(e.target.value))}
                className="w-full px-3.5 py-2.5 rounded-xl bg-slate-950 border border-slate-700 text-sm focus:border-emerald-500 focus:outline-none transition"
              />
            </div>

            <div>
              <label className="block text-xs font-semibold text-slate-400 uppercase tracking-wider mb-1.5">
                Theme Display
              </label>
              <button
                type="button"
                onClick={toggleTheme}
                className="w-full flex items-center justify-between px-3.5 py-2.5 rounded-xl bg-slate-950 border border-slate-700 text-sm hover:border-slate-600 transition"
              >
                <span className="capitalize">{themeMode} Mode</span>
                {themeMode === 'dark' ? (
                  <Moon className="w-4 h-4 text-emerald-400" />
                ) : (
                  <Sun className="w-4 h-4 text-amber-400" />
                )}
              </button>
            </div>
          </div>

          {/* Referral Code */}
          <div className="p-3.5 rounded-xl bg-slate-950 border border-slate-800 flex items-center justify-between">
            <div>
              <div className="text-xs text-slate-400">Your Student Invite Code</div>
              <div className="text-sm font-bold font-mono text-emerald-400">{profile.myReferralCode}</div>
            </div>
            <div className="text-xs text-slate-400 text-right">
              <div>{profile.referralCount} Friends Invited</div>
              <span className="text-[11px] text-amber-400">+500 XP per buddy</span>
            </div>
          </div>
        </div>

        {/* Footer Actions */}
        <div className="flex items-center justify-between px-6 py-4 bg-slate-800/80 border-t border-slate-700">
          <button
            type="button"
            onClick={handleResetDefaults}
            className="flex items-center gap-1.5 text-xs text-red-400 hover:text-red-300 transition"
          >
            <RotateCcw className="w-3.5 h-3.5" />
            <span>Reset Cache</span>
          </button>

          <div className="flex items-center gap-3">
            <button
              type="button"
              onClick={() => setShowSettingsModal(false)}
              className="px-4 py-2 rounded-xl text-xs font-medium text-slate-300 hover:text-white bg-slate-800 hover:bg-slate-700 transition"
            >
              Cancel
            </button>
            <button
              type="button"
              onClick={handleSave}
              className="flex items-center gap-1.5 px-5 py-2 rounded-xl text-xs font-bold text-slate-950 bg-emerald-400 hover:bg-emerald-300 shadow-md shadow-emerald-900/30 transition"
            >
              <Save className="w-3.5 h-3.5" />
              <span>Save Changes</span>
            </button>
          </div>
        </div>
      </div>
    </div>
  );
};
