package day6.task1;

public class Motobike {
    private int ageOfCreating;
    private String color;
    private String model;

    public int yearDifferent(int y){
        return y - ageOfCreating;
    }

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
