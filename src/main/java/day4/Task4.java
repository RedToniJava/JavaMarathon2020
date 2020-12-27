package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int max=0;
        int min=29997;
        int sum=0;
        Random rand= new Random();

        for(int i=0;i<array.length;i++){
            array[i] = rand.nextInt(10000);

        }
        for(int i:array) {

            if (i < 98)
                sum = array[i] + array[i + 1] + array[i + 2];
            if(sum>max&i<98)
            System.out.println(array[i]);
        }

        System.out.println(sum);

    }
}
