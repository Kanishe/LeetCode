package day14.ex4ReadFileAndConvertToObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainReadFileAndConvertToObject {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }
    
    public static List<Person> parseFileToObjList() {
        File file = new File("/Users/alexandrkanishevskii/IdeaProjects/LeetCode/src/main/resources/fileToTest/name_age_two.txt");
        List<Person> personList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                
                Person person1 = new Person(person[1], Integer.parseInt(person[0]));
                personList.add(person1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("“Файл не найден”.");
        }
        return personList;
    }
}

