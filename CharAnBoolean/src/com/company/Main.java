package com.company;

public class Main {

    public static void main(String[] args) {
        //with of 16 (2 bytes)
	    char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        //Find the cone for the register symbol on the same line as the copyright symbol.
        //Create a variable of type char and assign it the unicode value for that symbol.
        //Display in on screen

        char registerSymbol = '\u00AE';
        System.out.println(registerSymbol);
    }
}
