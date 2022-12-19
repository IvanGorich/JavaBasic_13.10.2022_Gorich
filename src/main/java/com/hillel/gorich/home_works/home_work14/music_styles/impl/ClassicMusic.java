package com.hillel.gorich.home_works.home_work14.music_styles.impl;

import com.hillel.gorich.home_works.home_work14.music_groups.MusicGroup;
import com.hillel.gorich.home_works.home_work14.music_styles.MusicStyles;

public class ClassicMusic extends MusicStyles {

    @Override
    public void playMusic(MusicGroup musicGroups) {
        musicGroups.play();
    }
}
