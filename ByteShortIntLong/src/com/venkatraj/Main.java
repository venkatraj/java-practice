package com.venkatraj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntMinValue = Integer.MIN_VALUE;
        int myIntMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myIntMinValue);
        System.out.println("Integer Maximum Value = " + myIntMaxValue);

        // Underflow
        System.out.println("Integer Minimum Value Underflows... = " + (myIntMinValue - 1));

        // Overflow
        System.out.println("Integer Maximum Value Overflows... = " + (myIntMaxValue + 1));

        int myIntEasyReadable = 2_147_483_647;
        System.out.println("Easy readable, but standard in computation = " + myIntEasyReadable);
    }
}
