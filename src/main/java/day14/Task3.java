package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file1 = new File("people");
        System.out.println(parseFileToObjList(file1));

    }

    public static List<Human> parseFileToObjList(File file) {
        Human person = new Human();

        List<Human> fileListString = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] people = line.split(" ");
                person.setName(people[0]);

                if (Integer.parseInt(people[1]) < 0)
                    throw new IllegalArgumentException();
                person.setYear(Integer.parseInt(people[1]));
                fileListString.add(person);
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
