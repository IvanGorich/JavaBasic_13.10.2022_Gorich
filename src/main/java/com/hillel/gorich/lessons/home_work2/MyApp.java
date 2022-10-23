package com.hillel.gorich.lessons.home_work2;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Привет!");
        System.out.println();
        System.out.print("Меня зовут Иван. Мне 33 года. ");
        System.out.print("Родом из Харькова.");
        System.out.println(" Я учусь на курсе Java Basic в компьютерной школе Hillel.");
        System.out.println("Сегодня хочу поделиться информацией об одной достопримечательности моего города - 'Зеркальная струя'.");
        System.out.println("Это природный фонтан. Ему 75 лет. Он расположен возле 'Аллеи славы', в центре города.");
        System.out.println("Это место посещают множество туристов и местных жителей каждый день.");
        System.out.println();
        System.out.print("Его географические координаты:");

//        northernLatitude=49°99′86.99″;
//        easternLongitude=36°23′44.76″;

        byte n1 = 49;
        char n2 = '\u00B0';
        byte n3 = 99;
        char n4 = '\u2032';
        float n5 = 86.99f;
        char n6 = '\u2033';

        String north = " northernLatitude: " + n1 + n2 + n3 + n4 + n5 + n6;
        System.out.print(north);
        System.out.print("(северная широта)");

        byte e1 = 36;
        char e2 = '\u00B0';
        byte e3 = 23;
        char e4 = '\u2032';
        float e5 = 44.76f;
        char e6 = '\u2033';
        String east = " easternLongitude: " + e1 + e2 + e3 + e4 + e5 + e6;
        System.out.print(east);
        System.out.println("(восточная долгота)");
        System.out.println();
        System.out.println("Приезжайте! Будем рады видеть!");


//        char northernLatitude2 = 176;
//        char northernLatitude3 = '°'; Думал поставить разные варианты, но посчитал, что это будет смешение стилей.
    }
}
