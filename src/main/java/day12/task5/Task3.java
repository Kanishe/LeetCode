package day12.task5;

import day12.task3.MusicBand;
import day12.task4.MusicBand2;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicArtist> members3 = new ArrayList<>();
        members3.add(new MusicArtist("Alex",19));
        members3.add(new MusicArtist("J",10));
        members3.add(new MusicArtist("MI",15));

        MusicBand3 musicBand3 = new MusicBand3("X",2020,members3);


        List<MusicArtist> members4 = new ArrayList<>();
        members4.add(new MusicArtist("Tom",90));
        members4.add(new MusicArtist("K",50));
        members4.add(new MusicArtist("Dim",89));

        MusicBand3 musicBand4= new MusicBand3("B",1940,members4);

        musicBand3.printMembers();
        musicBand4.printMembers();
        MusicBand3.transferMembers(musicBand3,musicBand4);
        musicBand3.printMembers();
        musicBand4.printMembers();
    }
}
