package day9.Task2;

public abstract class Figures {
    private String color;

    public String getColor() {
        return color;
    }

    public Figures(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();

}
