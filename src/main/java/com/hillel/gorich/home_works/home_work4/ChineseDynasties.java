package com.hillel.gorich.home_works.home_work4;

public class ChineseDynasties {
    public static void main(String[] args) {
        int attackSoldierLi = 13;
        int attackArcherLi = 24;
        int attackRiderLi = 46;

        int sumLi = 860;

        int sumAmountArmyLi = (attackSoldierLi + attackArcherLi + attackRiderLi) * sumLi;

        System.out.println("IndexSumAmountArmyLi = " + sumAmountArmyLi);


        int attackSoldierMin = 9;
        int attackArcherMin = 35;
        int attackRiderMin = 12;

        final double COEFFICIENT = sumLi * 1.5;

        double sumAmountArmyMin = (attackSoldierMin + attackArcherMin + attackRiderMin) * COEFFICIENT;

        System.out.println("IndexSumAmountArmyMin = " + sumAmountArmyMin);
    }
}
