package com.venkatraj;

public class Main {

    public static void main(String[] args) {
        // Primitive Type Challenge
        byte myByteValue = 120;
        short myShortValue = 3000;
        int myIntValue = 65000;

        long myTotal = 50000L + (20L * (myByteValue + myShortValue + myIntValue));
        System.out.println("Total = " + myTotal);
    }
}
