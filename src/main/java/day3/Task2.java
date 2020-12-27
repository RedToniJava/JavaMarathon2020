package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double result = a / b;

            if (b != 0) {
                System.out.println(result);
                continue;
            } else
                System.out.println("На 0 делить нельзя");
            break;
        }

    }
}
