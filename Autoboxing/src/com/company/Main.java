package com.company;





public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Bank of Asia");

        bank.addBranch("Chatkhil");

        bank.addCustomer("Chatkhil", "Soikat", 50.5);
        bank.addCustomer("Chatkhil", "Shafi", 100.0);
        bank.addCustomer("Chatkhil", "Onamika", 2000);

        bank.addBranch("Dhaka");
        bank.addCustomer("Dhaka", "Nobel", 100);

        bank.addCustomerTranstration("Chatkhil", "Soikat", 200);
        bank.addCustomerTranstration("Chatkhil", "Soikat", 34);
        bank.addCustomerTranstration("Chatkhil", "Onamika", 100);


        bank.listCustomer("Chatkhil", true );
        bank.listCustomer("Dhaka", false);

        if(!bank.addCustomer("Melbourne", "Brian", 5.33)) {
            System.out.println("Error branch does not exist");
        }

        
    }
}
