package com.venkatraj;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble) {
        int first = (int) (firstDouble * 1000);
        int second = (int) (secondDouble * 1000);
        if (first == second) {
            return true;
        }
        return false;
    }
}
