package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;
        int sum8 = 0;
        int sum9 = 0;
        int sum10 = 0;
        int sum11 = 0;
        int[][] array = new int[m][n];
        Random rand = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = rand.nextInt(50);
                if (i == 0)
                    sum = sum + array[i][j];
                if (i == 1)
                    sum1 = sum + array[i][j];
                if (i == 2)
                    sum2 = sum + array[i][j];
                if (i == 3)
                    sum3 = sum + array[i][j];
                if (i == 4)
                    sum4 = sum + array[i][j];
                if (i == 5)
                    sum5 = sum + array[i][j];
                if (i == 6)
                    sum6 = sum + array[i][j];
                if (i == 7)
                    sum7 = sum + array[i][j];
                if (i == 8)
                    sum8 = sum + array[i][j];
                if (i == 9)
                    sum9 = sum + array[i][j];
                if (i == 10)
                    sum10 = sum + array[i][j];
                if (i == 11)
                    sum11 = sum + array[i][j];
            }

        }
        int[] max = {sum, sum1, sum2, sum3, sum4, sum5, sum6, sum7, sum8, sum9, sum10, sum11};
        int maxSum = 0;
        int index = -1;
        for (int t = 0; t < max.length; t++) {
            for (int z : max) {
                if (z > maxSum) maxSum = z;
            }
            if (max[t] == maxSum) {
                index = t;
            }
        }
        System.out.println("Ответ: " + index + "(индекс строки, сумма чисел в которой максимальна)");

    }
}
