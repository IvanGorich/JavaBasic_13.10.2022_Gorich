package com.hillel.gorich.lessons.home_work6;

public class Shuttles {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; counter < 100; i++) {
            if (i == 4 || i == 9 || (i / 10) == 4 || (i % 10) == 4 || (i / 10) == 9 || (i % 10) == 9 ||
                    (i % 100 / 10) == 4 || (i % 100 / 10) == 9 || (i / 100) == 4 || (i / 100) == 9) {
                continue;
            }
            System.out.println("Shuttle number: " + i);
            counter++;
        }
        System.out.println(counter);
    }
}