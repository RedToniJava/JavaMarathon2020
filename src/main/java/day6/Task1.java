package day6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год производства авто");
        int yearCar = scan.nextInt();
        System.out.println("Введите год производства мотоцикла");
        int yearMotorcycle = scan.nextInt();

        Car tesla = new Car();
        Motorcycle ural = new Motorcycle();
        ural.setInputYear(yearMotorcycle);
        ural.info();
        ural.yearDifference(ural.getInputYear());
        tesla.setInputYear(yearCar);
        tesla.info();
        tesla.yearDifference(tesla.getInputYear());


    }
}
