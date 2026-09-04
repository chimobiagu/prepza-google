export type MainTab = 'HOME' | 'PRACTICE' | 'PROGRESS' | 'LIBRARY';

export type ActiveScreen =
  | 'MAIN_TABS'
  | 'QUESTION_PRACTICE'
  | 'CBT_EXAM'
  | 'CBT_RESULTS'
  | 'AI_TUTOR'
  | 'BOOKMARKS'
  | 'MISTAKE_BANK'
  | 'LEARN'
  | 'LEARNING_PACK'
  | 'QUICK_RECALL'
  | 'LITERATURE_READER'
  | 'FRIENDS'
  | 'OFFLINE_PACKS';

export interface Question {
  id: string;
  subject: string;
  topic: string;
  year: string;
  questionText: string;
  optionA: string;
  optionB: string;
  optionC: string;
  optionD: string;
  correctAnswerIndex: number; // 0=A, 1=B, 2=C, 3=D
  explanation: string;
  passageText?: string | null;
  difficulty?: 'Easy' | 'Medium' | 'Hard';
  originType?: string;
  originLabel?: string;
  isVerifiedJamb?: boolean;
}

export interface UserProfile {
  id: number;
  accountId: string;
  name: string;
  email: string;
  phoneNumber?: string;
  targetScore: number;
  jambSubjectsCsv: string; // "English Language,Mathematics,Physics,Chemistry"
  targetInstitution: string;
  dreamCourse: string;
  learningStyle: string;
  preferredStudyTime: string;
  streakDays: number;
  totalXp: number;
  level: number;
  studyGoalMinutesPerDay: number;
  isPlusSubscriber: boolean;
  trialStartDate: number;
  trialDurationDays: number;
  simulatedDaysPassed: number;
  jambExamDateTimestamp: number;
  myReferralCode: string;
  referralCount: number;
}

export interface PracticeSession {
  id: number;
  mode: string;
  score: number;
  totalQuestions: number;
  timestamp: number;
  subjectsCsv: string;
  durationSeconds: number;
  userAnswers: Record<string, number>;
}

export interface MistakeItem {
  questionId: string;
  subject: string;
  topic: string;
  selectedWrongOptionIndex: number;
  timestamp: number;
  attemptCount: number;
  isMastered: boolean;
  userNotes?: string;
}

export interface BookmarkItem {
  questionId: string;
  timestamp: number;
  note?: string;
}

export interface OfflinePack {
  subject: string;
  totalQuestions: number;
  downloadedAt: number;
  sizeMb: number;
  yearsAvailable: string;
  isDownloaded: boolean;
}

export interface Chapter {
  title: string;
  content: string;
}

export interface LiteratureBook {
  id: string;
  title: string;
  author: string;
  description: string;
  category: string;
  chapters: Chapter[];
  readingProgressPercent: number;
  lastReadChapterIndex: number;
  characters?: { name: string; role: string; description: string }[];
  themes?: { title: string; explanation: string }[];
  examTips?: string[];
}

export interface LearningCard {
  id: string;
  cardType: 'DEFINITION' | 'FORMULA' | 'PROCESS' | 'EXAM_TIP' | 'COMPARISON';
  title: string;
  content: string;
  bulletPoints?: string[];
  formula?: string;
  keyTakeaway?: string;
  examTip?: string;
}

export interface LearningPack {
  id: string;
  subject: string;
  topicName: string;
  groupName: string;
  overview: string;
  estimatedMinutes: number;
  cards: LearningCard[];
}

export interface Friend {
  id: string;
  name: string;
  accuracyPercent: number;
  streakDays: number;
  friendCode: string;
  status: string;
  isFollowing: boolean;
}

export interface FriendChatMessage {
  id: string;
  friendId: string;
  senderName: string;
  text: string;
  timestamp: number;
  isFromMe: boolean;
}

export type TutorPersonaKey =
  | 'GENERAL_COACH'
  | 'STEM_SPECIALIST'
  | 'RAPID_SPRINT'
  | 'LITERATURE_ANALYST';

export interface TutorPersona {
  key: TutorPersonaKey;
  displayName: string;
  tagline: string;
  modelId: string;
  engineName: string;
  defaultGreeting: string;
  systemPrompt: string;
}

export interface CbtSubjectBreakdown {
  subject: string;
  score: number;
  total: number;
  percentage: number;
}

export interface CbtResult {
  mode: string;
  totalScore: number;
  maxScore: number;
  percentage: number;
  durationSeconds: number;
  breakdowns: CbtSubjectBreakdown[];
  questions: Question[];
  userAnswers: Record<string, number>;
  flaggedQuestionIds: string[];
  timestamp: number;
}

export interface ActiveExamState {
  mode: string;
  subjects: string[];
  questions: Question[];
  userAnswers: Record<string, number>;
  flaggedIndices: number[];
  currentQuestionIndex: number;
  selectedSubject: string;
  timerSecondsRemaining: number;
  totalDurationSeconds: number;
  isCompleted: boolean;
}
