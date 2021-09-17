package day1;
/*
2.Есть два числа,которые задаются пользователем через консоль(назовем эти два числа a и b).
        Используя цикл for,вывести все числа из диапазона между a  и b, которые делятся на 5без остатка,но при этом не делятся на 10 без остатка.
*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 0 && i % 10 !=0){
                System.out.println(i);
            }
        }
    }
}
