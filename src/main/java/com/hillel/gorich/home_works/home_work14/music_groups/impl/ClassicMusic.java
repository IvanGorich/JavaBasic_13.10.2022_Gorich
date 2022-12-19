package com.hillel.gorich.home_works.home_work14.music_groups.impl;

import com.hillel.gorich.home_works.home_work14.music_groups.MusicStiles;

public class ClassicMusic extends MusicStiles {

    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("'" + getName() + "'" + " plays Classic-Music");
    }
}
