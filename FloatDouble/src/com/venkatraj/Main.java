package com.venkatraj;

public class Main {

    public static void main(String[] args) {
	    float myFloatMinValue = Float.MIN_VALUE;
	    float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("Float minimum value " + myFloatMinValue);
        System.out.println("Float maximum value " + myFloatMaxValue);

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double minimum value " + myDoubleMinValue);
        System.out.println("Double maximum value " + myDoubleMaxValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Pound to Kilogram
        double weightInPound = 130.5;
        double weightInKilograms = weightInPound * 0.45359237;
        System.out.println("Weight In Kgs = " + weightInKilograms);

    }
}
