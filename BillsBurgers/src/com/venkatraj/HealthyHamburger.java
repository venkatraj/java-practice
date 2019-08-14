package com.venkatraj;

public class HealthyHamburger extends Hamburger {

    private Healthy1 healthy1;
    private Healthy2 healthy2;

    public HealthyHamburger(String name, String breadRollType, String meat, double basePrice) {
        super(name, breadRollType, meat, basePrice);
    }

    public void addHealthy1() {
        healthy1 = new Healthy1();
    }

    public void addHealthy2() {
        healthy2 = new Healthy2();
    }

    public double getPrice() {
        double finalPrice = super.getPrice();

        if (healthy1 != null) {
            finalPrice += healthy1.getPrice();
        }

        if (healthy2 != null) {
            finalPrice += healthy2.getPrice();
        }

        return finalPrice;
    }
}
