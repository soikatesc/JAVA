package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //getting integer from user input
        int[] myIntegers = getIntegers(5);

        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity +  " integer value: \r" );
        int[] array = new int[capacity];

        for(int i=0; i< array.length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length; i++){
            System.out.println("Element" + i + "contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++){
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;

            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }


}



//creating an array
//
////        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] myIntArray = new int[25];
//
////        System.out.println(myIntArray[0]);
////        System.out.println(myIntArray[6]);
////        System.out.println(myIntArray[7]);
//
//        //for loop to initialize an array
//
//        for(int i=0; i<myIntArray.length; i++){
//            myIntArray[i] = i*10;
//        }
//        printArray(myIntArray);
//    }
//
//    public static void printArray(int[] array) {
//        for(int i=0; i<array.length; i++){
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
//    }