package day8;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2000, 150, 10000);
        System.out.println(airplane);

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

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;

    }

    void fullUp(int n) {
        fuel += n;

    }

    public String toString() {

        return "Изготовитель: " + producer + "; год выпуска: " + year + "; длинна: " + length + "; вес: " + weight;
    }


    void info() {
        System.out.println("Изготовитель: " + producer + "; год выпуска: " + year + "; длинна: " + length + "; вес: " + weight);
    }
}

