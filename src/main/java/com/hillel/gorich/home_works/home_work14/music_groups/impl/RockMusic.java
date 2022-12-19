package com.hillel.gorich.home_works.home_work14.music_groups.impl;

import com.hillel.gorich.home_works.home_work14.music_groups.MusicStiles;

public class RockMusic extends MusicStiles {

    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("'" + getName() + "'" + " plays Rock-Music");
    }
}
