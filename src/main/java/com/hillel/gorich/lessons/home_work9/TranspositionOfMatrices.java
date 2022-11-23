package com.hillel.gorich.lessons.home_work9;

import java.util.Scanner;

public class TranspositionOfMatrices {
    public static void main(String[] args) {

        int M = 0;
        int N = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please set the number of matrix rows from 1 to 10");
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                scanner.nextLine();
                if (M >= 1 && M <= 10) {
                    break;
                } else {
                    System.out.println("ENTER FROM 1 TO 10");
                }
            } else {
                System.out.println("Wrong data. Try again");
                scanner.nextLine();
            }
        }

        while (true) {
            System.out.println("Please, set the number of matrix columns from 1 to 10");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                scanner.nextLine();
                if (N >= 1 && N <= 10) {
                    break;
                } else {
                    System.out.println("ENTER FROM 1 TO 10");
                }
            } else {
                System.out.println("Wrong data. Try again");
                scanner.nextLine();
            }
        }

        int[][] firstArray = new int[M][N];

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                firstArray[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println("First matrix");

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                System.out.print(firstArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int[][] secondArray = new int[N][M];

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                secondArray[i][j] = firstArray[j][i];
            }
        }

        System.out.println("Second matrix");

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                System.out.print(secondArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
