package day7.task1;

import java.util.Map;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void fillUp(int inputFuel) {
        this.fuel += inputFuel;
    }

    public void info() {
        System.out.println("Producer " + producer + " manuf.date +" +
                year + " length " + " volume of the tank " + fuel);
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("airplane1 - longer");
        } else if (airplane2.getLength()>airplane1.getLength()) {
            System.out.println("airplane2 - longer");
        } else System.out.println(" long airplane1 and airplane2 are equal");
    }
}
