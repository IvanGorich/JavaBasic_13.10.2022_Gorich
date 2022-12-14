package com.hillel.gorich.home_works.home_work7;

public class Rugby {
    public static void main(String[] args) {
        int min = 18;
        int max = 40;
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int sumAgeTeam1 = 0;
        int sumAgeTeam2 = 0;
        double averageAgeTeam1 = 0;
        double averageAgeTeam2 = 0;

        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        for (int i = 0; i < team1.length; i++) {
            if (i == 0) {
                System.out.print("Age list team1: " + team1[i] + ", ");
            }
            if (i != 0 && i < team1.length) {
                System.out.print(team1[i] + ", ");
            }
            if (i == team1.length - 1) {
                System.out.println(team1[i] + ".");
            }
        }
        System.out.println();

        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        for (int i = 0; i < team2.length; i++) {
            if (i == 0) {
                System.out.print("Age list team2: " + team2[i] + ", ");
            }
            if (i != 0 && i < team2.length) {
                System.out.print(team2[i] + ", ");
            }
            if (i == team2.length - 1) {
                System.out.println(team2[i] + ".");
            }
        }
        System.out.println();

        for (int i = 0; i < team1.length; i++) {
            sumAgeTeam1 += team1[i];
        }
        averageAgeTeam1 = ((double) sumAgeTeam1) / team1.length;
        System.out.println("Average age of first team players: " + Math.round(averageAgeTeam1));
        System.out.println();

        for (int i = 0; i < team2.length; i++) {
            sumAgeTeam2 += team2[i];
        }
        averageAgeTeam2 = ((double) sumAgeTeam2) / team2.length;
        System.out.println("Average age of second team players: " + Math.round(averageAgeTeam2));
        System.out.println();

        if (averageAgeTeam1 > averageAgeTeam2) {
            double differen??e1 = averageAgeTeam1 - averageAgeTeam2;
            differen??e1 = Math.round(differen??e1 * 100);
            System.out.println("Average age of first team players more by: " + differen??e1 / 100);
        } else if (averageAgeTeam2 > averageAgeTeam1) {
            double differen??e2 = averageAgeTeam2 - averageAgeTeam1;
            differen??e2 = Math.round(differen??e2 * 100);
            System.out.println("Average age of second team players more by: " + differen??e2 / 100);
        } else {
            System.out.println("The average age of players on both teams is the same.");
        }
    }
}
