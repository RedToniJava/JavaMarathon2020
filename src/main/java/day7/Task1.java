package day7;

import java.io.OutputStream;

public class Task1 {
    public static void main(String[] args) {
        Airplane LaGG = new Airplane("ЛаГГ", 1941, 9, 2680, 0);
        Airplane Jak3 = new Airplane("Як3", 1942, 9, 2658, 0);
        LaGG.info();
        Jak3.info();
        Airplane.compareAirplane(LaGG, Jak3);

    }
}

class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private int fuel;
    private static double long1;

    public Airplane(String producer, int year, double length, double weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
        if (length > long1) long1 += length;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength() {
        this.length = length;
    }

    public double getLength() {
        return length;
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

    void fullUp(int n) {
        fuel += n;

    }

    void info() {
        System.out.println("Изготовитель: " + producer + "; год выпуска: " + year + "; длинна: " + length + "; вес: " + weight + "; колличество топлива в баке: " + fuel);
    }

    public static void compareAirplane(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) System.out.println(airplane1.getProducer() + " - длиннее");
        if (airplane2.getLength() > airplane1.getLength()) System.out.println(airplane2.getProducer() + " - длиннее");
        if (airplane2.getLength() == airplane1.getLength()) System.out.println("длины равны");

    }
}
