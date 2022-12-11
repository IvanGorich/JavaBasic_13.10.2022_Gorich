package com.hillel.gorich.home_works.home_work7;

import java.util.Scanner;

public class CounterStrikeNewCyclesArrays {
    public static void main(String[] args) {

        int[] playersTeam1 = new int[5];
        int[] playersTeam2 = new int[5];

        System.out.println("Введите название первой команды:");

        Scanner scanner = new Scanner(System.in);

        String nameTeam1 = scanner.nextLine();
        System.out.println("Команда1 : " + "'" + nameTeam1 + "'");

        for (int i = 0; i < playersTeam1.length; i++) {
            System.out.println("Введите количество фрагов " + (i + 1) + " игрока первой команды");
            if (scanner.hasNextInt()) {
                playersTeam1[i] = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Некорректный ввод!");
            }
        }
        System.out.println("Введите название второй команды:");
        scanner.nextLine();
        String nameTeam2 = scanner.nextLine();
        System.out.println("Команда2 : " + "'" + nameTeam2 + "'");

        for (int i = 0; i < playersTeam2.length; i++) {
            System.out.println("Введите количество фрагов " + (i + 1) + " игрока второй команды");
            if (scanner.hasNextInt()) {
                playersTeam2[i] = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Некорректный ввод!");
            }
        }

        System.out.println();
        int sumFirstTeam = 0;
        int sumSecondTeam = 0;
        double averageFirstTeam = 0;
        double averageSecondTeam = 0;

        for (int i = 0; i < playersTeam1.length; i++) {
            sumFirstTeam += playersTeam1[i];
        }
        averageFirstTeam = sumFirstTeam / playersTeam1.length;
        System.out.println("Sum First Team = " + sumFirstTeam);
        System.out.println("Average First Team = " + averageFirstTeam);

        for (int i = 0; i < playersTeam2.length; i++) {
            sumSecondTeam += playersTeam2[i];
        }
        averageSecondTeam = sumSecondTeam / playersTeam2.length;
        System.out.println("Sum Second Team = " + sumSecondTeam);
        System.out.println("Average Second Team = " + averageSecondTeam);

        System.out.println();

        if (averageFirstTeam > averageSecondTeam) {
            System.out.println("Победила команда - " + nameTeam1 + "! " + "Она набрала " + averageFirstTeam + " фрагов.");
        } else if (averageFirstTeam < averageSecondTeam) {
            System.out.println("Победила команда - " + nameTeam2 + "! " + "Она набрала " + averageSecondTeam + " фрагов.");
        } else if (averageFirstTeam == averageSecondTeam) {
            System.out.println("Ничья!!!");
        }


    }
}
