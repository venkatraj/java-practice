package com.venkatraj;

public class Main {

    public static void main(String[] args) {
        Switch.findChar();
        Switch.dayOfTheWeek(2);
        Switch.dayOfTheWeek(10);

        NumberInWord.printNumberInWord(4);
        NumberInWord.printNumberInWord(14);

        for (int i = 2; i < 9; i++) {
            System.out.println(String.format("Interest for %d at %d%%  is = %.2f", 10000, i, CalculateInterest.calc(10000, i)));
        }

        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (count == 5) break;
            if (isDivisibleBy3and5(i)) {
                sum += i;
                count++;
                System.out.println("Adding " + i);
            }
        }
        System.out.println("Sum is = " + sum);

        System.out.println("sumOdd(1, 100) = " + SumOddRange.sumOdd(1, 100));
    }

    private static boolean isDivisibleBy3and5(int num) {
        if (num % 3 == 0 && num % 5 == 0) return true;
        return false;
    }
}
