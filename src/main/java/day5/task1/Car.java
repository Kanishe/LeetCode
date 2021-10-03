package day5.task1;


import java.util.Locale;

public class Car {
    private int ageOfCreating;
    private String color;
    private String model;

    public void setAgeOfCreating(int ageOfCreating) {
        this.ageOfCreating = ageOfCreating;
    }

    public int getAgeOfCreating() {
        return ageOfCreating;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ageOfCreating=" + ageOfCreating +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color.toLowerCase(Locale.ROOT);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
