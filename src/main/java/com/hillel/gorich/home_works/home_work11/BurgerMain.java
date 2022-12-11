package com.hillel.gorich.home_works.home_work11;

public class BurgerMain {
    public static void main(String[] args) {

        Burger full = new Burger("bun", "meat", "cheese", "greens", "mayo");

        Burger dietetic = new Burger("bun", "meat", "cheese", "greens");

        Burger doubleMeat = new Burger("bun", "meat", "cheese", "greens", "mayo",
                true);
    }
}
