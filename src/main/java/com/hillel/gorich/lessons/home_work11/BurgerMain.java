package com.hillel.gorich.lessons.home_work11;

public class BurgerMain {
    public static void main(String[] args) {
        Burger full = new Burger("bun", "meat", "cheese", "greens", "mayo");

        System.out.println("Burger 'full' consists of: " + full.bun + " + " + full.meat
                + " + " + full.cheese + " + " + full.greens + " + " + full.mayo + ".");


        Burger dietetic = new Burger(full.bun, full.meat, full.cheese, full.greens);

        System.out.println("Burger 'dietetic' consists of: " + dietetic.bun + " + " + dietetic.meat
                + " + " + dietetic.cheese + " + " + dietetic.greens + ".");

        Burger doubleMeat = new Burger(full.bun, full.meat, full.n, full.cheese, full.greens, full.mayo);

        System.out.println("Burger 'doubleMeat' consists of: " + doubleMeat.bun + " + " + doubleMeat.meat
                + " * " + doubleMeat.n + " + " + doubleMeat.cheese + " + " + doubleMeat.greens + doubleMeat.mayo + ".");
    }
}
