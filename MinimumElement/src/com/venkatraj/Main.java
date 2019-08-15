package com.venkatraj;

import java.util.Arrays;
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
        int[] someInts = new int[]{1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(someInts));
        reverse(someInts);
        System.out.println("Reversed Array: " + Arrays.toString(someInts));
    }

    public static int[] readIntegers(int number) {
        int[] values = new int[number];
        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int midPoint = array.length / 2;
        for (int i = 0; i < midPoint; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
