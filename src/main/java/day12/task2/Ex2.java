package day12.task2;

import java.util.ArrayList;
import java.util.List;

/*Create a new list, fill it with even numbers from
 0 to 30 and from 300 to 350. Print the list.*/
public class Ex2 {
    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>();


        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                integerArrayList.add(i);
            }
        }
        for (int i = 300; i <= 350; i++) {
            if (i % 2 == 0) {
                integerArrayList.add(i);
            }
        }


        for (Integer in : integerArrayList) {
            System.out.println(in + "\n");
        }
    }
}
