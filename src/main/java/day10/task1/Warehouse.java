package day10.task1;

/*The online order is assembled and packaged in the warehouse. Create classes:
- "Warehouse". Fields: countOrder(number of orders collected),
 balance(revenue from delivered orders). Get and set methods for both fields.
 To get information about the values of the warehouse fields, redefine the toString() method.
- "Picker" , with the salary field, only get method.
- "Courier" , with the salary field, only g et method.
Each employee class must implement the Worker interface, in which it is
necessary to declare DoWork() methods and bonus().
Every time an employee does his job (calling the DoWork() method), he is paid a
salary (in short. PO) (80 for the collector, 100 for the courier).
And also when calling DoWork() For the Collector, the value of the Countorder
field in the Warehouse class increases to 1. When DoWork() is called for the Courier,
there is an increase in the balance variable in the Warehouse class of 1000.
Employees are entitled to a bonus (individual calculation for each): when the 1500th order
is shipped to the warehouse, the collector's PO earned by that time is tripled.
 When 1.000.000 is earned by the warehouse, the courier's PO earned by that time doubles.
To demonstrate and test the work of the program, create a warehouse and 1 worker each,
 call the doWork() methods for each and bonus(), so many times that each of the employees
  received a bonus. Output to the console the balance and the number of completed orders in the
   warehouse and the PO of each of the employees.
Create a second warehouse, also accept 1 employee with a single call to DoWork() for each.
 Check that the values of Warehouse 1 and its employees do not change at the same time.
Recommendations: To get warehouse data inside employee classes, implement storing a reference
to the Warehouse object and pass it using the constructor or set method.*/

public class Warehouse {
    private int countOrder;
    private int balance;


    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }
}
