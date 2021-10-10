package day9.task2;

public class Rectangle extends Figure {
    double a, b, c;

    public Rectangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double halfP = perimeter() / 2;
        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
