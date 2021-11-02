package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("The hatters", 2001);
        MusicBand band2 = new MusicBand("The X", 2033);
        MusicBand band3 = new MusicBand("The G", 1992);
        MusicBand band4 = new MusicBand("The Q", 2022);
        MusicBand band5 = new MusicBand("The R", 2000);

        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(band1);
        musicBandList.add(band2);
        musicBandList.add(band3);
        musicBandList.add(band4);
        musicBandList.add(band5);

//        System.out.print(musicBandList + "\n");

//        Collections.shuffle(musicBandList);
//        System.out.print(musicBandList + "\n");

        List<MusicBand> musicBandsAfter200 = new ArrayList<>();
        for (MusicBand band : musicBandList) {
            if (band.getYear() > 2000){
                musicBandsAfter200.add(band);
            }
            System.out.print(musicBandsAfter200 + "\n");
        }

    }
}
