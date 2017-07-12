package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Car porsche = new Car();
//        Car holden  = new Car();
//        porsche.setModel("911");
//        System.out.println(porsche.getModel());

        Account soikatAccount = new Account("12345", 0.00, "Md Rahaman", "soikatesc@gmail.com", "4074554121");
        System.out.println(soikatAccount.getNumber());
        soikatAccount.withdrawal(100.0);

        soikatAccount.deposit(50.0);
        soikatAccount.withdrawal(100.0);

        soikatAccount.deposit(51.0);
        soikatAccount.withdrawal(100.0);

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@tim.com");
        System.out.println(person3.getName());

    }
}
