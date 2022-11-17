package com.hillel.gorich.lessons.home_work8;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {

        int min = 0, max = 9, length = 7;

        int[] firmNumbers = new int[length];
        int[] playerNumbers = new int[length];

        for (int i = 0; i < firmNumbers.length; i++) {
            firmNumbers[i] = (int) (Math.random() * (max - min + 1) + min);
            playerNumbers[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        int temp = -1;
        for (int i = 0; i < firmNumbers.length; i++) {
            for (int j = 0; j < firmNumbers.length - 1 - i; j++) {
                if (firmNumbers[j] > firmNumbers[j + 1]) {
                    temp = firmNumbers[j];
                    firmNumbers[j] = firmNumbers[j + 1];
                    firmNumbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Firm numbers " + Arrays.toString(firmNumbers));

        Arrays.sort(playerNumbers);
        System.out.println("Player numbers " + Arrays.toString(playerNumbers));

        int counter = 0;
        for (int i = 0; i < firmNumbers.length; i++) {
            for (int j = 0; j < playerNumbers.length; j++) {
                if (firmNumbers[i] == playerNumbers[j] && i == j) {
                    counter++;
                    System.out.println("Coincidence" + counter + " in cell " +
                            (i + 1) + ". " + "Matched number: " + firmNumbers[i]);
                }
            }
        }
        System.out.println("Number of coincidences = " + counter + ".");
    }
}
