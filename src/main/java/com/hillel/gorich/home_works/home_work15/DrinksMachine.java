package com.hillel.gorich.home_works.home_work15;

import java.util.Scanner;

import static com.hillel.gorich.home_works.home_work15.Drinks.COFFEE_PRICE;
import static com.hillel.gorich.home_works.home_work15.Drinks.TEA_PRICE;

public enum DrinksMachine {

    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    MINERAL_WATER("Water"),
    COCA_COLA("Cola");

    private String drink;

    DrinksMachine(String drink) {
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }
}
