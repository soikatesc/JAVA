package com.company;

/**
 * Created by mdrahaman on 8/13/17.
 */
public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
