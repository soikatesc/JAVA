package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] array = {-5, 2, 5, 12};
//        printArray(oneToTwoFiftyFive());
        System.out.println("Sum of the even numbers between 1 to 1000: " + sumEven());
        System.out.println("Sum of the odd numbers between 1 to 5000: " + sumOdd());
        System.out.println("Sum of all the numbers in an array: " + iterateArr(array));
        System.out.println("Maximum value in the array is: " + max(array));
        System.out.println("Average is: " + avg(array));
        System.out.println("Odd numbers between 1 to 50: " + Odd());

    }

    // return an int array containing 1 to 255
    public static int[] oneToTwoFiftyFive() {
        int[] array = new int[255];

        for(int i=1; i<=array.length; i++) {
            array[i-1] = i;
        }

        return array;
    }

    //sum even number between 1 to 1000
    public static int sumEven() {
        int sum = 0;
        for(int i=1; i<=1000; i++) {
            if(i%2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    //sum odd number between 1 to 5000
    public static int sumOdd() {
        int sum = 0;
        for(int i=0; i<=5000; i++) {
            if(i%2 != 0) {
                sum = sum + i;
            }
        }

        return sum;
    }

    // sum of all the value within an array
    public static int iterateArr(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    // find max in an array
    public static int max(int[] array) {
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Find average
    public static double avg(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum = sum + array[i];
        }
        return (double) sum/array.length;
    }

    // Odd numbers between 1 to 50
    public static ArrayList<Integer> Odd() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i=1; i<=50; i++) {
            if(i%2 != 0) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    // printing an array with given length
    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }
    
}
