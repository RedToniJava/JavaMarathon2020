package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int max = 0;
        int min = 10000;
        int array0 = 0;
        int array0Sum = 0;
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            array[i] = rand.nextInt(10000);
            if (array[i] % 10 == 0) {
                array0Sum = array0Sum + array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i : array) {
            if (i > max) max = i;
        }

        for (int i : array) {
            if (i < min) min = i;
        }
        System.out.println(max + " - наибольший элемент массива");
        System.out.println(min + " - наименьший элемент массива");
        System.out.println(array0 + " - количество элементов массива, оканчивающихся на 0");
        System.out.println(array0Sum + " - сумму элементов массива, оканчивающихся на 0");


    }
}
