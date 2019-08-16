package com.venkatraj;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        Branch branch = findBranch(name);
        if (branch == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomer(customerName, initialAmount);
            return true;
        }
        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addTransaction(customerName, amount);
            return true;
        }
        return false;
    }

    public Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branchName);
            ArrayList<Customer> customers = branch.getCustomers();
            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                System.out.println("Customer Name: " + customer.getName());
                if (showTransactions) {
                    listTransactions(customer);
                }
            }
            return true;
        }
        return false;
    }

    private void listTransactions(Customer customer) {
        System.out.println("Transactions: ");
        ArrayList<Double> transactions = customer.getTransactions();
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println("Transaction #" + i + 1 + ": " + transactions.get(i));
        }
    }
}
