package com.venkatraj;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter no. of elements\r");
        int number = scanner.nextInt();
        System.out.println("Enter the elements...\r");
	    int[] intArray = readIntegers(number);
	    int min = findMin(intArray);
        System.out.println("Minimum element in the array is " + min);
    }

    public static int[] readIntegers(int number) {
        int[] values = new int[number];
        for(int i=0; i<number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for(int i=1; i< arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
