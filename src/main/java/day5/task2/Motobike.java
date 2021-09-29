package day5.task2;

public class Motobike {
    private int ageOfCreating;
    private String color;
    private String model;

    public Motobike(int ageOfCreating, String color, String model) {
        this.ageOfCreating = ageOfCreating;
        this.color = color;
        this.model = model;
    }

    public int getAgeOfCreating() {
        return ageOfCreating;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
