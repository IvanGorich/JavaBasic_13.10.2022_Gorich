package com.hillel.gorich.home_works.home_work14.music_groups.impl;

import com.hillel.gorich.home_works.home_work14.music_groups.MusicGroup;

public class Roses extends MusicGroup {

    public Roses(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName() + " play Classic-Music");
    }
}
