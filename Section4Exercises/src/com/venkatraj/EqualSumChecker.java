package com.venkatraj;

public class EqualSumChecker {
    public static boolean hasEqualSum(int firstVal, int secondVal, int thirdVal) {
        int total = firstVal + secondVal;
        if (total == thirdVal) {
            return true;
        }
        return false;
    }
}
