package com.hillel.gorich.home_works.home_work13;

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.linuxSystem();

        System.out.println();

        IPhones iPhone = new IPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.iSystem();

        System.out.println();
    }
}
