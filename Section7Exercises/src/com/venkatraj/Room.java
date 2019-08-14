package com.venkatraj;

public class Room {
    private int width;
    private int length;
    private TV tv;
    private Sofa sofa;
    private Fan fan;

    public Room(int width, int length, TV tv, Sofa sofa, Fan fan) {
        this.width = width;
        this.length = length;
        this.tv = tv;
        this.sofa = sofa;
        this.fan = fan;
    }

    public void switchOnTV() {
        tv.on();
    }

    public void switchOffTV() {
        tv.off();
    }

    public void switchOnFan() {
        fan.on();
    }

    public void switchOffFan() {
        fan.off();
    }
}
