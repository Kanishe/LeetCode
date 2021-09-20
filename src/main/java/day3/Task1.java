package day3;

import java.util.Scanner;

/*Implement a program that displays the name of the country
in the console, taking the name of the city as input. The program
should run until the word “Stop” is entered.

Implement using the following data:
Moscow, Vladivostok, Rostov - Russia Rome, Milan, Turin - Italy

When entering any other city, display the message “Unknown country”.*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String city = scanner.nextLine();

            if (city.equals("Stop")) {
                break;
            }
            switch (city) {
                case "Moscow":
                case "Vladivostok":
                case "Rostov":
                    System.out.println("Russia");
                    break;
                case "Rome":
                case "Milan":
                case "Turin":
                    System.out.println("Italy");
                    break;
                default:
                    System.out.println("Unknown country");
            }
        }
    }
}

