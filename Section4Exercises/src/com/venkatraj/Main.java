package com.venkatraj;

public class Main {

    public static void main(String[] args) {
	    long milesPerHour = SpeedConverter.toMilesPerHour(10.25);
        System.out.println("Miles = " + milesPerHour);
        SpeedConverter.printConversion(25.42);
    }
}
