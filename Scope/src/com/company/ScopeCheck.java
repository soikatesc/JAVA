package com.company;

/**
 * Created by mdrahaman on 8/15/17.
 */
public class ScopeCheck {

    public int publicVar = 0;
    private int privateWar = 0;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateWar);
    }
}
