package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int x = 0;
        int y = 0;
        int z = 0;
        int u = 0;
        int sum = 0;

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);

            if (array[i] > 8) x++;
            if (array[i] == 1) y++;
            if (array[i] % 2 == 0) z++;
            if (array[i] % 2 != 0) u++;

        }
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива: " + array.length);
        System.out.println("Колличество чисел больше 8: " + x);
        System.out.println("Колличество чисел равных 1: " + y);
        System.out.println("Колличество четных чисел: " + z);
        System.out.println("Колличество нечетных чисел: " + u);
        System.out.println("Сумма эллементов массива: " + sum);


    }
}
