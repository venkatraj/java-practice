package com.venkatraj;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printIntegers(myIntegers);
        int[] sortedIntegers = sortIntegers(myIntegers);
        printIntegers(sortedIntegers);
    }

    private static int[] getIntegers(int number) {
        int[] values = new int[number];
        for(int i=0;i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static void printIntegers(int[] intArray) {
        for(int i=0; i<intArray.length; i++) {
            System.out.println(String.format("Element #%d is %d", i, intArray[i]));
        }
    }

    private static int[] sortIntegers(int[] intArray) {
        for(int i=0; i<intArray.length; i++) {
            int idx = i;
            for(int j=i+1; j<intArray.length; j++) {
                if (intArray[idx] < intArray[j]) {
                    System.out.println("swapping...");
                    idx = j;
                }
            }
            int temp = intArray[i];
            intArray[i] = intArray[idx];
            intArray[idx] = temp;
        }
        return intArray;
    }

}
