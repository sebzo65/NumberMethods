package com.LearnJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a natural number:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        NumberMethods numberMethods = new NumberMethods();
        numberMethods.checkNaturalNum(userInput);
        numberMethods.checkEvenOdd(userInput);
        numberMethods.checkBuzzNum(userInput);
    }
}
