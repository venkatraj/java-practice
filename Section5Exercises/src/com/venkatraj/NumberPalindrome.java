package com.venkatraj;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        String strNumber = Integer.toString(number);
        StringBuilder reverseStr = new StringBuilder(Integer.toString(number));
        String reverseStrNumber = reverseStr.reverse().toString();

        if (strNumber == reverseStrNumber) return true;
        return false;
    }
}
