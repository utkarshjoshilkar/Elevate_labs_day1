package com.elevate;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, choice;

        while (true) {
            // Display menu
            System.out.println("\n----- Calculator Menu -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            // Take inputs for all choices except exit
            System.out.print("Enter number 1: ");
            a = sc.nextInt();
            System.out.print("Enter number 2: ");
            b = sc.nextInt();

            switch (choice) {
                case 1 -> Addition(a, b);
                case 2 -> Subtraction(a, b);
                case 3 -> Multiplication(a, b);
                case 4 -> Division(a, b);
                default -> System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }

    private static void Addition(int a, int b) {
        System.out.println("Result: " + (a + b));
    }

    private static void Subtraction(int a, int b) {
        System.out.println("Result: " + (a - b));
    }

    private static void Multiplication(int a, int b) {
        System.out.println("Result: " + (a * b));
    }

    private static void Division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }
}
