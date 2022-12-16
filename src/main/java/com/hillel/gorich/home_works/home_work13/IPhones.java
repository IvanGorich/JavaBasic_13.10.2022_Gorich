package com.hillel.gorich.home_works.home_work13;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Our iphone calling");
    }

    @Override
    public void sms() {
        System.out.println("Our iphone sends SMS");
    }

    @Override
    public void internet() {
        System.out.println("Our iphone goes online");
    }

    @Override
    public void iSystem() {
        System.out.println("I use the IOS");
    }
}
