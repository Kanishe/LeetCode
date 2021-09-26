package day4;

import java.util.Random;

/*Fill a two-dimensional array (matrix) with random
numbers from 0 to 50. Set the size of the matrix to m = 12,
 n = 8 (m - row dimension, n - column dimension).
 Print to the console the index of the line, the
 sum of the numbers in which is the maximum. If there
  are several such lines, print the index of the last one.
An example of a generated matrix (for simplicity, m = 3, n = 5):
32157 // sum-18 12562 // sum-16 34964 // sum-26
Answer: 2 (index of the string, the sum of the numbers in which is the maximum)*/
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int matrix [][] = new int[12][8];
        for (int i = 0; i<matrix.length;i++){
            for (int j = 0; j< matrix[i].length;j++){
                matrix[i][j]= random.nextInt(50);
                System.out.println(matrix[i][j]+"\n");
            }

        }


    }
}
