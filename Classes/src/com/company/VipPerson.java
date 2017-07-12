package com.company;

/**
 * Created by mdrahaman on 7/11/17.
 */
public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPerson() {
        this("Default name", 50000.00, "default@dmail.com");
    }

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unkown@email.com");
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
