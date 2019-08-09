package com.venkatraj;

public class Main {

    public static void main(String[] args) {
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

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myByteMinValue);
        System.out.println("Byte Maximum Value = " + myByteMaxValue);


        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myShortMinValue);
        System.out.println("Short Maximum Value = " + myShortMaxValue);

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myLongMinValue);
        System.out.println("Long Maximum Value = " + myLongMaxValue);

        // Long should be prefixed with L otherwise converted to Integer
        long myLongWithSmallValue = 100L;

        // Java uses `int` by default. So we need to use casting when using byte, short
        int myInt = (myIntMaxValue / 2);
        byte myByte = (byte) (myByteMaxValue / 2);
        short myShort = (short) (myShortMaxValue / 2);
        System.out.println("MyInt = " + myInt);
        System.out.println("MyByte = " + myByte);
        System.out.println("MyShort = " + myShort);


    }
}
