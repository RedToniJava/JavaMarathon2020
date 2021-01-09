package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(fileString());

    }

    public static List<String> fileString() {
        File file = new File("people");
        List<String> fileListString = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] people = line.split(" ");
                if (Integer.parseInt(people[1]) < 0)
                    throw new IllegalArgumentException();
                fileListString.add(line);
            }
            return fileListString;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;

    }
}
