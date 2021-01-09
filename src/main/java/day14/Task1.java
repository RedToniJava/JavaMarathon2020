package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        File file = new File("numbers");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[10];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));

        sumNumbers(numbers);

    }


    public static void sumNumbers(int[] numb) {
        int sum = 0;
        for (int i = 0; i < numb.length; i++) {
            sum += numb[i];

        }
        System.out.println(sum);
    }

}
