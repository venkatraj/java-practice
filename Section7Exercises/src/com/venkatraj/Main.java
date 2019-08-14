package com.venkatraj;

public class Main {

    public static void main(String[] args) {
        TV tv = new TV("Sony", 41);
        Sofa sofa = new Sofa("Leather", 5);
        Fan fan = new Fan("High Speed H", "Havells");
	    Room room = new Room(15, 15, tv, sofa, fan);

	    room.switchOnTV();
	    room.switchOnFan();
        System.out.println("After some time...");
        room.switchOffTV();
        room.switchOffFan();
        System.out.println("Leaving the room...");

        Printer printer = new Printer(10, true);
        System.out.println("Pages printed so far = " + printer.getPagesPrinted());
        printer.print(10);
        System.out.println("Pages printed so far = " + printer.getPagesPrinted());
        System.out.println("Toner Level = " + printer.getTonerLevel());
        if (printer.getTonerLevel() == 0) {
            printer.fillToner();
        }
        System.out.println("Toner Level = " + printer.getTonerLevel());
    }
}
