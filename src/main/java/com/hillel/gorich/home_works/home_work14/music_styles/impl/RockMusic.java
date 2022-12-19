package com.hillel.gorich.home_works.home_work14.music_styles.impl;

import com.hillel.gorich.home_works.home_work14.music_styles.MusicStyles;

public class RockMusic extends MusicStyles {

    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("'" + getName() + "'" + " plays Rock-Music");
    }
}
