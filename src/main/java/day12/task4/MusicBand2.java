package day12.task4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Execute in task3 subfolder on day12 *
 * Create a MusicBand class with the name and year
 * fields (the name of the music group and the year
 * of foundation). Create 10 or more instances of the
 * MusicBand class, add them to the list (choose music
 * groups that were created both before 2000 and after,
 * the genre is not important). Shuffle the list. Create
 * static method in Task3 class:
 * public static List <MusicBand> groupsAfter2000 (List <MusicBand> bands)
 * This method takes a list of groups as an argument and
 * returns a new list consisting of groups founded after
 * 2000. Call the groupsAfter2000 (List <MusicBand> bands)
 * method in the main () method on your list of 10 groups.
 * Print both lists (original and with groups founded after 2000) to the console.
 */
public class MusicBand2 {
    private String name;
    private int year;
    private List<String> participant;


    public List<String> getParticipant() {
        return participant;
    }

    public void setParticipant(List<String> participant) {
        this.participant = participant;
    }


    public MusicBand2(String name, int year, List<String> participant) {
        this.name = name;
        this.year = year;
        this.participant = participant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void transferMembers(MusicBand2 a, MusicBand2 b) {
        for (String member : a.getParticipant()) {
            b.getParticipant().add(member);
        }
        a.getParticipant().clear();
    }

    public void showParticipants() {
        System.out.println(this.participant);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand2{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", participant='" + participant + '\'' +
                '}';
    }
}
