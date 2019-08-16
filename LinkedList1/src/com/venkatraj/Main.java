package com.venkatraj;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Salem");
        addInOrder(placesToVisit, "Chennai");
        addInOrder(placesToVisit, "Trichy");
        addInOrder(placesToVisit, "Coimbatore");
        addInOrder(placesToVisit, "Nellai");
        addInOrder(placesToVisit, "Madurai");
        printPlaces(placesToVisit);
        run(placesToVisit);
    }

    public static void run(LinkedList<String> places) {
        ListIterator<String> li = places.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goForward = true;
        showMenu();
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (!goForward) {
                        if (li.hasNext()) {
                            li.next();
                        }
                        goForward = true;
                    }
                    if (li.hasNext()) {
                        System.out.println("Visiting " + li.next());
                    } else {
                        System.out.println("Reached end of the list");
                    }
                    break;
                case 2:
                    if (goForward) {
                        if (li.hasPrevious()) {
                            li.previous();
                        }
                        goForward = false;
                    }
                    if (li.hasPrevious()) {
                        System.out.println("Visiting " + li.previous());
                    } else {
                        System.out.println("Reached start of the list");
                    }
                    break;
                case 3:
                    showMenu();
                    break;
            }
        }
    }

    public static void showMenu() {
        System.out.println("Enter your choice:");
        System.out.println("0 - Quit");
        System.out.println("1 - Go forward");
        System.out.println("2 - Go backward");
        System.out.println("3 - Print menu");
    }

    public static void printPlaces(LinkedList<String> places) {
        System.out.println("Places to Visit: ");
        ListIterator<String> iterator = places.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static boolean addInOrder(LinkedList<String> places, String city) {
        ListIterator<String> li = places.listIterator();
        while (li.hasNext()) {
            int position = li.next().compareTo(city);
            if (position == 0) {
                System.out.println("City already exists");
                return false;
            } else if (position > 0) {
                li.previous();
                li.add(city);
                return true;
            }
        }
        places.add(city);
        return true;
    }
}
