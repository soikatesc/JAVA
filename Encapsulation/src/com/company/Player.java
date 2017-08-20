package com.company;

/**
 * Created by mdrahaman on 8/15/17.
 */
public class Player {

    // public scope
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            //Reduce numver of lives reamining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}
