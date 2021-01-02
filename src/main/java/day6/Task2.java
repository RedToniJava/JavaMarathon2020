package day6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Airplane LaGG = new Airplane("ЛаГГ", 1941, 8.81, 2680, 0);
        LaGG.setFuel(scan.nextInt());
        LaGG.fullUp(LaGG.getFuel());
        LaGG.info();
        LaGG.setFuel(scan.nextInt());
        LaGG.fullUp(LaGG.getFuel());
        LaGG.info();


    }
}

class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private int fuel;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;

    }

    public Airplane(String producer, int year, double length, double weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    void fullUp(int n) {
        fuel += n;

    }

    void info() {
        System.out.println("Изготовитель: " + producer + "; год выпуска: " + year + "; длинна: " + length + "; вес: " + weight + "; колличество топлива в баке: " + fuel);
    }
}
