import React, { useState } from 'react';
import { BookOpen, ZoomIn, ZoomOut, ChevronDown, ChevronUp } from 'lucide-react';

interface PassageViewerProps {
  passageText: string;
  title?: string;
}

export const PassageViewer: React.FC<PassageViewerProps> = ({ passageText, title = 'Reading Passage' }) => {
  const [fontSize, setFontSize] = useState<'normal' | 'large' | 'xlarge'>('normal');
  const [isCollapsed, setIsCollapsed] = useState<boolean>(false);

  const getFontSizeClass = () => {
    switch (fontSize) {
      case 'large':
        return 'text-base leading-relaxed';
      case 'xlarge':
        return 'text-lg leading-loose';
      default:
        return 'text-sm leading-relaxed';
    }
  };

  return (
    <div className="mb-4 rounded-xl border border-emerald-500/30 bg-emerald-950/20 backdrop-blur-sm overflow-hidden transition-all">
      {/* Passage Header */}
      <div className="flex items-center justify-between px-4 py-2.5 bg-emerald-950/40 border-b border-emerald-500/20">
        <div className="flex items-center gap-2 text-emerald-400 font-semibold text-xs uppercase tracking-wider">
          <BookOpen className="w-3.5 h-3.5" />
          <span>{title}</span>
        </div>

        <div className="flex items-center gap-1.5">
          {/* Font Controls */}
          <button
            onClick={() => setFontSize(prev => (prev === 'xlarge' ? 'large' : 'normal'))}
            disabled={fontSize === 'normal'}
            className="p-1 rounded text-slate-400 hover:text-white disabled:opacity-30 transition"
            title="Decrease text size"
          >
            <ZoomOut className="w-3.5 h-3.5" />
          </button>
          <span className="text-[10px] font-mono text-slate-400 uppercase">
            {fontSize}
          </span>
          <button
            onClick={() => setFontSize(prev => (prev === 'normal' ? 'large' : 'xlarge'))}
            disabled={fontSize === 'xlarge'}
            className="p-1 rounded text-slate-400 hover:text-white disabled:opacity-30 transition"
            title="Increase text size"
          >
            <ZoomIn className="w-3.5 h-3.5" />
          </button>

          <div className="w-[1px] h-3 bg-slate-700 mx-1" />

          {/* Collapse/Expand Toggle */}
          <button
            onClick={() => setIsCollapsed(prev => !prev)}
            className="p-1 rounded text-slate-400 hover:text-white transition"
            title={isCollapsed ? 'Expand Passage' : 'Collapse Passage'}
          >
            {isCollapsed ? <ChevronDown className="w-4 h-4" /> : <ChevronUp className="w-4 h-4" />}
          </button>
        </div>
      </div>

      {/* Passage Body */}
      {!isCollapsed && (
        <div className={`p-4 text-slate-200 ${getFontSizeClass()} font-serif whitespace-pre-line selection:bg-emerald-500/30`}>
          {passageText}
        </div>
      )}
    </div>
  );
};
