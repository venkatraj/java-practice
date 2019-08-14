package com.venkatraj;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double basePrice;
    private Lettuce lettuce;
    private Tomato tomato;
    private Carrot carrot;
    private Beans beans;

    public Hamburger(String name, String breadRollType, String meat, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void addLettuce() {
        this.lettuce = new Lettuce();
    }

    public void addTomato() {
        this.tomato = new Tomato();
    }

    public void addCarrot() {
        this.carrot = new Carrot();
    }

    public void addBeans() {
        this.beans = new Beans();
    }

    public double getPrice() {
        double finalPrice = getBasePrice();

        if (lettuce != null) {
            finalPrice += lettuce.getPrice();
        }

        if (tomato != null) {
            finalPrice += tomato.getPrice();
        }

        if (carrot != null) {
            finalPrice += carrot.getPrice();
        }

        if (beans != null) {
            finalPrice += beans.getPrice();
        }

        return finalPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        if (hasAdditions()){
            System.out.println("Additions: ");
        }
     }

    public boolean hasAdditions() {
        if (lettuce != null || tomato != null || carrot != null || beans != null) return true;
        return false;
    }
}
