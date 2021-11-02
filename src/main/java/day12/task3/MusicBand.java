package day12.task3;

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
public class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
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

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
