package day6.task1;

public class Car {
    private int ageOfCreating;
    private String color;
    private String model;

    public Car(int ageOfCreating, String color, String model) {
        this.ageOfCreating = ageOfCreating;
        this.color = color;
        this.model = model;
    }

    public int getAgeOfCreating() {
        return ageOfCreating;
    }

    public void setAgeOfCreating(int ageOfCreating) {
        this.ageOfCreating = ageOfCreating;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
