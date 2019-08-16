package com.venkatraj;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(String customerName, double initialAmount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer == null) {
            customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for(int i=0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.getName() == customerName) {
                return customer;
            }
        }
        return null;
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
