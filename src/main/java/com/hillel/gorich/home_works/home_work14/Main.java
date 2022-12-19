package com.hillel.gorich.home_works.home_work14;

import com.hillel.gorich.home_works.home_work14.music_styles.MusicStyles;
import com.hillel.gorich.home_works.home_work14.music_styles.impl.RockMusic;
import com.hillel.gorich.home_works.home_work14.music_styles.impl.ClassicMusic;
import com.hillel.gorich.home_works.home_work14.music_styles.impl.PopMusic;

public class Main {

    public static void main(String[] args) {

        MusicStyles[] musicGroups = {
                new RockMusic("RockMusic"),
                new ClassicMusic("ClassicMusic"),
                new PopMusic("PopMusic")
        };

        for (MusicStyles musicStiles : musicGroups) {
            musicStiles.playMusic();
        }
    }
}
