package com.venkatraj;

public class Main {

    public static void main(String[] args) {
	    double firstDouble = 20.00;
	    double secondDouble = 80.00;
	    double total = firstDouble + secondDouble;
	    double remainder = total % 40.00;
	    boolean isDivisible = remainder == 0 ? true : false;
		System.out.println("isDivisible is = " + isDivisible);
    }
}
