package com.company;

/**
 * Created by mdrahaman on 7/11/17.
 */
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + "made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount <= 0) {
            System.out.println("Only " + this.balance + "available.Withdrawal not processed");
        }else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawl of" + withdrawalAmount + "processed. Remanning balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
