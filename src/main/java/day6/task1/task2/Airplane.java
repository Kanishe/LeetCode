package day6.task1.task2;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println(producer + year + weight + fuel);
    }

    public int addFuel(int fuelIncome) {
        fuel=fuel+fuelIncome;
        return fuel;
    }
}