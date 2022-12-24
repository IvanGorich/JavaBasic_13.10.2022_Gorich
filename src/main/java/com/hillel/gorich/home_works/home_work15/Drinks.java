package com.hillel.gorich.home_works.home_work15;

public class Drinks {

    public static final int COFFEE_PRICE = 55;
    public static final int TEA_PRICE = 35;
    public static final int LEMONADE_PRICE = 25;
    public static final int MOJITO_PRICE = 30;
    public static final int MINERAL_WATER_PRICE = 20;
    public static final int COCA_COLA_PRICE = 50;

    private String drinkPrice;

    public Drinks(String drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkPrice() {
        return drinkPrice;
    }
}