package com.hillel.gorich.home_works.home_work15;

import java.util.Scanner;

import static com.hillel.gorich.home_works.home_work15.DrinksMachine.*;

public class Main {

    public static void main(String[] args) {

        startMachine();

    }

    static void startMachine() {

        DrinksMachine[] drinksMachines = DrinksMachine.values();
        DrinksMachine drinksChoice = null;

        int amount = 0;
        int cost = 0;
        int number;
        int totalCost = 0;

        Scanner scanner = new Scanner(System.in);

        boolean b = true;
        while (b) {

            System.out.println("Please enter the drink from the list:");
            System.out.println();

            for (DrinksMachine value : DrinksMachine.values()) {
                System.out.println(value.getDrink());
            }

            while (true) {

                String userValue = scanner.nextLine().toUpperCase();

                for (DrinksMachine drinksMachine : drinksMachines) {
                    if (userValue.equals(drinksMachine.toString())) {
                        drinksChoice = DrinksMachine.valueOf(userValue);
                        break;
                    }
                }
                if (drinksChoice != null) {
                    break;
                } else {
                    System.out.println("Wrong data, try again!");
                    scanner.nextLine();
                }
            }

            while (true) {
                System.out.println("How many cups of " + drinksChoice.getDrink() + " do you want?");

                if (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                    amount += number;
                    if (number >= 0) {
                        switch (drinksChoice) {
                            case COFFEE: {
                                cost = number * Drinks.COFFEE_PRICE;
                                coffeeMaker(number, cost);
                                break;
                            }
                            case TEA: {
                                cost = number * Drinks.TEA_PRICE;
                                teaMaker(number, cost);
                                break;
                            }
                            case LEMONADE: {
                                cost = number * Drinks.LEMONADE_PRICE;
                                lemonadeMaker(number, cost);
                                break;
                            }
                            case MOJITO: {
                                cost = number * Drinks.MOJITO_PRICE;
                                mojitoMaker(number, cost);
                                break;
                            }
                            case WATER: {
                                cost = number * Drinks.WATER_PRICE;
                                mineralWaterMaker(number, cost);
                                break;
                            }
                            case COLA: {
                                cost = number * Drinks.COLA_PRICE;
                                cocaColaMaker(number, cost);
                                break;
                            }
                        }
                        totalCost += cost;
                        break;
                    } else {
                        System.out.println("Please enter positive number!");
                    }
                } else {
                    System.out.println("Wrong data, please enter integer!");
                    scanner.nextLine();
                }
            }
            scanner.nextLine();

            while (true) {
                System.out.println("Would you like something else? Please enter 'YES' or 'NO'");
                String a = scanner.nextLine().toUpperCase();
                if (a.equals("YES")) {
                    break;
                } else if (a.equals("NO")) {
                    b = false;
                    break;
                } else {
                    System.out.println("Wrong data, try again!");
                }
            }
        }
        System.out.println("Please take your order!");
        System.out.println("You choose " + amount + " drinks.");
        System.out.println("You have to pay " + totalCost + "grn.");
    }

    static void coffeeMaker(int number, int cost) {
        System.out.println("You choose " + number + " " + COFFEE.getDrink() + ". It cost " + cost + "grn.");
    }

    static void teaMaker(int number, int cost) {
        System.out.println("You choose " + number + " " + TEA.getDrink() + ". It cost " + cost + "grn.");
    }

    static void lemonadeMaker(int number, int cost) {
        System.out.println("You choose " + number + " " + LEMONADE.getDrink() + ". It cost " + cost + "grn.");
    }

    static void mojitoMaker(int number, int cost) {
        System.out.println("You choose " + number + " " + MOJITO.getDrink() + ". It cost " + cost + "grn.");
    }

    static void mineralWaterMaker(int number, int cost) {
        System.out.println("You choose " + number + " " + WATER.getDrink() + ". It cost " + cost + "grn.");
    }

    static void cocaColaMaker(int number, int cost) {
        System.out.println("You choose " + number + " " + COLA.getDrink() + ". It cost " + cost + "grn.");
    }
}
