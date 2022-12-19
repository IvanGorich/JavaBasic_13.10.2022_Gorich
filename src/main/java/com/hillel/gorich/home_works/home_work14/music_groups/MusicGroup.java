package com.hillel.gorich.home_works.home_work14.music_groups;

public abstract class MusicGroup {

    private String name;

    public MusicGroup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void play();
}
