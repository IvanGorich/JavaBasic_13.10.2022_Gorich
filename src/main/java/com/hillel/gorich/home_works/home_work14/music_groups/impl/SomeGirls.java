package com.hillel.gorich.home_works.home_work14.music_groups.impl;

import com.hillel.gorich.home_works.home_work14.music_groups.MusicGroup;

public class SomeGirls extends MusicGroup {
    public SomeGirls(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName() + " play Pop-music");
    }
}
