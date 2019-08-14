package com.venkatraj;

public class TV {
    private String model;
    private int size;

    public TV(String model, int size) {
        this.model = model;
        this.size = size;
    }

    public void on() {
        System.out.println("TV switched on!");
    }

    public void off() {
        System.out.println("TV switched off!");
    }
}
