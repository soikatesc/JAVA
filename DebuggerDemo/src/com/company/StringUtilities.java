package com.company;

/**
 * Created by mdrahaman on 8/13/17.
 */
public class StringUtilities {

    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c) {
        this.sBuilder.append(c);
        charsAdded++;
    }
}
