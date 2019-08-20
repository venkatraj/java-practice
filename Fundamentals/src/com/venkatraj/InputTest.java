package com.venkatraj;

import java.util.Scanner;

public class InputTest {
    public void getInputs() {
        Scanner input = new Scanner(System.in);

        // get name
        System.out.println("What is your name?");
        String name = input.nextLine();

        // get age
        System.out.println("How old are you?");
        int age = input.nextInt();

        // display
        System.out.println(String.format("Hello, %s. Next year, you'll be %d", name, age + 1));
    }
}
