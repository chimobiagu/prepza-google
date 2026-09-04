import React from 'react';
import { useApp } from './context/AppContext';
import { Navbar } from './components/Navbar';
import { TabNavigation } from './components/TabNavigation';
import { JambCalculatorModal } from './components/JambCalculatorModal';
import { AcademicSettingsModal } from './components/AcademicSettingsModal';
import { PrepzaPlusModal } from './components/PrepzaPlusModal';

// Screens
import { HomeScreen } from './screens/HomeScreen';
import { PracticeScreen } from './screens/PracticeScreen';
import { ProgressScreen } from './screens/ProgressScreen';
import { LibraryScreen } from './screens/LibraryScreen';
import { QuestionPracticeScreen } from './screens/QuestionPracticeScreen';
import { CbtExamScreen } from './screens/CbtExamScreen';
import { CbtResultsScreen } from './screens/CbtResultsScreen';
import { AiTutorScreen } from './screens/AiTutorScreen';
import { MistakeBankScreen } from './screens/MistakeBankScreen';
import { BookmarksScreen } from './screens/BookmarksScreen';
import { OfflinePacksScreen } from './screens/OfflinePacksScreen';
import { FriendsScreen } from './screens/FriendsScreen';

export const AppContent: React.FC = () => {
  const { activeScreen, mainTab } = useApp();

  // If in the full CBT simulation screen, do not show standard navbar or bottom tabs
  if (activeScreen === 'CBT_EXAM') {
    return (
      <div className="min-h-screen bg-slate-950 text-slate-100 selection:bg-emerald-500 selection:text-slate-950">
        <CbtExamScreen />
        <JambCalculatorModal />
      </div>
    );
  }

  return (
    <div className="min-h-screen bg-slate-950 text-slate-100 flex flex-col selection:bg-emerald-500 selection:text-slate-950 antialiased">
      {/* Top Navbar */}
      <Navbar />

      {/* Main Content Area */}
      <main className="flex-1">
        {activeScreen === 'MAIN_TABS' && (
          <>
            {mainTab === 'HOME' && <HomeScreen />}
            {mainTab === 'PRACTICE' && <PracticeScreen />}
            {mainTab === 'PROGRESS' && <ProgressScreen />}
            {mainTab === 'LIBRARY' && <LibraryScreen />}
          </>
        )}

        {activeScreen === 'PRACTICE_SESSION' && <QuestionPracticeScreen />}
        {activeScreen === 'CBT_RESULTS' && <CbtResultsScreen />}
        {activeScreen === 'AI_TUTOR' && <AiTutorScreen />}
        {activeScreen === 'MISTAKE_BANK' && <MistakeBankScreen />}
        {activeScreen === 'BOOKMARKS' && <BookmarksScreen />}
        {activeScreen === 'OFFLINE_PACKS' && <OfflinePacksScreen />}
        {activeScreen === 'FRIENDS' && <FriendsScreen />}
      </main>

      {/* Floating Bottom Tab Bar (shown on main screens) */}
      {activeScreen === 'MAIN_TABS' && <TabNavigation />}

      {/* Shared Global Modals */}
      <JambCalculatorModal />
      <AcademicSettingsModal />
      <PrepzaPlusModal />
    </div>
  );
};

export default function App() {
  return <AppContent />;
}
