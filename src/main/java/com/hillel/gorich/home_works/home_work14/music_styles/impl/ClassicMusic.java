package com.hillel.gorich.home_works.home_work14.music_styles.impl;

import com.hillel.gorich.home_works.home_work14.music_styles.MusicStyles;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("'" + getName() + "'" + " plays Classic-Music");
    }
}
