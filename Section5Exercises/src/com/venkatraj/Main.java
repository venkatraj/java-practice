package com.venkatraj;

public class Main {

    public static void main(String[] args) {
	    Switch.findChar();
	    Switch.dayOfTheWeek(2);
	    Switch.dayOfTheWeek(10);

	    NumberInWord.printNumberInWord(4);
        NumberInWord.printNumberInWord(14);

        for(int i=2; i<9; i++) {
            System.out.println("Interest for "+ 10000 + " is = " + CalculateInterest.calc(10000, i));
        }
    }
}
