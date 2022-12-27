package com.hillel.gorich.home_works.home_work15;

public enum DrinksMachine {

    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    WATER("Water"),
    COLA("Cola");

    private String drink;

    DrinksMachine(String drink) {
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }
}
