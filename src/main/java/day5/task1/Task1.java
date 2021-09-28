package day5.task1;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("RED");
        car.setAgeOfCreating(1);
        car.setModel("Tesla");
        System.out.println(car.getColor()+"\n"+car.getAgeOfCreating()+"\n"+car.getModel());
    }

}
