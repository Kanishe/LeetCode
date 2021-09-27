package day4;

import java.util.Random;

//Create a new array of size 100 and fill it with
// random numbers from 0 to 10000.
//Find the maximum among the sums of three adjacent
// elements. For the found triplet with the maximum sum,
// output the value of the sum and the index of the first
// element of the triplet.
//Example:
//* For simplicity, the example is shown on an array of size 10
//[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254] Triple
// with maximum sum: [2789, 4, 8742]
//Console output:
//11535 5*/
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] arry = new int[100];

        for (int i = 0 ; i<arry.length; i++){
            arry[i] = random.nextInt(1000);
        }
        int maxSum = 0;
        int maxSumid= 0;
        for(int i = 0;i<arry.length -2;i++){
            int sum = 0;
            for (int j=i; j<i+3;i++){
                sum = sum + arry[j];
            }
            if(maxSum<sum){
                maxSum = sum;
                maxSumid = i;
            }
        }
        System.out.println(maxSumid);
        System.out.println(maxSum);
    }

}
