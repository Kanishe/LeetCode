package day7.task2;

public class Player {
    private int stamina;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("team have " + (6 - countPlayers) + "places");
        } else if (countPlayers == 6) {
            System.out.println("team haven't places");
        }
    }
}
