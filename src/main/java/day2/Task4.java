package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y1 = (Math.pow(x, 2) - 10) / (x + 7);
        double y2 = (x + 3) * (Math.pow(x, 2) - 2);

        double y3 = 420;
        if (x >= 5) {
            System.out.println(y1);
        } else if (x > -3 & x < 5) {
            System.out.println(y2);
        } else
            System.out.println(y3);

    }
}
