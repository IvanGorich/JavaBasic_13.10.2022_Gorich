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

        int number = -1;
        int totalCost = 0;

        Scanner scanner = new Scanner(System.in);

        boolean a = true;
        while (a) {

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
                    System.out.println("Wrong data, try again");
                }
            }

            while (true) {
                System.out.println("How many cups of " + drinksChoice + " do you want?");

                if (scanner.hasNext()) {
                    number = scanner.nextInt();

                    if (number >= 0) {
                        break;
                    } else {
                        System.out.println("Please enter positive number");
                    }
                } else {
                    System.out.println("Wrong data, please enter integer");
                    scanner.nextLine();
                }
            }
            System.out.println("Would you like something else? Please enter YES or NO");

            String ent = scanner.nextLine().toUpperCase();

            if (scanner.equals("YES")) {
                a = true;
            } else if (scanner.equals("NO")) {
                a = false;
            } else {
                System.out.println("Wrong data, try again");
            }
        }

        switch (drinksChoice) {
            case COFFEE:{
                totalCost = number * Drinks.COFFEE_PRICE;
                coffeeMaker(number, totalCost);
                break;
            }
            case TEA:{
                totalCost = number * Drinks.TEA_PRICE;
                teaMaker(number, totalCost);
                break;
            }
            case LEMONADE:{
                totalCost = number *Drinks.LEMONADE_PRICE;
                lemonadeMaker(number, totalCost);
                break;
            }
            case MOJITO:{
                totalCost = number * Drinks.MOJITO_PRICE;
                mojitoMaker(number,totalCost);
                break;
            }
            case MINERAL_WATER:{
                totalCost = number * Drinks.MINERAL_WATER_PRICE;
                mineralWaterMaker(number, totalCost);
                break;
            }
            case COCA_COLA:{
                totalCost = number * Drinks.COCA_COLA_PRICE;
                cocaColaMaker(number, totalCost);
                break;
            }
        }
        System.out.println("Please take your order");
        System.out.println("You have to pay " + totalCost);
    }

    static void coffeeMaker(int number, int totalCost) {
        System.out.println("You choose " + number + " " + COFFEE + " it cost " + totalCost + "grn");
    }
    static void teaMaker(int number, int totalCost) {
        System.out.println("You choose " + number + " " + TEA + " it cost " + totalCost + "grn");
    }
    static void lemonadeMaker(int number, int totalCost) {
        System.out.println("You choose " + number + " " + LEMONADE + " it cost " + totalCost + "grn");
    }
    static void mojitoMaker(int number, int totalCost) {
        System.out.println("You choose " + number + " " + MOJITO + " it cost " + totalCost + "grn");
    }
    static void mineralWaterMaker(int number, int totalCost) {
        System.out.println("You choose " + number + " " + MINERAL_WATER + " it cost " + totalCost + "grn");
    }
    static void cocaColaMaker(int number, int totalCost) {
        System.out.println("You choose " + number + " " + COCA_COLA + " it cost " + totalCost + "grn");
    }
}
