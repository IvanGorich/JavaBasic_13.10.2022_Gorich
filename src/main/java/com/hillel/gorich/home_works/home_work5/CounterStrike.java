package com.hillel.gorich.home_works.home_work5;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        int player1 = 0;
        int player2 = 0;
        int player3 = 0;
        int player4 = 0;
        int player5 = 0;
        int player6 = 0;
        int player7 = 0;
        int player8 = 0;
        int player9 = 0;
        int player10 = 0;

        System.out.println("Введите название первой команды:");

        Scanner scanner = new Scanner(System.in);

        String team1 = scanner.nextLine();
        System.out.println("Команда1 : " + "'" + team1 + "'");

        System.out.println("Введите количество фрагов первого игрока:");
        if (scanner.hasNextInt()) {
            player1 = scanner.nextInt();
        } else {
            System.out.println("Неверные данные! Перезапустите приложение!");
            System.exit(0);
        }

        System.out.println("Введите количество фрагов второго игрока:");
        if (scanner.hasNextInt()) {
            player2 = scanner.nextInt();
        } else {
            System.out.println("Неверные данные! Перезапустите приложение!");
            System.exit(0);
        }

        System.out.println("Введите количество фрагов третьего игрока:");
        if (scanner.hasNextInt()) {
            player3 = scanner.nextInt();
        } else {
            System.out.println("Неверные данные! Перезапустите приложение!");
            System.exit(0);
        }

        System.out.println("Введите количество фрагов четвертого игрока:");
        if (scanner.hasNextInt()) {
            player4 = scanner.nextInt();
        } else {
            System.out.println("Неверные данные! Перезапустите приложение!");
            System.exit(0);
        }

        System.out.println("Введите количество фрагов пятого игрока:");
        if (scanner.hasNextInt()) {
            player5 = scanner.nextInt();
        } else {
            System.out.println("Неверные данные! Перезапустите приложение!");
            System.exit(0);
        }

        System.out.println("Введите название второй команды:");
        scanner.nextLine();

        String team2 = scanner.nextLine();
        System.out.println("Команда2 : " + "'" + team2 + "'");

        System.out.println("Введите количество фрагов первого игрока:");
        if (scanner.hasNextInt()) {
            player6 = scanner.nextInt();
        } else {
            System.out.println("Неверные данные! Перезапустите приложение!");
            System.exit(0);
        }

        System.out.println("Введите количество фрагов второго игрока:");
        if (scanner.hasNextInt()) {
            player7 = scanner.nextInt();
        } else {
            System.out.println("Неверные данные! Перезапустите приложение!");
            System.exit(0);
        }

        System.out.println("Введите количество фрагов третьего игрока:");
        if (scanner.hasNextInt()) {
            player8 = scanner.nextInt();
        } else {
            System.out.println("Неверные данные! Перезапустите приложение!");
            System.exit(0);
        }

        System.out.println("Введите количество фрагов четвертого игрока:");
        if (scanner.hasNextInt()) {
            player9 = scanner.nextInt();
        } else {
            System.out.println("Неверные данные! Перезапустите приложение!");
            System.exit(0);
        }

        System.out.println("Введите количество фрагов пятого игрока:");
        if (scanner.hasNextInt()) {
            player10 = scanner.nextInt();
        } else {
            System.out.println("Неверные данные! Перезапустите приложение!");
            System.exit(0);
        }
        System.out.println();

        double averageFirstTeam = (player1 + player2 + player3 + player4 + player5) / 5;
        System.out.println("AverageFirstTeam = " + averageFirstTeam);

        double averageSecondTeam = (player6 + player7 + player8 + player9 + player10) / 5;
        System.out.println("AverageSecondTeam = " + averageSecondTeam);
        System.out.println();

        if (averageFirstTeam > averageSecondTeam) {
            System.out.println("Победила команда - " + team1 + "! " + "Она набрала " + averageFirstTeam + " фрагов.");
        } else if (averageFirstTeam < averageSecondTeam) {
            System.out.println("Победила команда - " + team2 + "! " + "Она набрала " + averageSecondTeam + " фрагов.");
        } else if (averageFirstTeam == averageSecondTeam) {
            System.out.println("Ничья!!!");
        }


    }
}
