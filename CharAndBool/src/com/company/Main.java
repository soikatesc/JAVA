package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char myChar = 'D';
        char myUni = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUni);

        boolean myBoolean = false;
        boolean isMale = true;

        // Find the conde register symbol on the same line as the copyright symbol.
        // Create a variable of type char and assign it the unicode value for the symbol
        // Disp;ay in on screen

        char registerdSymbol = '\u00AE';
        System.out.println("Registered symbol = " + registerdSymbol);

    }
}
