package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*1.Number n is entered from the keyboard - the size of the array.
It is necessary to create an array of the specified size and fill
it with random numbers from 0 to 10. Then output the contents of
the array to the console, and also output information about:
a) The length of the array
b) The number of numbers is more than 8
c) The number of numbers equal to 1
d) The number of even numbers
e) The number of odd numbers
f) The sum of all elements of the array
Example:
The number 10 was entered. The following array was generated:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
Array info:
Array length: 10
*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr = scanner.nextInt();

        Random random = new Random();

        int [] arry = new int[arr];

        for (int i = 0; i<arry.length;i++){
            arry[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arry));

    }

}
