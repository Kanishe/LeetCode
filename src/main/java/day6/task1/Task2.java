package day6.task1;

public class Task2 {
    public static void main(String[] args) {
        Motobike motobike = new Motobike(1, "RED", "TESLA");
        System.out.println(motobike.getAgeOfCreating());
        Motobike motobike1 = new Motobike(10,"R","4");
        System.out.println(motobike1.yearDifferent(100));
    }
}
