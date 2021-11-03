package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Alex");
        members1.add("Box");
        MusicBand2 band21 = new MusicBand2("X", 2000, members1);
        List<String> members2 = new ArrayList<>();
        members2.add("Rob");
        members2.add("Gob");
        MusicBand2 band22 = new MusicBand2("Z", 2022, members2);

        band21.showParticipants();
        band22.showParticipants();

        MusicBand2.transferMembers(band21,band22);
        band21.showParticipants();
        band22.showParticipants();

    }
}
