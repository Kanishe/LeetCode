package day3;

import java.util.Scanner;

//*To implement a program that is still running,
// it accepts two numbers as input from the user
// - the dividend and the divisor. For these two
// numbers, the program calculates the division
// result and prints it to the console. The program
// stops running when the user enters 0 as a divisor.
//(for these real numbers, you must use the double
// type and the Scanner's nextDouble () method, respectively).*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0) {
                break;
            }

            System.out.println(a / b);
        }
    }
}
