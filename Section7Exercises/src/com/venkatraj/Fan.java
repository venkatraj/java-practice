package com.venkatraj;

public class Fan {
    private String model;
    private String manufacturer;

    public Fan(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void on() {
        System.out.println("Fan switched on!");
    }

    public void off() {
        System.out.println("Fan switched off!");
    }
}
