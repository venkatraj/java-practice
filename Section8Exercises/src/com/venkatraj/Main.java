package com.venkatraj;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static GroceryList groceries = new GroceryList();

    public static void main(String[] args) {
//        int[] myIntegers = getIntegers(5);
//        printIntegers(myIntegers);
//        int[] sortedIntegers = sortIntegers(myIntegers);
//        printIntegers(sortedIntegers);
        boolean quit = false;
        printChoices();
        while(!quit) {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    printChoices();
                    break;
                case 2:
                    showList();
                    break;
                case 3:
                    addItem();
                    break;
                case 4:
                    modifyItem();
                    break;
                case 5:
                    removeItem();
                    break;
                case 6:
                    searchItem();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void printChoices() {
        System.out.println("1. Show Choices");
        System.out.println("2. Show List");
        System.out.println("3. Add Item");
        System.out.println("4. Modify Item");
        System.out.println("5. Remove Item");
        System.out.println("6. Search Item");
        System.out.println("7. Quit");
    }

    private static void showList() {
        for(int i=0; i < groceries.size(); i++) {
            System.out.println(i+1 + ". " + groceries.getItem(i));
        }
    }

    private static void addItem() {
        System.out.println("Enter item: ");
        String item = scanner.nextLine();
        groceries.addItem(item);
        System.out.println("Item " + item + " added successfully!");
    }

    private static void modifyItem() {
        System.out.println("Enter item to modify: ");
        String oldItem = scanner.nextLine();
        System.out.println("Enter new item description: ");
        String newItem = scanner.nextLine();
        if (groceries.modifyItem(oldItem, newItem)) {
            System.out.println("Item " + oldItem + " modified to " + newItem);
        } else {
            System.out.println("Item " + oldItem + " not found in the list, so it is unchanged!");
        }
    }

    private static void removeItem() {
        System.out.println("Enter item to remove: ");
        String itemToRemove = scanner.nextLine();

        if (groceries.removeItem(itemToRemove)) {
            System.out.println("Item removed!");
        } else {
            System.out.println("Item not found in the list!");
        }

    }

    private static void searchItem() {
        System.out.println("Enter item to search");
        String itemToSearch = scanner.nextLine();
        if (groceries.hasItem(itemToSearch)) {
            int itemIndex = groceries.findItem(itemToSearch);
            System.out.println("Item " + itemToSearch + " was found in the list at position " + itemIndex + 1);
        } else {
            System.out.println("Item " + itemToSearch +  " was not found in the list");
        }
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
