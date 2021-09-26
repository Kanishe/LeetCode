package day4;

import java.util.Random;

/*Create a new array of size 100 and fill it
with random numbers from 0 to 10000.
Then, using for each loops, output:
- the largest element of the array
- the smallest element of the array
- the number of array elements ending in 0
- the sum of array elements ending in 0
Sorting is prohibited.*/
public class Task2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//        int a = scanner.nextInt();
        int arr[] = new int[100];
//        int arr2[] = new int[5];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = i;
//            System.out.println(arr2[i]);
//        }
//        int sum2 = 0;
//        for (int count : arr2) {
//            if (count > 0) {
//                sum2 = sum2 + count;
//            }
//        }
//        System.err.println(sum2);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        int max = 0;
        for (int x : arr) {
            if (x > max)
                max = x;
        }
        System.out.println(max);
        int min = 10000;
        for (int y : arr) {
            if (y < min) {
                min = y;
            }
        }
        System.out.println(min);

        int counter = 0;
        for (int count : arr) {
            if (count % 10 == 0) {
                counter++;
            }

        }
        System.out.println(counter);
        int sum = 0;
        for (int count : arr) {
            if (count % 10 == 0) {
                sum += count;
            }
        }
        System.out.println(sum);
    }
}
