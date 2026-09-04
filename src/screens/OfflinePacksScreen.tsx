import React from 'react';
import { useApp } from '../context/AppContext';
import {
  Download,
  ArrowLeft,
  CheckCircle2,
  Trash2,
  HardDrive,
  WifiOff,
  Sparkles
} from 'lucide-react';

export const OfflinePacksScreen: React.FC = () => {
  const { offlinePacks, toggleDownloadPack, setActiveScreen } = useApp();

  const downloadedPacks = offlinePacks.filter(p => p.isDownloaded);
  const totalMb = downloadedPacks.reduce((sum, p) => sum + p.sizeMb, 0);
  const totalQuestions = downloadedPacks.reduce((sum, p) => sum + p.questionCount, 0);

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

        <div className="flex items-center gap-2 text-xs text-emerald-400 font-mono">
          <WifiOff className="w-4 h-4" />
          <span>100% Offline Ready</span>
        </div>
      </div>

      {/* Header Info */}
      <div className="p-6 rounded-3xl bg-slate-900 border border-slate-800 space-y-3">
        <div className="flex items-center gap-2 text-xs font-bold uppercase tracking-wider text-emerald-400">
          <Download className="w-4 h-4" />
          <span>Offline Question Packs</span>
        </div>
        <h1 className="text-2xl font-black text-white">Zero-Data Offline Study</h1>
        <p className="text-xs text-slate-300 leading-relaxed">
          Download complete verified UTME question banks to your device. Practice CBT mocks and study anywhere without needing mobile data or WiFi.
        </p>

        {/* Meter */}
        <div className="p-4 rounded-2xl bg-slate-950 border border-slate-800 flex items-center justify-between">
          <div className="flex items-center gap-3">
            <div className="p-2.5 rounded-xl bg-emerald-500/20 text-emerald-400">
              <HardDrive className="w-5 h-5" />
            </div>
            <div>
              <div className="text-xs font-bold text-white">Local Offline Storage</div>
              <div className="text-[11px] text-slate-400">
                {downloadedPacks.length} subjects downloaded ({totalQuestions.toLocaleString()} questions)
              </div>
            </div>
          </div>

          <div className="text-right">
            <div className="text-base font-black text-emerald-400 font-mono">{totalMb.toFixed(1)} MB</div>
            <div className="text-[10px] text-slate-500">Cached on device</div>
          </div>
        </div>
      </div>

      {/* Packs List */}
      <div className="space-y-3">
        {offlinePacks.map(pack => (
          <div
            key={pack.subjectId}
            className="p-4 rounded-2xl bg-slate-900 border border-slate-800 flex items-center justify-between transition hover:border-slate-700"
          >
            <div>
              <div className="flex items-center gap-2">
                <span className="text-sm font-bold text-white">{pack.subjectName}</span>
                {pack.isDownloaded && (
                  <span className="flex items-center gap-1 text-[10px] font-bold px-2 py-0.5 rounded-full bg-emerald-950 text-emerald-400 border border-emerald-900">
                    <CheckCircle2 className="w-3 h-3" />
                    <span>Installed</span>
                  </span>
                )}
              </div>
              <div className="text-xs text-slate-400 mt-0.5">
                {pack.questionCount.toLocaleString()} Verified UTME Questions • {pack.sizeMb} MB
              </div>
            </div>

            <button
              onClick={() => toggleDownloadPack(pack.subjectId)}
              className={`px-4 py-2 rounded-xl text-xs font-bold transition flex items-center gap-1.5 ${
                pack.isDownloaded
                  ? 'bg-slate-800 hover:bg-red-950/60 hover:text-red-300 text-slate-300'
                  : 'bg-emerald-500 hover:bg-emerald-400 text-slate-950 font-black shadow-md shadow-emerald-950/40'
              }`}
            >
              {pack.isDownloaded ? (
                <>
                  <Trash2 className="w-3.5 h-3.5" />
                  <span>Remove</span>
                </>
              ) : (
                <>
                  <Download className="w-3.5 h-3.5" />
                  <span>Download</span>
                </>
              )}
            </button>
          </div>
        ))}
      </div>
    </div>
  );
};
