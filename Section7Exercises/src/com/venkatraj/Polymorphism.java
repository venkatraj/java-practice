package com.venkatraj;

public class Polymorphism {
    public static void main() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random Car #" + randomNumber);
        Car randomCar;
        switch (randomNumber) {
            case 1:
                randomCar = new WagonR();
                break;
            case 2:
                randomCar = new HondaCity();
                break;
            case 3:
                randomCar = new Audi();
                break;
            default:
                randomCar = null;
        }
        randomCar.accelerate();
    }
}

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    public void accelerate() {
        System.out.println("Car -> Accelerate");
    }

    public void brake() {
        System.out.println("Car -> Brake");
    }
}

class WagonR extends Car {
    public WagonR() {
        super("WagonR", 8);
    }
    public void startEngine() {
        System.out.println("WagonR -> startEngine");
    }

    public void accelerate() {
        System.out.println("WagonR -> Accelerate");
    }

    public void brake() {
        System.out.println("WagonR -> Brake");
    }
}

class HondaCity extends Car {
    public HondaCity() {
        super("HondaCity", 8);
    }
    public void startEngine() {
        System.out.println("HondaCity -> startEngine");
    }

    public void accelerate() {
        System.out.println("HondaCity -> Accelerate");
    }

    public void brake() {
        System.out.println("HondaCity -> Brake");
    }
}

class Audi extends Car {
    public Audi() {
        super("Audi", 8);
    }
    public void startEngine() {
        System.out.println("Audi -> startEngine");
    }

    public void accelerate() {
        System.out.println("Audi -> Accelerate");
    }

    public void brake() {
        System.out.println("Audi -> Brake");
    }
}