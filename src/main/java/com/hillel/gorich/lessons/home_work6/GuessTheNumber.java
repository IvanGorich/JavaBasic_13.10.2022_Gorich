package com.hillel.gorich.lessons.home_work6;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        int number = (int) (Math.random() * (max - min + 1) + min);

        Scanner scanner = new Scanner(System.in);

        int forGuess = 0;

        while (true) {
            System.out.println("Please, enter number from 1 to 10");
            if (scanner.hasNextInt()) {
                forGuess = scanner.nextInt();
                scanner.nextLine();
                if (forGuess >= 1 && forGuess <= 10) {
                    break;
                } else {
                    System.out.println("ENTER FROM 1 TO 10");
                }
            } else {
                System.out.println("Wrong data. Try again");
                scanner.nextLine();
            }
        }
        if (forGuess == number) {
            System.out.println("Congratulations! You guessed!");
            System.exit(0);
        } else if (forGuess != number) {
            System.out.println("You have 2 more attempts");
        }
        while (true) {
            System.out.println("Please, enter number from 1 to 10");
            if (scanner.hasNextInt()) {
                forGuess = scanner.nextInt();
                scanner.nextLine();
                if (forGuess >= 1 && forGuess <= 10) {
                    break;
                } else {
                    System.out.println("ENTER FROM 1 TO 10");
                }
            } else {
                System.out.println("Wrong data. Try again");
                scanner.nextLine();
            }
        }
        if (forGuess == number) {
            System.out.println("Congratulations! You guessed!");
            System.exit(0);
        } else if (forGuess != number) {
            System.out.println("You have 1 more attempt");
        }
        while (true) {
            System.out.println("Please, enter number from 1 to 10");
            if (scanner.hasNextInt()) {
                forGuess = scanner.nextInt();
                scanner.nextLine();
                if (forGuess >= 1 && forGuess <= 10) {
                    break;
                } else {
                    System.out.println("ENTER FROM 1 TO 10");
                }
            } else {
                System.out.println("Wrong data. Try again");
                scanner.nextLine();
            }
        }
        if (forGuess == number) {
            System.out.println("Congratulations! You guessed!");
            System.exit(0);
        } else if (forGuess != number) {
            System.out.println("Unfortunately, You lost");
            System.out.println("Try again later");
        }
    }
}