package com.hillel.gorich.home_works.home_work12;

public class User {

    private final String name;
    private final int day;
    private final int month;
    private final int year;
    private final String email;
    private final String phone;
    private final int age;
    String surname;
    int weight;
    int pressure;
    int stepNumber;

    public User(String name, int day, int month, int year, String email, String phone, String surname,
                int weight, int pressure, int stepNumber) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.age = 2020 - year;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.stepNumber = stepNumber;
    }

    public void printAccountInfo() {
        System.out.println("User: " + surname + " " + name + '\n' + "Was born " + day + "." + month + "." + year + " - "
                + age + " years." + '\n' + "E-mail: " + email + '\n' + "Phone number: " + phone + '\n' + "Weight: " +
                weight + ", " + "pressure: " + pressure + ", " + "step number today: " + stepNumber + ".");
    }
}


