package day9.task2;

public class Triangle extends Figure {
    private double width, height;

    public Triangle(String color, double width, double height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
