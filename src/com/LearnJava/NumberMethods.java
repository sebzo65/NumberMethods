package com.LearnJava;

public class NumberMethods {

    public void checkNaturalNum(int num) {
        if (num < 1) {
            System.out.println("This number is not natural!");
        }
    }


    public void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("This number is Even.");
        } else {
            System.out.println("This number is Odd.");
        }
    }

    public void checkBuzzNum(int num) {
        int lastDigit = num % 10;
        int firstDigits = num / 10;
        int buzz = firstDigits - (lastDigit * 2);

        if (lastDigit == 7 && buzz % 7 == 0) {
            System.out.println("It is a Buzz number.");
            System.out.println("Explanation:");
            System.out.println(num + " is divisible by 7 and ends with 7.");

        } else if (lastDigit == 7) {
            System.out.println("It is a Buzz number.");
            System.out.println("Explanation:");
            System.out.println(num + " ends with 7.");

        } else if (buzz % 7 == 0) {
            System.out.println("It is a Buzz number.");
            System.out.println("Explanation:");
            System.out.println(num + " is divisible by 7.");

        } else {
            System.out.println("It is not a Buzz number.");
            System.out.println("Explanation:");
            System.out.println(num + " is neither divisible by 7 nor does it end with 7.");
        }
    }
}
