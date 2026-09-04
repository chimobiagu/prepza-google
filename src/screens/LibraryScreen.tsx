import React, { useState } from 'react';
import { useApp } from '../context/AppContext';
import { LiteratureBook } from '../types';
import { SEED_LEARNING_PACKS } from '../data/learningPacks';
import {
  BookOpen,
  Feather,
  ChevronRight,
  ArrowLeft,
  Sparkles,
  Volume2,
  Users,
  CheckCircle2,
  Layers,
  HelpCircle
} from 'lucide-react';

export const LibraryScreen: React.FC = () => {
  const {
    literatureBooks,
    activeBook,
    setActiveBook,
    updateReadingProgress,
    speakText,
    startPractice,
    questions
  } = useApp();

  const [selectedTab, setSelectedTab] = useState<'BOOKS' | 'SYLLABUS_PACKS'>('BOOKS');
  const [selectedChapterIndex, setSelectedChapterIndex] = useState<number>(0);
  const [activePackId, setActivePackId] = useState<string | null>(null);
  const [activeCardIndex, setActiveCardIndex] = useState<number>(0);

  // If reading a specific book
  if (activeBook) {
    const chapter = activeBook.chapters[selectedChapterIndex] || activeBook.chapters[0];

    const handleNextChapter = () => {
      if (selectedChapterIndex < activeBook.chapters.length - 1) {
        const nextIdx = selectedChapterIndex + 1;
        setSelectedChapterIndex(nextIdx);
        updateReadingProgress(activeBook.id, nextIdx);
      }
    };

    const handlePrevChapter = () => {
      if (selectedChapterIndex > 0) {
        setSelectedChapterIndex(selectedChapterIndex - 1);
      }
    };

    const handleTestBookQuestions = () => {
      // Find questions related to this book/literature
      const bookQs = questions.filter(
        q => q.topic.toLowerCase().includes(activeBook.title.toLowerCase()) ||
             q.subject.toLowerCase().includes('literature') ||
             q.questionText.toLowerCase().includes(activeBook.title.toLowerCase())
      );
      if (bookQs.length > 0) {
        startPractice(bookQs);
      } else {
        startPractice(questions.slice(0, 10));
      }
    };

    return (
      <div className="pb-24 max-w-4xl mx-auto px-4 sm:px-6 pt-4 space-y-6 animate-fade-in">
        {/* Top bar */}
        <div className="flex items-center justify-between bg-slate-900 border border-slate-800 p-4 rounded-3xl">
          <button
            onClick={() => setActiveBook(null)}
            className="flex items-center gap-2 text-xs font-bold text-slate-300 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4" />
            <span>Back to Library</span>
          </button>

          <div className="flex items-center gap-2">
            <button
              onClick={() => speakText(chapter.content)}
              className="p-2 rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-300 hover:text-emerald-400 transition"
              title="Listen to Chapter (Audio Reader)"
            >
              <Volume2 className="w-4 h-4" />
            </button>
            <button
              onClick={handleTestBookQuestions}
              className="px-3 py-1.5 rounded-xl bg-emerald-500 hover:bg-emerald-400 text-slate-950 text-xs font-black transition"
            >
              Practice Exam Qs
            </button>
          </div>
        </div>

        {/* Book Header */}
        <div className="p-6 rounded-3xl bg-slate-900 border border-slate-800 space-y-2">
          <div className="flex items-center gap-2 text-xs font-bold text-amber-400 uppercase tracking-wider">
            <Feather className="w-4 h-4" />
            <span>{activeBook.category}</span>
          </div>
          <h1 className="text-2xl font-black text-white">{activeBook.title}</h1>
          <p className="text-xs text-slate-400">By {activeBook.author}</p>
          <div className="w-full h-1.5 rounded-full bg-slate-800 mt-4 overflow-hidden">
            <div
              className="h-full bg-emerald-500 rounded-full transition-all"
              style={{ width: `${activeBook.readingProgressPercent}%` }}
            />
          </div>
        </div>

        {/* Chapter Tabs */}
        <div className="flex items-center gap-2 overflow-x-auto pb-1">
          {activeBook.chapters.map((ch, idx) => (
            <button
              key={idx}
              onClick={() => {
                setSelectedChapterIndex(idx);
                updateReadingProgress(activeBook.id, idx);
              }}
              className={`px-3.5 py-2 rounded-2xl text-xs font-bold transition shrink-0 ${
                selectedChapterIndex === idx
                  ? 'bg-emerald-500 text-slate-950 shadow-md'
                  : 'bg-slate-900 text-slate-400 hover:text-slate-200 border border-slate-800'
              }`}
            >
              {ch.title.split(':')[0]}
            </button>
          ))}
        </div>

        {/* Chapter Content */}
        <div className="p-6 sm:p-8 rounded-3xl bg-slate-900/90 border border-slate-800 space-y-6">
          <h2 className="text-lg font-bold text-white border-b border-slate-800 pb-3">
            {chapter.title}
          </h2>

          <div className="font-serif text-slate-200 text-base sm:text-lg leading-relaxed whitespace-pre-line selection:bg-emerald-500/30">
            {chapter.content}
          </div>

          {/* Chapter Navigation */}
          <div className="flex items-center justify-between pt-6 border-t border-slate-800">
            <button
              onClick={handlePrevChapter}
              disabled={selectedChapterIndex === 0}
              className="px-4 py-2 rounded-xl bg-slate-800 hover:bg-slate-700 disabled:opacity-30 text-xs font-bold text-slate-300 transition"
            >
              &larr; Previous Chapter
            </button>

            <span className="text-xs text-slate-500">
              Chapter {selectedChapterIndex + 1} of {activeBook.chapters.length}
            </span>

            <button
              onClick={handleNextChapter}
              disabled={selectedChapterIndex === activeBook.chapters.length - 1}
              className="px-5 py-2 rounded-xl bg-emerald-500 hover:bg-emerald-400 disabled:opacity-30 text-xs font-black text-slate-950 transition"
            >
              Next Chapter &rarr;
            </button>
          </div>
        </div>

        {/* Character & Theme Analysis if available */}
        {activeBook.characters && activeBook.characters.length > 0 && (
          <div className="p-6 rounded-3xl bg-slate-900 border border-slate-800 space-y-4">
            <div className="flex items-center gap-2 text-xs font-bold uppercase tracking-wider text-emerald-400">
              <Users className="w-4 h-4" />
              <span>Key Characters & Exam Angles</span>
            </div>

            <div className="grid grid-cols-1 sm:grid-cols-2 gap-3">
              {activeBook.characters.map((char, i) => (
                <div key={i} className="p-3.5 rounded-2xl bg-slate-950 border border-slate-800/80 space-y-1">
                  <div className="flex items-center justify-between">
                    <span className="text-xs font-bold text-white">{char.name}</span>
                    <span className="text-[10px] text-amber-400 bg-amber-950/50 px-2 py-0.5 rounded-full border border-amber-900/40 font-mono">
                      {char.role}
                    </span>
                  </div>
                  <p className="text-[11px] text-slate-400 leading-snug">{char.description}</p>
                </div>
              ))}
            </div>
          </div>
        )}
      </div>
    );
  }

  // If viewing a syllabus pack
  const selectedPack = SEED_LEARNING_PACKS.find(p => p.id === activePackId);
  if (selectedPack) {
    const card = selectedPack.cards[activeCardIndex] || selectedPack.cards[0];

    return (
      <div className="pb-24 max-w-4xl mx-auto px-4 sm:px-6 pt-4 space-y-6 animate-fade-in">
        <div className="flex items-center justify-between bg-slate-900 border border-slate-800 p-4 rounded-3xl">
          <button
            onClick={() => setActivePackId(null)}
            className="flex items-center gap-2 text-xs font-bold text-slate-300 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4" />
            <span>Back to Syllabus Packs</span>
          </button>
          <span className="text-xs font-mono text-emerald-400">
            Card {activeCardIndex + 1} of {selectedPack.cards.length}
          </span>
        </div>

        <div className="p-6 rounded-3xl bg-slate-900 border border-slate-800 space-y-2">
          <span className="text-xs font-bold uppercase tracking-wider text-teal-400">
            {selectedPack.subject} • {selectedPack.groupName}
          </span>
          <h1 className="text-2xl font-black text-white">{selectedPack.topicName}</h1>
          <p className="text-xs text-slate-300">{selectedPack.overview}</p>
        </div>

        {/* Card Display */}
        <div className="p-8 rounded-3xl bg-gradient-to-b from-slate-900 to-slate-950 border border-emerald-500/30 shadow-2xl space-y-6 min-h-[300px] flex flex-col justify-between">
          <div className="space-y-4">
            <div className="flex items-center justify-between">
              <span className="text-xs font-mono uppercase tracking-wider px-2.5 py-1 rounded-full bg-emerald-500/10 text-emerald-400 border border-emerald-500/20">
                {card.cardType}
              </span>
              <button
                onClick={() => speakText(`${card.title}. ${card.content}`)}
                className="p-1.5 rounded-lg text-slate-400 hover:text-white"
              >
                <Volume2 className="w-4 h-4" />
              </button>
            </div>

            <h2 className="text-xl font-bold text-white">{card.title}</h2>
            <p className="text-sm text-slate-300 leading-relaxed font-sans">{card.content}</p>

            {card.formula && (
              <div className="p-4 rounded-2xl bg-slate-950 border border-emerald-500/40 text-center font-mono text-emerald-400 text-lg font-black tracking-wide">
                {card.formula}
              </div>
            )}

            {card.bulletPoints && card.bulletPoints.length > 0 && (
              <ul className="space-y-2 text-xs text-slate-300 pt-2">
                {card.bulletPoints.map((bp, i) => (
                  <li key={i} className="flex items-start gap-2">
                    <span className="w-1.5 h-1.5 rounded-full bg-emerald-500 mt-1.5 shrink-0" />
                    <span>{bp}</span>
                  </li>
                ))}
              </ul>
            )}

            {card.examTip && (
              <div className="p-3.5 rounded-2xl bg-amber-950/40 border border-amber-500/30 text-amber-200 text-xs leading-relaxed">
                <span className="font-bold text-amber-400">UTME Exam Tip: </span>
                {card.examTip}
              </div>
            )}
          </div>

          {/* Card Next / Prev */}
          <div className="flex items-center justify-between pt-6 border-t border-slate-800">
            <button
              onClick={() => setActiveCardIndex(Math.max(0, activeCardIndex - 1))}
              disabled={activeCardIndex === 0}
              className="px-4 py-2 rounded-xl bg-slate-800 hover:bg-slate-700 disabled:opacity-30 text-xs font-bold text-slate-300 transition"
            >
              &larr; Previous Card
            </button>

            <button
              onClick={() => setActiveCardIndex(Math.min(selectedPack.cards.length - 1, activeCardIndex + 1))}
              disabled={activeCardIndex === selectedPack.cards.length - 1}
              className="px-5 py-2 rounded-xl bg-emerald-500 hover:bg-emerald-400 disabled:opacity-30 text-xs font-black text-slate-950 transition"
            >
              Next Card &rarr;
            </button>
          </div>
        </div>
      </div>
    );
  }

  return (
    <div className="space-y-6 pb-24 max-w-5xl mx-auto px-4 sm:px-6 pt-4 animate-fade-in">
      {/* Header */}
      <div>
        <h1 className="text-2xl sm:text-3xl font-black text-white tracking-tight">
          Literature & Syllabus Library
        </h1>
        <p className="text-sm text-slate-400 mt-1">
          Official JAMB prescribed novels, poetry analyses, and high-yield flashcard decks.
        </p>
      </div>

      {/* Switcher Tabs */}
      <div className="flex items-center gap-2 border-b border-slate-800 pb-2">
        <button
          onClick={() => setSelectedTab('BOOKS')}
          className={`px-4 py-2 rounded-2xl text-xs font-bold transition ${
            selectedTab === 'BOOKS'
              ? 'bg-emerald-500 text-slate-950 shadow-md'
              : 'bg-slate-900 text-slate-400 hover:text-slate-200'
          }`}
        >
          Prescribed Novels & Texts
        </button>
        <button
          onClick={() => setSelectedTab('SYLLABUS_PACKS')}
          className={`px-4 py-2 rounded-2xl text-xs font-bold transition ${
            selectedTab === 'SYLLABUS_PACKS'
              ? 'bg-emerald-500 text-slate-950 shadow-md'
              : 'bg-slate-900 text-slate-400 hover:text-slate-200'
          }`}
        >
          Syllabus Flashcard Packs
        </button>
      </div>

      {/* Books Grid */}
      {selectedTab === 'BOOKS' ? (
        <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
          {literatureBooks.map(book => (
            <div
              key={book.id}
              onClick={() => {
                setActiveBook(book);
                setSelectedChapterIndex(book.lastReadChapterIndex || 0);
              }}
              className="group cursor-pointer rounded-3xl bg-slate-900 border border-slate-800 hover:border-emerald-500/50 p-6 space-y-4 hover:shadow-xl transition-all"
            >
              <div className="flex items-center justify-between">
                <span className="text-[10px] font-bold uppercase tracking-wider text-amber-300 bg-amber-500/10 px-2.5 py-0.5 rounded-full border border-amber-500/20">
                  {book.category}
                </span>
                <span className="text-xs text-emerald-400 font-bold">
                  {book.readingProgressPercent}% Read
                </span>
              </div>

              <div>
                <h2 className="text-lg font-black text-white group-hover:text-emerald-300 transition-colors">
                  {book.title}
                </h2>
                <p className="text-xs text-slate-400 mt-0.5">By {book.author}</p>
                <p className="text-xs text-slate-300 mt-2 leading-relaxed line-clamp-3">
                  {book.description}
                </p>
              </div>

              <div className="w-full h-1.5 rounded-full bg-slate-800 overflow-hidden">
                <div
                  className="h-full bg-emerald-500 rounded-full transition-all"
                  style={{ width: `${book.readingProgressPercent}%` }}
                />
              </div>

              <div className="flex items-center justify-between pt-2 text-xs font-bold text-emerald-400">
                <span>{book.chapters.length} Chapters & Summaries</span>
                <span className="flex items-center gap-1 group-hover:translate-x-1 transition-transform">
                  Read &rarr;
                </span>
              </div>
            </div>
          ))}
        </div>
      ) : (
        /* Syllabus Flashcard Packs Grid */
        <div className="grid grid-cols-1 sm:grid-cols-2 gap-4">
          {SEED_LEARNING_PACKS.map(pack => (
            <div
              key={pack.id}
              onClick={() => {
                setActivePackId(pack.id);
                setActiveCardIndex(0);
              }}
              className="group cursor-pointer rounded-3xl bg-slate-900 border border-slate-800 hover:border-teal-500/50 p-6 space-y-4 hover:shadow-xl transition-all"
            >
              <div className="flex items-center justify-between">
                <span className="text-[10px] font-bold uppercase tracking-wider text-teal-300 bg-teal-500/10 px-2.5 py-0.5 rounded-full border border-teal-500/20">
                  {pack.subject}
                </span>
                <span className="text-xs text-slate-400">
                  {pack.estimatedMinutes} mins
                </span>
              </div>

              <div>
                <h2 className="text-lg font-black text-white group-hover:text-teal-300 transition-colors">
                  {pack.topicName}
                </h2>
                <p className="text-xs text-slate-300 mt-2 leading-relaxed">
                  {pack.overview}
                </p>
              </div>

              <div className="flex items-center justify-between pt-2 text-xs font-bold text-teal-400">
                <span>{pack.cards.length} Flashcards & Traps</span>
                <span className="flex items-center gap-1 group-hover:translate-x-1 transition-transform">
                  Review Pack &rarr;
                </span>
              </div>
            </div>
          ))}
        </div>
      )}
    </div>
  );
};
