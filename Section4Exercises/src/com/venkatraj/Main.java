package com.venkatraj;

public class Main {

    public static void main(String[] args) {
	    long milesPerHour = SpeedConverter.toMilesPerHour(10.25);
        System.out.println("Miles = " + milesPerHour);
        SpeedConverter.printConversion(25.42);

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);

        boolean isWakeUpCall = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(isWakeUpCall);
        isWakeUpCall = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(isWakeUpCall);
        isWakeUpCall = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(isWakeUpCall);
        isWakeUpCall = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(isWakeUpCall);

        boolean isLeapYear = LeapYear.isLeapYear(-1600);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(1600);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(2017);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(2000);
        System.out.println(isLeapYear);

    }
}
