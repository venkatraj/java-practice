package com.venkatraj;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("State Bank of India");
	    bank.addBranch("Salem");
	    bank.addCustomer("Salem", "Venkat", 5000);
        bank.addCustomer("Salem", "Raj", 10000);
        bank.addCustomer("Salem", "Mega", 5000);

        bank.addBranch("Chennai");
        bank.addCustomer("Chennai", "Abi", 1000);

        bank.addTransaction("Salem", "Venkat", 750);
        bank.addTransaction("Salem", "Venkat", 250);
        bank.addTransaction("Salem", "Venkat", 555);
        bank.addTransaction("Salem", "Venkat", 450);

        bank.listCustomers("Salem", true);
        bank.listCustomers("Chennai", false);

        if (! bank.addBranch("Salem")) {
            System.out.println("Branch already exists");
        }
    }
}
