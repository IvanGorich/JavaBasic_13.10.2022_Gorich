package com.hillel.gorich.home_works.home_work14.music_styles;

public abstract class MusicStyles {

    private String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void playMusic();
}
