package com.hillel.gorich.home_works.home_work14;

import com.hillel.gorich.home_works.home_work14.music_groups.MusicGroup;
import com.hillel.gorich.home_works.home_work14.music_groups.impl.Metal;
import com.hillel.gorich.home_works.home_work14.music_groups.impl.Roses;
import com.hillel.gorich.home_works.home_work14.music_groups.impl.SomeGirls;
import com.hillel.gorich.home_works.home_work14.music_styles.MusicStyles;
import com.hillel.gorich.home_works.home_work14.music_styles.impl.ClassicMusic;
import com.hillel.gorich.home_works.home_work14.music_styles.impl.PopMusic;
import com.hillel.gorich.home_works.home_work14.music_styles.impl.RockMusic;

public class Main {
    public static void main(String[] args) {
        MusicGroup[] musicGroups = {
                new Metal("Metal"),
                new Roses("Roses"),
                new SomeGirls("SomeGirls")
        };

        for (MusicGroup musicGroup : musicGroups) {
            musicStyles.playMusic(musicGroup);
        }
    }
}
