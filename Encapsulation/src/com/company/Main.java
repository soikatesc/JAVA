package com.company;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.fullName = "soikat";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaning " + player.healthRemaining());
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaning " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Md", 50, "Sowrd");
        System.out.println("Initial health is: " + player.getHealth());
    }


    // ability to override property
    // more control
    // validation
    // by making a field private, not accessable outside from that class

}
