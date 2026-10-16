package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Welcome! Choose the size of your sandwich: " + "\n1: Regular: base price $5.45" + "\n2: Large: base price $8.95");
        System.out.println("Enter 1 or 2: ");
        String sandwichSize = myscanner.next();

        System.out.println("Would you like it LOADED? " + "\nRegular: $1.00" + "\nLarge: $1.75");
        System.out.println("1. Regular" + "\n2. Large" + "\n3. No");
        String userAnswer = myscanner.next();

        System.out.println("Enter your age: ");
        int userAge = myscanner.nextInt();

        if (sandwichSize.equals("1") && userAnswer.equals("1") && userAge < 17) {
            System.out.printf("Your total is: %.2f", ((5.45 + 1)  * .9));
        }
        else  if (sandwichSize.equals("1") && userAnswer.equals("2") && userAge < 17) {
            System.out.printf("Your total is: %.2f", ((5.45 + 1.75) * .9));
        }
        else  if (sandwichSize.equals("1") && userAnswer.equals("No") && userAge < 17) {
            System.out.printf("Your total is: %.2f", (5.45 * .9));
        }
        else if (sandwichSize.equals("1") && userAnswer.equals("1") && userAge > 65) {
            System.out.printf("Your total is: $%.2f", ((5.45 + 1) * .8));
        }
        else if (sandwichSize.equals("1") && userAnswer.equals("2") && userAge > 65) {
            System.out.printf("Your total is: $%.2f", ((5.45 + 1.75) * .8));
        }
        else if (sandwichSize.equals("1") && userAnswer.equals("No") && userAge > 65) {
                System.out.printf("Your total is: $%.2f", (5.45 * .8));
        } else if (sandwichSize.equals("1") && userAnswer.equals("1")) {
            System.out.println("Your total is: $6.45");

        } else if (sandwichSize.equals("1") && userAnswer.equals("2")) {
            System.out.println("Your total is: $" + (5.45 + 1.75));

        } else if (sandwichSize.equals("1") && userAnswer.equals("No")) {
            System.out.println("Your total is: $5.45");
        }

        if (sandwichSize.equals("2")  && userAnswer.equals("1") && userAge < 17) {
            System.out.printf("Your total is: $%.2f", (8.95 * .9));
        }
        else  if (sandwichSize.equals("2")  && userAnswer.equals("1") && userAge > 65) {
            System.out.printf("Your total is: $%.2f", (8.95 * .8));
        } else if (sandwichSize.equals("2")) {
            System.out.println("Your total is: $8.95");
        }
        if (sandwichSize.equals("2")  && userAnswer.equals("2") && userAge < 17) {
            System.out.printf("Your total is: $%.2f", (8.95 * .9));
        }
        else  if (sandwichSize.equals("2")  && userAge > 65) {
            System.out.printf("Your total is: $%.2f", (8.95 * .8));
        } else if (sandwichSize.equals("2")) {
            System.out.println("Your total is: $8.95");
        }


    }
}
