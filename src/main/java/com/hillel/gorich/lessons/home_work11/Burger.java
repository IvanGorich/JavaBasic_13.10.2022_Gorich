package com.hillel.gorich.lessons.home_work11;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayo;
    int n;

    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
    }

    public Burger(String bun, String meat, int n, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        this.n = 2;
    }
}
