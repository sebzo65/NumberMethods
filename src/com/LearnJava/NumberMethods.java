package com.LearnJava;

import java.util.Scanner;

public class NumberMethods {

    public NumberMethods() {
    }

    //Menu that shows all properties
    public void executeMenu(Scanner scanner) {
        System.out.println("Enter a natural number:");
        int userInput = scanner.nextInt();
        checkNaturalNum(userInput);
        System.out.println("Properties of " + userInput);
        System.out.println("even: " + checkEvenOdd(userInput, "even"));
        System.out.println("odd: " + checkEvenOdd(userInput, "odd"));
        System.out.println("buzz: " + checkBuzzNum(userInput));
        System.out.println("duck: " + checkDuckNum(userInput));
    }

    //Method to check that number is a natural number
    public void checkNaturalNum(int num) {
        if (num < 1) {
            System.out.println("This number is not natural!");
        }
    }

    //Method to check whether number is Even or Odd
    public boolean checkEvenOdd(int num, String typeCheck) {
        if (num % 2 == 0 && typeCheck == "even") {
            return true;
        } else if (num % 2 != 0 && typeCheck == "odd") {
            return true;
        } else {
            return false;
        }
    }

    //Check whether the number is a buzz number (Divisible by 7 or ends with 7, or both)
    public boolean checkBuzzNum(int num) {
        int lastDigit = num % 10;
        int firstDigits = num / 10;
        int buzz = firstDigits - (lastDigit * 2);

        if (lastDigit == 7 && buzz % 7 == 0) {
            return true;

        } else if (lastDigit == 7) {
            return true;

        } else if (buzz % 7 == 0) {
            return true;

        } else {
            return false;
        }
    }

    //Check whether number is duck number (Positive number that contains zeroes
    //Must not be a number with leading zeroes, unless it has trailing zeroes
    public boolean checkDuckNum(int num) {
        if (("" + num).contains("0")) {
            return true;
        } else {
            return false;
        }
    }
}