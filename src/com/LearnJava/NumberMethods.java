package com.LearnJava;

import java.util.Scanner;

public class NumberMethods {

    public NumberMethods() {
    }

    //Start menu that tells the user what options they have
    public void startMenu() {
        System.out.printf("Welcome to Amazing Numbers!%n");
        System.out.printf("%nSupported requests:%n");
        System.out.println("- enter a natural number to know its properties;");
        System.out.printf("- enter 0 to exit.%n");
    }

    //Prompt that requests a number input from the user
    public void requestNumber(Scanner scanner) {
        startMenu();
        boolean exitLoop = false;
        while (exitLoop == false) {
            System.out.println();
            System.out.printf("Enter a request: ");
            String userString = scanner.nextLine();
            long userInput = Long.parseLong(userString);
            if (userInput < 0) {
                checkNaturalNum(userInput);
            } else if (userInput > 0) {
                propertyMenu(userInput);
            } else {
                exitLoop = true;
                System.out.println("Goodbye!");
            }
        }


    }

    //Menu that shows all properties
    public void propertyMenu(long num) {
        System.out.println("Properties of " + num);
        System.out.println("even: " + checkEvenOdd(num, "even"));
        System.out.println("odd: " + checkEvenOdd(num, "odd"));
        System.out.println("buzz: " + checkBuzzNum(num));
        System.out.println("duck: " + checkDuckNum(num));
        System.out.println("palindromic: " + checkPalindromeNumber(num));
    }

    //Method to check that number is a natural number
    public void checkNaturalNum(long num) {
        if (num < 0) {
            System.out.println("The first parameter should be a natural number or zero.");
        }
    }

    //Method to check whether number is Even or Odd
    public boolean checkEvenOdd(long num, String typeCheck) {
        if (num % 2 == 0 && typeCheck == "even") {
            return true;
        } else if (num % 2 != 0 && typeCheck == "odd") {
            return true;
        } else {
            return false;
        }
    }

    //Check whether the number is a buzz number (Divisible by 7 or ends with 7, or both)
    public boolean checkBuzzNum(long num) {
        long lastDigit = num % 10;
        long firstDigits = num / 10;
        long buzz = firstDigits - (lastDigit * 2);

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
    public boolean checkDuckNum(long num) {
        if (("" + num).contains("0")) {
            return true;
        } else {
            return false;
        }
    }

    //Method to check whether a number is a palindrome
    public boolean checkPalindromeNumber(long num) {
        String number = num + "";
        String reverseNumber = "";
        int strLength = number.length();

        for (int i = (strLength - 1); i >= 0; i--) {
            reverseNumber = reverseNumber + number.charAt(i);
        }

        if (number.equals(reverseNumber)) {
            return true;
        } else {
            return false;
        }
    }
}