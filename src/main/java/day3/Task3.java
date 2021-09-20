package day3;

import java.util.Scanner;

///*Implement a program that asks the user for two
// numbers 5 times - the dividend and the divisor.
// For these two numbers, the program calculates the
// division result and prints it to the console. If the
// user enters 0 as a divisor, instead of forcibly stopping
// the loop, we skip the iteration and print the “Division by 0” message to the console.
//The else keyword cannot be used in this program.*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            counter++;

            if (b == 0) {
                System.out.println("devi 0");
                continue;
            }
            System.out.println(a / b);
        }
    }
}
