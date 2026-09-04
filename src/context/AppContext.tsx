import React, { createContext, useContext, useState, useEffect } from 'react';
import {
  ActiveScreen,
  MainTab,
  Question,
  UserProfile,
  ActiveExamState,
  CbtResult,
  MistakeItem,
  BookmarkItem,
  OfflinePack,
  LiteratureBook,
  Friend,
  TutorPersonaKey
} from '../types';
import {
  SEED_PROFILE,
  SEED_QUESTIONS,
  SEED_OFFLINE_PACKS,
  SEED_FRIENDS,
  SEED_LITERATURE_BOOKS,
  TUTOR_PERSONAS
} from '../data/defaultData';

export interface ChatMessage {
  id: string;
  sender: 'user' | 'ai';
  text: string;
  timestamp: number;
}

interface AppContextType {
  activeScreen: ActiveScreen;
  setActiveScreen: (screen: ActiveScreen) => void;
  mainTab: MainTab;
  setMainTab: (tab: MainTab) => void;
  profile: UserProfile;
  updateProfile: (updates: Partial<UserProfile>) => void;
  questions: Question[];
  
  // CBT Exam State
  activeExam: ActiveExamState | null;
  startCbtExam: (subjects: string[], modeName?: string, durationMinutes?: number) => void;
  answerExamQuestion: (questionId: string, optionIndex: number) => void;
  toggleFlagExamQuestion: (questionIndex: number) => void;
  setExamCurrentIndex: (index: number) => void;
  setExamSubject: (subject: string) => void;
  submitExam: () => void;
  quitExam: () => void;
  cbtResult: CbtResult | null;
  setCbtResult: (res: CbtResult | null) => void;

  // Single Question / Practice Drill State
  practiceQuestions: Question[];
  practiceIndex: number;
  practiceAnswers: Record<string, number>;
  showPracticeExplanation: boolean;
  startPractice: (questions: Question[], initialIndex?: number) => void;
  answerPractice: (optionIndex: number) => void;
  nextPractice: () => void;
  prevPractice: () => void;
  togglePracticeExplanation: () => void;

  // Mistake Bank
  mistakes: MistakeItem[];
  toggleMistakeMastered: (questionId: string) => void;
  practiceMistakes: () => void;

  // Bookmarks
  bookmarks: BookmarkItem[];
  toggleBookmark: (questionId: string) => void;
  isBookmarked: (questionId: string) => boolean;

  // Offline Packs
  offlinePacks: OfflinePack[];
  toggleDownloadPack: (subject: string) => void;

  // Literature
  literatureBooks: LiteratureBook[];
  activeBook: LiteratureBook | null;
  setActiveBook: (book: LiteratureBook | null) => void;
  updateReadingProgress: (bookId: string, chapterIndex: number) => void;

  // Friends & Social
  friends: Friend[];
  toggleFollowFriend: (friendId: string) => void;

  // AI Tutor
  selectedTutorPersona: TutorPersonaKey;
  setSelectedTutorPersona: (key: TutorPersonaKey) => void;
  aiMessages: ChatMessage[];
  isAiLoading: boolean;
  sendAiMessage: (text: string, contextQuestion?: Question) => Promise<void>;
  askAiAboutQuestion: (question: Question) => void;

  // Modals and Utilities
  isCalculatorOpen: boolean;
  setIsCalculatorOpen: (open: boolean) => void;
  showUpgradeModal: boolean;
  setShowUpgradeModal: (show: boolean) => void;
  showSettingsModal: boolean;
  setShowSettingsModal: (show: boolean) => void;
  themeMode: 'light' | 'dark';
  setThemeMode: (mode: 'light' | 'dark') => void;
  toggleTheme: () => void;
  speakText: (text: string) => void;
  daysRemainingInTrial: number;
}

const AppContext = createContext<AppContextType | undefined>(undefined);

export const AppProvider: React.FC<{ children: React.ReactNode }> = ({ children }) => {
  const [activeScreen, setActiveScreen] = useState<ActiveScreen>('MAIN_TABS');
  const [mainTab, setMainTab] = useState<MainTab>('HOME');

  // Load or initialize state from localStorage
  const [profile, setProfile] = useState<UserProfile>(() => {
    const saved = localStorage.getItem('prepza_profile');
    return saved ? JSON.parse(saved) : SEED_PROFILE;
  });

  const [questions] = useState<Question[]>(SEED_QUESTIONS);

  const [activeExam, setActiveExam] = useState<ActiveExamState | null>(() => {
    const saved = localStorage.getItem('prepza_active_exam');
    return saved ? JSON.parse(saved) : null;
  });

  const [cbtResult, setCbtResult] = useState<CbtResult | null>(() => {
    const saved = localStorage.getItem('prepza_cbt_result');
    return saved ? JSON.parse(saved) : null;
  });

  // Practice state
  const [practiceQuestions, setPracticeQuestions] = useState<Question[]>([]);
  const [practiceIndex, setPracticeIndex] = useState<number>(0);
  const [practiceAnswers, setPracticeAnswers] = useState<Record<string, number>>({});
  const [showPracticeExplanation, setShowPracticeExplanation] = useState<boolean>(false);

  // Mistakes
  const [mistakes, setMistakes] = useState<MistakeItem[]>(() => {
    const saved = localStorage.getItem('prepza_mistakes');
    return saved ? JSON.parse(saved) : [];
  });

  // Bookmarks
  const [bookmarks, setBookmarks] = useState<BookmarkItem[]>(() => {
    const saved = localStorage.getItem('prepza_bookmarks');
    return saved ? JSON.parse(saved) : [
      { questionId: 'mth_03', timestamp: Date.now() - 3600000, note: 'Review calculus derivative step' },
      { questionId: 'phy_01', timestamp: Date.now() - 7200000, note: 'Remember H_max formula' }
    ];
  });

  // Offline packs
  const [offlinePacks, setOfflinePacks] = useState<OfflinePack[]>(() => {
    const saved = localStorage.getItem('prepza_offline_packs');
    return saved ? JSON.parse(saved) : SEED_OFFLINE_PACKS;
  });

  // Literature
  const [literatureBooks, setLiteratureBooks] = useState<LiteratureBook[]>(() => {
    const saved = localStorage.getItem('prepza_literature_books');
    return saved ? JSON.parse(saved) : SEED_LITERATURE_BOOKS;
  });
  const [activeBook, setActiveBook] = useState<LiteratureBook | null>(null);

  // Friends
  const [friends, setFriends] = useState<Friend[]>(() => {
    const saved = localStorage.getItem('prepza_friends');
    return saved ? JSON.parse(saved) : SEED_FRIENDS;
  });

  // AI Tutor
  const [selectedTutorPersona, setSelectedTutorPersona] = useState<TutorPersonaKey>('GENERAL_COACH');
  const [aiMessages, setAiMessages] = useState<ChatMessage[]>([
    {
      id: 'welcome',
      sender: 'ai',
      text: TUTOR_PERSONAS[0].defaultGreeting,
      timestamp: Date.now()
    }
  ]);
  const [isAiLoading, setIsAiLoading] = useState<boolean>(false);

  // Modals & UI
  const [isCalculatorOpen, setIsCalculatorOpen] = useState<boolean>(false);
  const [showUpgradeModal, setShowUpgradeModal] = useState<boolean>(false);
  const [showSettingsModal, setShowSettingsModal] = useState<boolean>(false);
  const [themeMode, setThemeMode] = useState<'light' | 'dark'>(() => {
    const saved = localStorage.getItem('prepza_theme');
    return (saved as 'light' | 'dark') || 'dark';
  });

  // Persist important entities
  useEffect(() => {
    localStorage.setItem('prepza_profile', JSON.stringify(profile));
  }, [profile]);

  useEffect(() => {
    localStorage.setItem('prepza_mistakes', JSON.stringify(mistakes));
  }, [mistakes]);

  useEffect(() => {
    localStorage.setItem('prepza_bookmarks', JSON.stringify(bookmarks));
  }, [bookmarks]);

  useEffect(() => {
    localStorage.setItem('prepza_offline_packs', JSON.stringify(offlinePacks));
  }, [offlinePacks]);

  useEffect(() => {
    localStorage.setItem('prepza_theme', themeMode);
    if (themeMode === 'dark') {
      document.documentElement.classList.add('dark');
    } else {
      document.documentElement.classList.remove('dark');
    }
  }, [themeMode]);

  useEffect(() => {
    if (activeExam) {
      localStorage.setItem('prepza_active_exam', JSON.stringify(activeExam));
    } else {
      localStorage.removeItem('prepza_active_exam');
    }
  }, [activeExam]);

  // CBT Exam Timer effect
  useEffect(() => {
    if (!activeExam || activeExam.isCompleted) return;

    const timer = setInterval(() => {
      setActiveExam((prev) => {
        if (!prev || prev.isCompleted) return prev;
        if (prev.timerSecondsRemaining <= 1) {
          clearInterval(timer);
          // Auto submit when time runs out
          setTimeout(() => submitExam(), 0);
          return { ...prev, timerSecondsRemaining: 0, isCompleted: true };
        }
        return { ...prev, timerSecondsRemaining: prev.timerSecondsRemaining - 1 };
      });
    }, 1000);

    return () => clearInterval(timer);
  }, [activeExam?.isCompleted]);

  const updateProfile = (updates: Partial<UserProfile>) => {
    setProfile(prev => ({ ...prev, ...updates }));
  };

  const toggleTheme = () => {
    setThemeMode(prev => (prev === 'dark' ? 'light' : 'dark'));
  };

  const daysRemainingInTrial = Math.max(
    0,
    profile.isPlusSubscriber ? 999 : profile.trialDurationDays - profile.simulatedDaysPassed
  );

  // Start CBT Exam
  const startCbtExam = (chosenSubjects: string[], modeName = 'Full CBT Mock Exam', durationMinutes = 120) => {
    // Select questions for the subjects:
    // Filter questions by selected subjects
    const examQuestions: Question[] = [];
    chosenSubjects.forEach(sub => {
      const subQuestions = questions.filter(
        q => q.subject.toLowerCase() === sub.toLowerCase() ||
             (sub.toLowerCase().includes('english') && q.subject.toLowerCase().includes('english'))
      );
      if (subQuestions.length > 0) {
        // Take up to 20 per subject for realistic interactive mock test
        examQuestions.push(...subQuestions);
      }
    });

    // If pool is small, take all available matching
    const finalPool = examQuestions.length > 0 ? examQuestions : questions.slice(0, 20);

    const totalSeconds = durationMinutes * 60;
    const initialExamState: ActiveExamState = {
      mode: modeName,
      subjects: chosenSubjects,
      questions: finalPool,
      userAnswers: {},
      flaggedIndices: [],
      currentQuestionIndex: 0,
      selectedSubject: chosenSubjects[0] || finalPool[0]?.subject || 'English Language',
      timerSecondsRemaining: totalSeconds,
      totalDurationSeconds: totalSeconds,
      isCompleted: false
    };

    setActiveExam(initialExamState);
    setActiveScreen('CBT_EXAM');
  };

  const answerExamQuestion = (questionId: string, optionIndex: number) => {
    if (!activeExam || activeExam.isCompleted) return;
    setActiveExam(prev => {
      if (!prev) return prev;
      return {
        ...prev,
        userAnswers: { ...prev.userAnswers, [questionId]: optionIndex }
      };
    });
  };

  const toggleFlagExamQuestion = (questionIndex: number) => {
    if (!activeExam) return;
    setActiveExam(prev => {
      if (!prev) return prev;
      const flags = [...prev.flaggedIndices];
      const foundIdx = flags.indexOf(questionIndex);
      if (foundIdx > -1) {
        flags.splice(foundIdx, 1);
      } else {
        flags.push(questionIndex);
      }
      return { ...prev, flaggedIndices: flags };
    });
  };

  const setExamCurrentIndex = (index: number) => {
    if (!activeExam) return;
    const targetQ = activeExam.questions[index];
    setActiveExam(prev => prev ? {
      ...prev,
      currentQuestionIndex: index,
      selectedSubject: targetQ ? targetQ.subject : prev.selectedSubject
    } : null);
  };

  const setExamSubject = (subject: string) => {
    if (!activeExam) return;
    const firstIdx = activeExam.questions.findIndex(q => q.subject.toLowerCase() === subject.toLowerCase());
    setActiveExam(prev => prev ? {
      ...prev,
      selectedSubject: subject,
      currentQuestionIndex: firstIdx >= 0 ? firstIdx : prev.currentQuestionIndex
    } : null);
  };

  const submitExam = () => {
    if (!activeExam) return;

    let totalScore = 0;
    const subjectMap: Record<string, { score: number; total: number }> = {};

    activeExam.questions.forEach(q => {
      const chosen = activeExam.userAnswers[q.id];
      if (!subjectMap[q.subject]) {
        subjectMap[q.subject] = { score: 0, total: 0 };
      }
      subjectMap[q.subject].total += 1;

      if (chosen === q.correctAnswerIndex) {
        totalScore += 1;
        subjectMap[q.subject].score += 1;
      } else if (chosen !== undefined) {
        // Record into mistakes bank
        setMistakes(prev => {
          if (prev.some(m => m.questionId === q.id)) return prev;
          return [
            ...prev,
            {
              questionId: q.id,
              subject: q.subject,
              topic: q.topic,
              selectedWrongOptionIndex: chosen,
              timestamp: Date.now(),
              attemptCount: 1,
              isMastered: false
            }
          ];
        });
      }
    });

    const maxScore = activeExam.questions.length;
    const percentage = maxScore > 0 ? Math.round((totalScore / maxScore) * 100) : 0;
    const breakdowns = Object.entries(subjectMap).map(([subject, data]) => ({
      subject,
      score: data.score,
      total: data.total,
      percentage: data.total > 0 ? Math.round((data.score / data.total) * 100) : 0
    }));

    const result: CbtResult = {
      mode: activeExam.mode,
      totalScore,
      maxScore,
      percentage,
      durationSeconds: activeExam.totalDurationSeconds - activeExam.timerSecondsRemaining,
      breakdowns,
      questions: activeExam.questions,
      userAnswers: activeExam.userAnswers,
      flaggedQuestionIds: activeExam.flaggedIndices.map(i => activeExam.questions[i]?.id).filter(Boolean),
      timestamp: Date.now()
    };

    setCbtResult(result);
    setActiveExam(null);
    setActiveScreen('CBT_RESULTS');

    // Add XP to profile
    updateProfile({
      totalXp: profile.totalXp + totalScore * 10,
      streakDays: profile.streakDays + 1
    });
  };

  const quitExam = () => {
    setActiveExam(null);
    setActiveScreen('MAIN_TABS');
    setMainTab('PRACTICE');
  };

  // Practice state controls
  const startPractice = (items: Question[], initialIndex = 0) => {
    setPracticeQuestions(items);
    setPracticeIndex(initialIndex);
    setPracticeAnswers({});
    setShowPracticeExplanation(false);
    setActiveScreen('QUESTION_PRACTICE');
  };

  const answerPractice = (optionIndex: number) => {
    const q = practiceQuestions[practiceIndex];
    if (!q) return;

    setPracticeAnswers(prev => ({ ...prev, [q.id]: optionIndex }));
    setShowPracticeExplanation(true);

    if (optionIndex !== q.correctAnswerIndex) {
      setMistakes(prev => {
        const existing = prev.find(m => m.questionId === q.id);
        if (existing) {
          return prev.map(m => m.questionId === q.id ? { ...m, attemptCount: m.attemptCount + 1, isMastered: false } : m);
        }
        return [
          ...prev,
          {
            questionId: q.id,
            subject: q.subject,
            topic: q.topic,
            selectedWrongOptionIndex: optionIndex,
            timestamp: Date.now(),
            attemptCount: 1,
            isMastered: false
          }
        ];
      });
    }
  };

  const nextPractice = () => {
    if (practiceIndex < practiceQuestions.length - 1) {
      setPracticeIndex(prev => prev + 1);
      setShowPracticeExplanation(false);
    }
  };

  const prevPractice = () => {
    if (practiceIndex > 0) {
      setPracticeIndex(prev => prev - 1);
      setShowPracticeExplanation(false);
    }
  };

  const togglePracticeExplanation = () => {
    setShowPracticeExplanation(prev => !prev);
  };

  // Mistakes Bank
  const toggleMistakeMastered = (questionId: string) => {
    setMistakes(prev =>
      prev.map(m => (m.questionId === questionId ? { ...m, isMastered: !m.isMastered } : m))
    );
  };

  const practiceMistakes = () => {
    const mistakeQuestions = mistakes
      .filter(m => !m.isMastered)
      .map(m => questions.find(q => q.id === m.questionId))
      .filter((q): q is Question => Boolean(q));

    if (mistakeQuestions.length > 0) {
      startPractice(mistakeQuestions);
    }
  };

  // Bookmarks
  const toggleBookmark = (questionId: string) => {
    setBookmarks(prev => {
      const exists = prev.some(b => b.questionId === questionId);
      if (exists) {
        return prev.filter(b => b.questionId !== questionId);
      }
      return [...prev, { questionId, timestamp: Date.now() }];
    });
  };

  const isBookmarked = (questionId: string) => {
    return bookmarks.some(b => b.questionId === questionId);
  };

  // Offline Packs
  const toggleDownloadPack = (subject: string) => {
    setOfflinePacks(prev =>
      prev.map(p =>
        p.subject.toLowerCase() === subject.toLowerCase()
          ? { ...p, isDownloaded: !p.isDownloaded, downloadedAt: !p.isDownloaded ? Date.now() : 0 }
          : p
      )
    );
  };

  // Literature
  const updateReadingProgress = (bookId: string, chapterIndex: number) => {
    setLiteratureBooks(prev =>
      prev.map(b => {
        if (b.id === bookId) {
          const progress = Math.min(100, Math.round(((chapterIndex + 1) / b.chapters.length) * 100));
          return { ...b, lastReadChapterIndex: chapterIndex, readingProgressPercent: progress };
        }
        return b;
      })
    );
  };

  // Friends
  const toggleFollowFriend = (friendId: string) => {
    setFriends(prev =>
      prev.map(f => (f.id === friendId ? { ...f, isFollowing: !f.isFollowing } : f))
    );
  };

  // AI Tutor
  const sendAiMessage = async (userText: string, contextQuestion?: Question) => {
    if (!userText.trim()) return;

    const newMsg: ChatMessage = {
      id: String(Date.now()),
      sender: 'user',
      text: userText,
      timestamp: Date.now()
    };

    setAiMessages(prev => [...prev, newMsg]);
    setIsAiLoading(true);

    try {
      const res = await fetch('/api/gemini/tutor', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({
          message: userText,
          persona: selectedTutorPersona,
          questionContext: contextQuestion,
          history: aiMessages.map(m => ({ isUser: m.sender === 'user', text: m.text }))
        })
      });

      const data = await res.json();
      const aiReplyText = data.reply || "I've reviewed this question. Let's break down the principles together.";

      const aiReply: ChatMessage = {
        id: String(Date.now() + 1),
        sender: 'ai',
        text: aiReplyText,
        timestamp: Date.now()
      };
      setAiMessages(prev => [...prev, aiReply]);
    } catch (err) {
      const fallbackReply: ChatMessage = {
        id: String(Date.now() + 1),
        sender: 'ai',
        text: `**Key Concept & Step-by-Step Breakdown**\n\n• **Core Principle**: For JAMB UTME, examiners test understanding of standard definitions and rapid formula application.\n• **Tip**: Eliminate two obvious distractors immediately to double your odds of picking the correct answer.\n• **Exam Strategy**: Always verify units and watch out for negative signs!`,
        timestamp: Date.now()
      };
      setAiMessages(prev => [...prev, fallbackReply]);
    } finally {
      setIsAiLoading(false);
    }
  };

  const askAiAboutQuestion = (q: Question) => {
    const prompt = `Can you explain this ${q.subject} question about "${q.topic}"?\n\n"${q.questionText}"\nOptions:\nA: ${q.optionA}\nB: ${q.optionB}\nC: ${q.optionC}\nD: ${q.optionD}\nCorrect Answer is Option ${['A','B','C','D'][q.correctAnswerIndex]}. Why is this the answer?`;
    sendAiMessage(prompt, q);
    setActiveScreen('AI_TUTOR');
  };

  // Text-to-speech reading helper
  const speakText = (text: string) => {
    if ('speechSynthesis' in window) {
      window.speechSynthesis.cancel();
      const clean = text.replace(/[*_#`]/g, '');
      const utterance = new SpeechSynthesisUtterance(clean);
      utterance.rate = 1.0;
      utterance.pitch = 1.0;
      window.speechSynthesis.speak(utterance);
    }
  };

  return (
    <AppContext.Provider
      value={{
        activeScreen,
        setActiveScreen,
        mainTab,
        setMainTab,
        profile,
        updateProfile,
        questions,
        activeExam,
        startCbtExam,
        answerExamQuestion,
        toggleFlagExamQuestion,
        setExamCurrentIndex,
        setExamSubject,
        submitExam,
        quitExam,
        cbtResult,
        setCbtResult,
        practiceQuestions,
        practiceIndex,
        practiceAnswers,
        showPracticeExplanation,
        startPractice,
        answerPractice,
        nextPractice,
        prevPractice,
        togglePracticeExplanation,
        mistakes,
        toggleMistakeMastered,
        practiceMistakes,
        bookmarks,
        toggleBookmark,
        isBookmarked,
        offlinePacks,
        toggleDownloadPack,
        literatureBooks,
        activeBook,
        setActiveBook,
        updateReadingProgress,
        friends,
        toggleFollowFriend,
        selectedTutorPersona,
        setSelectedTutorPersona,
        aiMessages,
        isAiLoading,
        sendAiMessage,
        askAiAboutQuestion,
        isCalculatorOpen,
        setIsCalculatorOpen,
        showUpgradeModal,
        setShowUpgradeModal,
        showSettingsModal,
        setShowSettingsModal,
        themeMode,
        setThemeMode,
        toggleTheme,
        speakText,
        daysRemainingInTrial
      }}
    >
      {children}
    </AppContext.Provider>
  );
};

export const useApp = () => {
  const context = useContext(AppContext);
  if (!context) {
    throw new Error('useApp must be used within an AppProvider');
  }
  return context;
};
