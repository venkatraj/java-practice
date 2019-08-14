package com.venkatraj;

public class DeluxeHamburger extends Hamburger {
    private double price = 30;

    public DeluxeHamburger(String name, String breadRollType, String meat, double basePrice, double price) {
        super(name, breadRollType, meat, basePrice);
        this.price = price;
    }

    @Override
    public void addLettuce() {
        System.out.println("Deluxe Hamburger does not have any additions");
    }

    @Override
    public void addTomato() {
        System.out.println("Deluxe Hamburger does not have any additions");
    }

    @Override
    public void addCarrot() {
        System.out.println("Deluxe Hamburger does not have any additions");
    }

    @Override
    public void addBeans() {
        System.out.println("Deluxe Hamburger does not have any additions");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
