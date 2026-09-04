import React, { useState } from 'react';
import { useApp } from '../context/AppContext';
import {
  Users,
  ArrowLeft,
  Flame,
  Award,
  Copy,
  Check,
  UserPlus,
  Share2,
  Sparkles
} from 'lucide-react';

export const FriendsScreen: React.FC = () => {
  const { friends, profile, setActiveScreen } = useApp();
  const [copied, setCopied] = useState<boolean>(false);
  const [newFriendName, setNewFriendName] = useState<string>('');
  const [showAddModal, setShowAddModal] = useState<boolean>(false);

  const referralCode = 'PRZ-5821';

  const handleCopyCode = () => {
    navigator.clipboard.writeText(referralCode);
    setCopied(true);
    setTimeout(() => setCopied(false), 2000);
  };

  // Combine user with friends for leaderboard
  const allCandidates = [
    {
      id: 'current-user',
      name: `${profile.name} (You)`,
      accuracyPercent: 82,
      streakDays: profile.streakDays,
      level: profile.level,
      isCurrentUser: true
    },
    ...friends.map(f => ({ ...f, isCurrentUser: false }))
  ].sort((a, b) => b.accuracyPercent - a.accuracyPercent);

  return (
    <div className="pb-24 max-w-4xl mx-auto px-4 sm:px-6 pt-4 space-y-6 animate-fade-in">
      {/* Top Bar */}
      <div className="flex items-center justify-between bg-slate-900 border border-slate-800 p-4 rounded-3xl">
        <button
          onClick={() => setActiveScreen('MAIN_TABS')}
          className="flex items-center gap-2 text-xs font-bold text-slate-300 hover:text-white"
        >
          <ArrowLeft className="w-4 h-4" />
          <span>Back to Dashboard</span>
        </button>

        <button
          onClick={() => setShowAddModal(true)}
          className="flex items-center gap-1.5 px-3.5 py-1.5 rounded-xl bg-emerald-500 hover:bg-emerald-400 text-slate-950 text-xs font-black transition"
        >
          <UserPlus className="w-3.5 h-3.5" />
          <span>Add Study Buddy</span>
        </button>
      </div>

      {/* Header Info */}
      <div className="p-6 rounded-3xl bg-slate-900 border border-slate-800 space-y-4">
        <div className="flex items-center gap-2 text-xs font-bold uppercase tracking-wider text-emerald-400">
          <Users className="w-4 h-4" />
          <span>Collaborative UTME Prep</span>
        </div>
        <h1 className="text-2xl font-black text-white">Study Buddies & UTME Leaderboard</h1>
        <p className="text-xs text-slate-300 leading-relaxed">
          Study alongside friends, compare daily mock test accuracy, and motivate each other to reach your 300+ dream scores.
        </p>

        {/* Referral Card */}
        <div className="p-4 rounded-2xl bg-slate-950 border border-emerald-500/30 flex flex-col sm:flex-row sm:items-center justify-between gap-3">
          <div>
            <div className="text-xs font-bold text-white flex items-center gap-1.5">
              <Sparkles className="w-3.5 h-3.5 text-amber-400" />
              <span>Your Referral Code</span>
            </div>
            <div className="text-[11px] text-slate-400">
              Give friends 7 free days of Prepza Plus and earn 100 XP per signup.
            </div>
          </div>

          <div className="flex items-center gap-2">
            <span className="font-mono text-sm font-black px-3 py-1.5 rounded-xl bg-slate-900 border border-slate-700 text-emerald-400 tracking-wider">
              {referralCode}
            </span>
            <button
              onClick={handleCopyCode}
              className="p-2 rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-300 transition"
              title="Copy code"
            >
              {copied ? <Check className="w-4 h-4 text-emerald-400" /> : <Copy className="w-4 h-4" />}
            </button>
          </div>
        </div>
      </div>

      {/* Leaderboard Table */}
      <div className="p-6 rounded-3xl bg-slate-900 border border-slate-800 space-y-4">
        <div className="flex items-center justify-between border-b border-slate-800 pb-3">
          <h2 className="text-sm font-bold text-white uppercase tracking-wider">Weekly Ranking</h2>
          <span className="text-xs text-slate-400">Ranked by Mock Accuracy</span>
        </div>

        <div className="space-y-3">
          {allCandidates.map((c, idx) => (
            <div
              key={c.id}
              className={`p-4 rounded-2xl border flex items-center justify-between transition ${
                c.isCurrentUser
                  ? 'bg-emerald-950/60 border-emerald-500/60 text-white shadow-md'
                  : 'bg-slate-950 border-slate-800/80 text-slate-200'
              }`}
            >
              <div className="flex items-center gap-3">
                <div className={`w-8 h-8 rounded-full flex items-center justify-center text-xs font-black ${
                  idx === 0
                    ? 'bg-amber-500 text-slate-950'
                    : idx === 1
                    ? 'bg-slate-300 text-slate-950'
                    : idx === 2
                    ? 'bg-amber-700 text-white'
                    : 'bg-slate-800 text-slate-400'
                }`}>
                  #{idx + 1}
                </div>

                <div>
                  <div className="text-xs sm:text-sm font-bold flex items-center gap-2">
                    <span>{c.name}</span>
                    {c.isCurrentUser && (
                      <span className="text-[10px] px-2 py-0.2 rounded-full bg-emerald-500 text-slate-950 font-black">
                        You
                      </span>
                    )}
                  </div>
                  <div className="text-[11px] text-slate-400">Level {c.level} Scholar</div>
                </div>
              </div>

              <div className="flex items-center gap-4 text-right">
                <div className="flex items-center gap-1 text-xs font-bold text-orange-400">
                  <Flame className="w-3.5 h-3.5" />
                  <span>{c.streakDays}d</span>
                </div>

                <div className="min-w-[60px]">
                  <div className="text-sm font-black text-emerald-400 font-mono">
                    {c.accuracyPercent}%
                  </div>
                  <div className="text-[10px] text-slate-400">Accuracy</div>
                </div>
              </div>
            </div>
          ))}
        </div>
      </div>

      {/* Add Buddy Modal */}
      {showAddModal && (
        <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-black/80 backdrop-blur-sm animate-fade-in">
          <div className="w-full max-w-sm bg-slate-900 border border-slate-700 rounded-3xl p-6 shadow-2xl text-white space-y-4">
            <h2 className="text-base font-bold">Add Study Buddy</h2>
            <p className="text-xs text-slate-400">Enter your friend's JAMB registration number or Prepza handle</p>

            <input
              type="text"
              value={newFriendName}
              onChange={e => setNewFriendName(e.target.value)}
              placeholder="e.g. UTME-2025-4102 or @amina_b"
              className="w-full p-3 rounded-xl bg-slate-950 border border-slate-800 text-xs text-white placeholder-slate-500 focus:outline-none focus:border-emerald-500"
            />

            <div className="flex items-center gap-2 pt-2">
              <button
                onClick={() => setShowAddModal(false)}
                className="flex-1 py-2.5 rounded-xl bg-slate-800 text-xs font-bold text-slate-300"
              >
                Cancel
              </button>
              <button
                onClick={() => {
                  setShowAddModal(false);
                  setNewFriendName('');
                }}
                className="flex-1 py-2.5 rounded-xl bg-emerald-500 text-slate-950 text-xs font-black uppercase"
              >
                Send Request
              </button>
            </div>
          </div>
        </div>
      )}
    </div>
  );
};
