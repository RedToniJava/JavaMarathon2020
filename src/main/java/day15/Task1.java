package day15;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/missing_shoes.txt");

        try {
            if (file.createNewFile()) System.out.println("Создан новй файл missing_shoes");
            PrintWriter printWriter = new PrintWriter("src/main/resources/missing_shoes.txt");

            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/shoes.csv"));
            String line1 = null;

            while ((line1 = br.readLine()) != null) {

                Scanner scanner = new Scanner(line1);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] shoes = line.split(";");

                    if (Integer.parseInt(shoes[2]) == 0)
                        printWriter.println(Arrays.toString(shoes));
                }
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
