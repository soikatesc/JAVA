package com.company;

public class Main {

    public static void main(String[] args) {
	    // primitive data type
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // special 9th type strings; can contain more than one character ""

        String myString = "This is a string";
        System.out.println("myString is equal to: "+ myString);
        myString = myString + ", and this is more";
        System.out.println(myString);
        myString = myString + "\u00A9 2015";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

    }
}
