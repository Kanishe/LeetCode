package day6.task1.task2;

public class Task {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("S",12,113,1);
        airplane.info();
        System.out.println(airplane.addFuel(5));
    }

}
