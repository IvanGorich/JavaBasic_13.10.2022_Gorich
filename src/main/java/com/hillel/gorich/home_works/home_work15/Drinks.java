package com.hillel.gorich.home_works.home_work15;

public class Drinks {

    public static final int COFFEE_PRICE = 55;
    public static final int TEA_PRICE = 35;
    public static final int LEMONADE_PRICE = 25;
    public static final int MOJITO_PRICE = 30;
    public static final int WATER_PRICE = 20;
    public static final int COLA_PRICE = 50;

    private int drinkPrice;

    public Drinks(int drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public int getDrinkPrice(DrinksMachine drinksMachine) {
        return drinkPrice;
    }
}