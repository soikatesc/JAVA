package com.company;

import java.util.ArrayList;

/**
 * Created by mdrahaman on 8/13/17.
 */
public class Customer {

    private String name;
    private ArrayList<Double> transaction;

    // new customer
    public Customer(String name, double initialAmount) {
        this.name = name;
        // initialize transaction
        this.transaction = new ArrayList<>();
        addTransaction(initialAmount);
    }

    //adding trastruction
    public void addTransaction(double amount) {
        this.transaction.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}
