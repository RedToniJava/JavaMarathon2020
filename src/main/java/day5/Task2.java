package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorcycle moto = new Motorcycle("Ural ", 2020, " green");
        System.out.println(moto.getModel() + moto.getYear() + moto.getColor());

    }
}

class Motorcycle {
    private int year;
    private String color;
    private String model;

    public Motorcycle(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;

    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

}
