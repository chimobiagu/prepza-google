import React, { useState } from 'react';
import { useApp } from '../context/AppContext';
import { X, Delete } from 'lucide-react';

export const JambCalculatorModal: React.FC = () => {
  const { isCalculatorOpen, setIsCalculatorOpen } = useApp();
  const [display, setDisplay] = useState<string>('0');
  const [prevValue, setPrevValue] = useState<number | null>(null);
  const [operator, setOperator] = useState<string | null>(null);
  const [waitingForOperand, setWaitingForOperand] = useState<boolean>(false);

  if (!isCalculatorOpen) return null;

  const handleDigit = (digit: string) => {
    if (waitingForOperand) {
      setDisplay(digit);
      setWaitingForOperand(false);
    } else {
      setDisplay(display === '0' ? digit : (display + digit).slice(0, 10));
    }
  };

  const handleDecimal = () => {
    if (waitingForOperand) {
      setDisplay('0.');
      setWaitingForOperand(false);
      return;
    }
    if (!display.includes('.')) {
      setDisplay(display + '.');
    }
  };

  const handleClear = () => {
    setDisplay('0');
    setPrevValue(null);
    setOperator(null);
    setWaitingForOperand(false);
  };

  const handleClearEntry = () => {
    setDisplay('0');
  };

  const handleBackspace = () => {
    if (display.length > 1) {
      setDisplay(display.slice(0, -1));
    } else {
      setDisplay('0');
    }
  };

  const handleToggleSign = () => {
    const val = parseFloat(display);
    if (!isNaN(val)) {
      setDisplay(String(-val));
    }
  };

  const handleSqrt = () => {
    const val = parseFloat(display);
    if (val >= 0) {
      const res = Math.sqrt(val);
      setDisplay(String(Number(res.toFixed(6))));
      setWaitingForOperand(true);
    } else {
      setDisplay('Error');
    }
  };

  const handlePercent = () => {
    const val = parseFloat(display);
    if (!isNaN(val)) {
      setDisplay(String(val / 100));
      setWaitingForOperand(true);
    }
  };

  const performOperation = (nextOperator: string) => {
    const inputValue = parseFloat(display);

    if (prevValue === null) {
      setPrevValue(inputValue);
    } else if (operator) {
      const currentValue = prevValue;
      let newValue = currentValue;

      switch (operator) {
        case '+':
          newValue = currentValue + inputValue;
          break;
        case '-':
          newValue = currentValue - inputValue;
          break;
        case '×':
        case '*':
          newValue = currentValue * inputValue;
          break;
        case '÷':
        case '/':
          if (inputValue === 0) {
            setDisplay('Error');
            setPrevValue(null);
            setOperator(null);
            setWaitingForOperand(true);
            return;
          }
          newValue = currentValue / inputValue;
          break;
        default:
          break;
      }

      const formatted = Number(newValue.toFixed(6));
      setDisplay(String(formatted).slice(0, 10));
      setPrevValue(formatted);
    }

    setWaitingForOperand(true);
    setOperator(nextOperator);
  };

  const handleEquals = () => {
    if (!operator || prevValue === null) return;
    performOperation('=');
    setOperator(null);
  };

  return (
    <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-black/70 backdrop-blur-sm animate-fade-in">
      <div className="w-full max-w-[320px] bg-slate-900 border border-slate-700 rounded-2xl shadow-2xl overflow-hidden text-white">
        {/* Titlebar */}
        <div className="flex items-center justify-between px-4 py-3 bg-slate-800/90 border-b border-slate-700/80">
          <div className="flex items-center gap-2">
            <div className="w-2.5 h-2.5 rounded-full bg-emerald-500" />
            <span className="text-xs font-bold uppercase tracking-wider text-slate-300">
              JAMB CBT Standard Calculator
            </span>
          </div>
          <button
            onClick={() => setIsCalculatorOpen(false)}
            className="p-1 rounded-lg hover:bg-slate-700 text-slate-400 hover:text-white transition"
          >
            <X className="w-4 h-4" />
          </button>
        </div>

        {/* Display */}
        <div className="p-4 bg-slate-950/90 border-b border-slate-800">
          <div className="text-right text-[11px] text-slate-500 h-4 font-mono">
            {prevValue !== null && operator ? `${prevValue} ${operator}` : ''}
          </div>
          <div className="text-right text-3xl font-bold font-mono tracking-tight text-emerald-400 overflow-x-auto select-all">
            {display}
          </div>
        </div>

        {/* Keypad Grid */}
        <div className="p-3 grid grid-cols-4 gap-2 bg-slate-900">
          <button
            onClick={handleClear}
            className="p-3 text-xs font-bold rounded-xl bg-red-950/60 text-red-300 hover:bg-red-900/60 border border-red-900/40 transition"
          >
            C
          </button>
          <button
            onClick={handleClearEntry}
            className="p-3 text-xs font-bold rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-300 transition"
          >
            CE
          </button>
          <button
            onClick={handleBackspace}
            className="p-3 flex items-center justify-center text-xs font-bold rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-300 transition"
          >
            <Delete className="w-4 h-4" />
          </button>
          <button
            onClick={() => performOperation('÷')}
            className={`p-3 text-sm font-bold rounded-xl transition ${
              operator === '÷'
                ? 'bg-emerald-600 text-white'
                : 'bg-emerald-950/60 text-emerald-300 hover:bg-emerald-900/60 border border-emerald-900/40'
            }`}
          >
            ÷
          </button>

          <button
            onClick={handleSqrt}
            className="p-3 text-xs font-bold rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-300 transition"
          >
            √
          </button>
          <button
            onClick={() => handleDigit('7')}
            className="p-3 text-base font-semibold rounded-xl bg-slate-800/80 hover:bg-slate-700 text-slate-100 transition"
          >
            7
          </button>
          <button
            onClick={() => handleDigit('8')}
            className="p-3 text-base font-semibold rounded-xl bg-slate-800/80 hover:bg-slate-700 text-slate-100 transition"
          >
            8
          </button>
          <button
            onClick={() => handleDigit('9')}
            className="p-3 text-base font-semibold rounded-xl bg-slate-800/80 hover:bg-slate-700 text-slate-100 transition"
          >
            9
          </button>

          <button
            onClick={() => performOperation('×')}
            className={`p-3 text-sm font-bold rounded-xl transition ${
              operator === '×'
                ? 'bg-emerald-600 text-white'
                : 'bg-emerald-950/60 text-emerald-300 hover:bg-emerald-900/60 border border-emerald-900/40'
            }`}
          >
            ×
          </button>
          <button
            onClick={() => handleDigit('4')}
            className="p-3 text-base font-semibold rounded-xl bg-slate-800/80 hover:bg-slate-700 text-slate-100 transition"
          >
            4
          </button>
          <button
            onClick={() => handleDigit('5')}
            className="p-3 text-base font-semibold rounded-xl bg-slate-800/80 hover:bg-slate-700 text-slate-100 transition"
          >
            5
          </button>
          <button
            onClick={() => handleDigit('6')}
            className="p-3 text-base font-semibold rounded-xl bg-slate-800/80 hover:bg-slate-700 text-slate-100 transition"
          >
            6
          </button>

          <button
            onClick={() => performOperation('-')}
            className={`p-3 text-sm font-bold rounded-xl transition ${
              operator === '-'
                ? 'bg-emerald-600 text-white'
                : 'bg-emerald-950/60 text-emerald-300 hover:bg-emerald-900/60 border border-emerald-900/40'
            }`}
          >
            -
          </button>
          <button
            onClick={() => handleDigit('1')}
            className="p-3 text-base font-semibold rounded-xl bg-slate-800/80 hover:bg-slate-700 text-slate-100 transition"
          >
            1
          </button>
          <button
            onClick={() => handleDigit('2')}
            className="p-3 text-base font-semibold rounded-xl bg-slate-800/80 hover:bg-slate-700 text-slate-100 transition"
          >
            2
          </button>
          <button
            onClick={() => handleDigit('3')}
            className="p-3 text-base font-semibold rounded-xl bg-slate-800/80 hover:bg-slate-700 text-slate-100 transition"
          >
            3
          </button>

          <button
            onClick={() => performOperation('+')}
            className={`p-3 text-sm font-bold rounded-xl transition ${
              operator === '+'
                ? 'bg-emerald-600 text-white'
                : 'bg-emerald-950/60 text-emerald-300 hover:bg-emerald-900/60 border border-emerald-900/40'
            }`}
          >
            +
          </button>
          <button
            onClick={handleToggleSign}
            className="p-3 text-xs font-bold rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-300 transition"
          >
            ±
          </button>
          <button
            onClick={() => handleDigit('0')}
            className="p-3 text-base font-semibold rounded-xl bg-slate-800/80 hover:bg-slate-700 text-slate-100 transition"
          >
            0
          </button>
          <button
            onClick={handleDecimal}
            className="p-3 text-base font-bold rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-200 transition"
          >
            .
          </button>

          <button
            onClick={handlePercent}
            className="p-3 text-xs font-bold rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-300 transition"
          >
            %
          </button>
          <button
            onClick={handleEquals}
            className="col-span-3 p-3 text-base font-extrabold rounded-xl bg-gradient-to-r from-emerald-600 to-green-600 hover:from-emerald-500 hover:to-green-500 text-white shadow-md shadow-emerald-900/30 transition"
          >
            =
          </button>
        </div>
      </div>
    </div>
  );
};
