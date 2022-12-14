package com.hillel.gorich.home_works.home_work11;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayo;

    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Burger 'full' consists of:" +
                " " + bun +
                ", " + meat +
                ", " + cheese +
                ", " + greens +
                ", " + mayo +
                '.';
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

        printInfo();
    }

    void printInfo() {
        System.out.println("Burger 'dietetic' consists of: " + bun + ", " + meat
                + ", " + cheese + ", " + greens + ".");
    }


    public Burger(String bun, String meat, String cheese, String greens, String mayo, boolean isDouble) {
        this.bun = bun;
        this.meat = isDouble ? "doubleMeat" : meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;

        System.out.println("Burger 'doubleMeat' consists of: " + this.bun + ", " +
                this.meat + ", " + this.cheese + ", " + this.greens + ", " + this.mayo + ".");
    }
}
