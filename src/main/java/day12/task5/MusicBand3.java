package day12.task5;

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
public class MusicBand3 {
    private String name;
    private int year;
    private List<MusicArtist> musicArtist;

    public MusicBand3(String name, int year, List<MusicArtist> musicArtist) {
        this.name = name;
        this.year = year;
        this.musicArtist = musicArtist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand3{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", musicArtist=" + musicArtist +
                '}';
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMusicArtist() {
        return musicArtist;
    }

    public void setMusicArtist(List<MusicArtist> musicArtist) {
        this.musicArtist = musicArtist;
    }
    public void printMembers(){
        System.out.println(this.musicArtist);
    }

    public static void transferMembers(MusicBand3 a, MusicBand3 b){
        for (MusicArtist artistList : a.getMusicArtist()){
            b.getMusicArtist().add(artistList);
        }
        a.getMusicArtist().clear();
    }
}
