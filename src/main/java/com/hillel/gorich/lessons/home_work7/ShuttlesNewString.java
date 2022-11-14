package com.hillel.gorich.lessons.home_work7;

public class ShuttlesNewString {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; counter < 100; i++) {
            String stringNumber = String.valueOf(i);
            if (stringNumber.contains("4") || stringNumber.contains("9")) {
                continue;
            }
            System.out.println("Shattle number: " + i);
            counter++;
        }
        System.out.println(counter);
    }
}
