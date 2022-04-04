package com.LearnJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NumberMethods numberMethods = new NumberMethods();
        numberMethods.executeMenu(scanner);
    }
}
