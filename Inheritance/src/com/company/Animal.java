package com.company;

/**
 * Created by mdrahaman on 7/20/17.
 */
public class Animal {

    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(int brain, int body, int size, int weight) {

        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;

    }

    public void eat(){

    }

    public void move(){

    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
