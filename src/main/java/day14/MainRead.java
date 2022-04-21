package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainRead {
    public static void main(String[] args) throws FileNotFoundException {
        String separation = File.separator;
        String path = separation + "Users" + separation + "alexandrkanishevskii" + separation +
                "IdeaProjects" + separation + "LeetCode" + separation + "src" + separation + "main"
                + separation + "resources" + separation + "test.txt";
        
        File file = new File(path);
        
        printSumDigits(file);
        
    }
    
    public static void printSumDigits(File file) {
        
        
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] number = line.split(" ");
            if (number.length < 10) {
                throw new RuntimeException("Некорректный входной файл");
            }
            int sum = 0;
            for(String o : number){
                sum += Integer.parseInt(o);
            }
            System.out.println(sum);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
