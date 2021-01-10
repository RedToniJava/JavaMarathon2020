package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers");
        meanSumNumbers(file);

    }

    public static void meanSumNumbers(File file) {
        double meanSum;
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[numbersString.length];
            int counter = 0;

            for (String number : numbersString) {
                numbers[counter++] = Integer.parseInt(number);

            }
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];

            }
            meanSum = (double) sum / numbers.length;
            String str = String.format("%.3f", meanSum);
            System.out.println(meanSum);
            System.out.println(str);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}

