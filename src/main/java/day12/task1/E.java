package day12.task1;

import java.util.ArrayList;

/*Create a list of strings, add 5 car brands to it,
display the list in the console. Add 1 more car to
the middle, remove the first car from the list.
 Print the list.*/
public class E {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Nissan");
        arr.add("BMW");
        arr.add("Opel");
        arr.add("Tesla");
        arr.add("Ford");
        System.out.println(arr);

        arr.add(3,"Ferrari");
        arr.remove(0);
        System.out.println(arr);

    }
}
