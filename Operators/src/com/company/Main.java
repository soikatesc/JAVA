package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(result);


        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien");

        int topScore = 100;
        if (topScore != 100)
            System.out.println("you got the high score!");

        if (topScore > 100)
            System.out.println("you got the high score!");

        // || -> or operator

        boolean isCar = true;

        boolean wasCar = isCar? true:false;
        if(wasCar)
            System.out.println("Was car true");
    }
}
