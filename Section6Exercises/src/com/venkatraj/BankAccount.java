package com.venkatraj;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, double balance,
                   String customerName, String email,
                   String phoneNumber) {
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
        this.setCustomerName(customerName);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        if (amount < 0) {
            System.out.println("Amount needs to be greater than zero");
        }
        balance += amount;
        System.out.println("You current balance is " + balance);
    }

    public void withdrawFunds(double amount) {
        if (amount < 0) {
            System.out.println("Amount needs to be greater than zero");
        }
        if (amount >= balance) {
            System.out.println("Insufficient Funds in your account");
        } else {
            balance -= amount;
            System.out.println("You withdrew " + amount);
            System.out.println("Your current balance is " + balance);
        }

    }
}
