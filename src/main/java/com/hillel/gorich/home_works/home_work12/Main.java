package com.hillel.gorich.home_works.home_work12;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Ivan", 19, 1, 1989, "ivan@ukr.net",
                "0505050809", "Gorich", 75, 120, 7000);
        user1.printAccountInfo();
        System.out.println();

        User user2 = new User("Kate", 8, 3, 1996, "katya@mail.ru", "0667895346",
                "Ivanova", 50, 110, 5000);
        user2.printAccountInfo();
        System.out.println();

        User user3 = new User("Maks", 25, 8, 1985, "maks@gmail.com", "0605679876",
                "Petrov", 80, 124, 4000);
        user3.printAccountInfo();
        System.out.println();

        user1.setWeight(73);
        user1.setPressure(123);
        user1.setStepNumber(7300);
        user1.printAccountInfo();
        System.out.println();

        user2.setWeight(48);
        user2.setPressure(126);
        user2.setStepNumber(5600);
        user2.printAccountInfo();
    }
}
