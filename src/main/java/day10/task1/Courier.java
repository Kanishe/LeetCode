package day10.task1;

public class Courier implements Worker{
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary=salary+80;
        warehouse.setCountOrder(warehouse.getCountOrder()+1000);
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", warehouse=" + warehouse +
                '}';
    }

    @Override
    public void bonus() {
        if(warehouse.getBalance()==1_000_000){
            salary*=2;
        }

    }
}
