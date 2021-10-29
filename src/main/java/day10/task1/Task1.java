package day10.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

//        System.out.println(warehouse +" :"+courier+" :" + picker);
        courier.doWork();
        picker.doWork();
        courier.doWork();
        picker.doWork();


        System.out.print(warehouse +" "+picker+" " + courier);
        picker.bonus();
        courier.bonus();
    }
}
