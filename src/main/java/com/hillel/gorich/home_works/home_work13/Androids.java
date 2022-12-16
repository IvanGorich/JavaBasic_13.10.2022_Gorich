package com.hillel.gorich.home_works.home_work13;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Our smartphone calling");
    }

    @Override
    public void sms() {
        System.out.println("Our smartphone sends SMS");
    }

    @Override
    public void internet() {
        System.out.println("Our smartphone goes online");
    }

    @Override
    public void linuxSystem() {
        System.out.println("I use the LinuxOS");
    }
}
