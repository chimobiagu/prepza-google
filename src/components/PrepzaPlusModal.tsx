import React from 'react';
import { useApp } from '../context/AppContext';
import { X, Crown, Check, Sparkles, Zap, ShieldCheck, Clock, FastForward } from 'lucide-react';

export const PrepzaPlusModal: React.FC = () => {
  const {
    showUpgradeModal,
    setShowUpgradeModal,
    profile,
    updateProfile,
    daysRemainingInTrial
  } = useApp();

  if (!showUpgradeModal) return null;

  const handleToggleSubscription = () => {
    updateProfile({ isPlusSubscriber: !profile.isPlusSubscriber });
  };

  const handleAdvanceDay = () => {
    updateProfile({
      simulatedDaysPassed: Math.min(profile.trialDurationDays, profile.simulatedDaysPassed + 3)
    });
  };

  const handleResetTrial = () => {
    updateProfile({
      simulatedDaysPassed: 0,
      isPlusSubscriber: false
    });
  };

  const plusFeatures = [
    { title: "24/7 AI Tutor Powered by Gemini", desc: "Unlimited deep explanations for STEM derivations, Literature analysis, and Speed revision." },
    { title: "Complete Verified Past Questions (2010 - 2024)", desc: "15,000+ authentic questions with detailed step-by-step solutions and traps." },
    { title: "Authentic JAMB CBT Simulator", desc: "Real 4-subject UTME test environment, question numbers grid, timer, and score predictive analytics." },
    { title: "Literature In English Audio & Reader", desc: "Full text of 'The Life Changer', 'Second-Class Citizen', character analysis, and themes." },
    { title: "Offline Study Packs", desc: "Download complete subject banks to study anytime with zero data consumption." },
    { title: "Intelligent Mistake Bank", desc: "Automatic tracking of incorrect answers with spaced repetition drills." }
  ];

  return (
    <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-black/80 backdrop-blur-sm overflow-y-auto animate-fade-in">
      <div className="w-full max-w-lg bg-gradient-to-b from-slate-900 via-slate-900 to-slate-950 border border-emerald-500/30 rounded-3xl shadow-2xl overflow-hidden text-white my-6">
        {/* Banner */}
        <div className="relative p-6 bg-gradient-to-r from-emerald-950 via-green-950 to-slate-900 border-b border-emerald-500/20">
          <button
            onClick={() => setShowUpgradeModal(false)}
            className="absolute top-4 right-4 p-1.5 rounded-full bg-slate-800/80 hover:bg-slate-700 text-slate-400 hover:text-white transition"
          >
            <X className="w-4 h-4" />
          </button>

          <div className="flex items-center gap-3 mb-2">
            <div className="p-2.5 rounded-2xl bg-amber-500/20 border border-amber-500/30 text-amber-400 shadow-inner">
              <Crown className="w-7 h-7" />
            </div>
            <div>
              <div className="flex items-center gap-2">
                <h2 className="text-xl font-black tracking-tight text-white">Prepza Plus</h2>
                <span className="text-[10px] uppercase font-bold tracking-wider px-2 py-0.5 rounded-full bg-amber-500/20 text-amber-300 border border-amber-500/30">
                  {profile.isPlusSubscriber ? 'Subscribed' : 'Free 30-Day Trial'}
                </span>
              </div>
              <p className="text-xs text-emerald-300/90 font-medium">
                The ultimate companion for scoring 300+ in JAMB UTME
              </p>
            </div>
          </div>

          {/* Trial Status Meter */}
          <div className="mt-4 p-3 rounded-2xl bg-slate-950/60 border border-emerald-500/20 flex items-center justify-between">
            <div className="flex items-center gap-2.5">
              <Clock className="w-4 h-4 text-emerald-400" />
              <div>
                <div className="text-xs font-bold text-slate-200">
                  {profile.isPlusSubscriber ? 'Plus Plan Active' : `${daysRemainingInTrial} Days Remaining`}
                </div>
                <div className="text-[11px] text-slate-400">
                  {profile.isPlusSubscriber ? 'Unrestricted access enabled' : 'Full access to all UTME subjects & AI Tutor'}
                </div>
              </div>
            </div>

            <div className="flex items-center gap-1.5">
              {!profile.isPlusSubscriber && (
                <button
                  onClick={handleAdvanceDay}
                  title="Simulate advancing +3 days for testing"
                  className="px-2 py-1 text-[11px] rounded-lg bg-slate-800 hover:bg-slate-700 text-slate-300 flex items-center gap-1 transition"
                >
                  <FastForward className="w-3 h-3" />
                  <span>+3d</span>
                </button>
              )}
              <button
                onClick={handleResetTrial}
                title="Reset trial timer"
                className="px-2 py-1 text-[11px] rounded-lg bg-slate-800 hover:bg-slate-700 text-slate-400 transition"
              >
                Reset
              </button>
            </div>
          </div>
        </div>

        {/* Feature List */}
        <div className="p-6 space-y-4 max-h-[50vh] overflow-y-auto">
          <div className="text-xs font-bold uppercase tracking-wider text-slate-400 mb-2">
            Everything Included in Prepza Plus:
          </div>

          {plusFeatures.map((feat, idx) => (
            <div key={idx} className="flex items-start gap-3 p-2.5 rounded-xl hover:bg-slate-800/40 transition">
              <div className="mt-0.5 p-1 rounded-full bg-emerald-500/20 text-emerald-400 shrink-0">
                <Check className="w-3.5 h-3.5 stroke-[3]" />
              </div>
              <div>
                <div className="text-xs font-bold text-slate-200">{feat.title}</div>
                <div className="text-[11px] text-slate-400 leading-snug">{feat.desc}</div>
              </div>
            </div>
          ))}
        </div>

        {/* Action Button */}
        <div className="p-6 bg-slate-950/80 border-t border-slate-800 flex flex-col gap-3">
          <button
            onClick={handleToggleSubscription}
            className={`w-full py-3.5 px-6 rounded-2xl font-extrabold text-sm flex items-center justify-center gap-2 shadow-lg transition-all ${
              profile.isPlusSubscriber
                ? 'bg-slate-800 hover:bg-slate-700 text-slate-300'
                : 'bg-gradient-to-r from-emerald-500 via-green-500 to-emerald-600 hover:brightness-110 text-slate-950 shadow-emerald-900/40'
            }`}
          >
            <Crown className="w-4 h-4" />
            <span>{profile.isPlusSubscriber ? 'Cancel / Revert to Free Trial' : 'Activate Prepza Plus (₦2,500 / Season)'}</span>
          </button>

          <p className="text-center text-[11px] text-slate-500">
            One-time payment per UTME academic session • Money-back guarantee if you don't hit 250+
          </p>
        </div>
      </div>
    </div>
  );
};
