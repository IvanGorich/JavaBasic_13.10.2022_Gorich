package com.hillel.gorich.home_works.home_work14;

import com.hillel.gorich.home_works.home_work14.music_groups.MusicStiles;
import com.hillel.gorich.home_works.home_work14.music_groups.impl.RockMusic;
import com.hillel.gorich.home_works.home_work14.music_groups.impl.ClassicMusic;
import com.hillel.gorich.home_works.home_work14.music_groups.impl.PopMusic;

public class Main {

    public static void main(String[] args) {

        MusicStiles[] musicGroups = {
                new RockMusic("RockMusic"),
                new ClassicMusic("ClassicMusic"),
                new PopMusic("PopMusic")
        };

        for (MusicStiles musicStiles : musicGroups) {
            musicStiles.playMusic();
        }
    }
}
