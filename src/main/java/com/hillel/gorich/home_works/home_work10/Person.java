package com.hillel.gorich.home_works.home_work10;

public class Person {
    public static void main(String[] args) {
        String personInfo = personInfo("Will", "Smith", "New York", "+631-029-367-29-46");
        System.out.println(personInfo);
        personInfo = personInfo("Jackie", "Chan", "Shanghai", "+86-21-123-124-12-41");
        System.out.println(personInfo);
        personInfo = personInfo("Sherlock", "Holmes", "London", "+44-20-377-421-23-51");
        System.out.println(personInfo);
    }

    static String personInfo(String name, String surname, String city, String telephone) {
        return "Позвонить гражданину " + name + " " + surname +
                " из города " + city + " можно по номеру " + telephone + ".";
    }
}
