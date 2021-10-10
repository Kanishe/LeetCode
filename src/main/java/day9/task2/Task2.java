package day9.task2;

public class Task2{
    public static void main(String[] args) {
        Figure [] figure = {
                new Triangle("Red",2,4),
                new Circle("Red",4),
                new Rectangle("Red",4,8,4)
        };
        System.out.println(calculateRedPerimeter(figure));
    }
    public static double calculateRedPerimeter(Figure [] figures){
        double sum = 0;
        for(Figure figure: figures){
            figure.getColor().equals("Red");
                sum+=figure.perimeter();
        }
        return sum;
    }
}
