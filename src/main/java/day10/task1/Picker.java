package day10.task1;

public class Picker implements Worker{
    private int salary;
    private Warehouse warehouse;

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", warehouse=" + warehouse +
                '}';
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary=salary+100;
    }

    @Override
    public void bonus() {
        if(warehouse.getCountOrder()>1500){
            salary= salary*3;
        }

    }
}
