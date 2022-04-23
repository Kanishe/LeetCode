package day14.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class MainReadFromFileTwo {
    public static void main(String[] args) throws FileNotFoundException {
        ParseFileToStringList();
    }
    
    public static List<String> ParseFileToStringList() throws FileNotFoundException {
        File file = new File("/Users/alexandrkanishevskii/IdeaProjects/LeetCode/src/main/resources/fileToTest/NameAge.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String[] arraystr = str.split(" ");
            List<String> stringList = List.of(arraystr);
            System.out.println(stringList);
        }
        return null;
    }
}