package com.hillel.gorich.home_works.home_work12;

public class User {

    private final String name;
    private final int day;
    private final int month;
    private final int year;
    private final String email;
    private final String phone;
    private int age;
    private String surname;
    private int weight;
    private int pressure;
    private int stepNumber;


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

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public int getPressure() {
        return pressure;
    }

    public int getStepNumber() {
        return stepNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }
}


