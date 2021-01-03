package day9.Task2;

public class Triangle extends Figures {
    private double side1;
    private double side2;
    private double side3;
    private double p;

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getP() {
        return p;
    }

    public Triangle(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        p = (getSide1() + getSide2() + getSide3()) / 2;
    }


    @Override
    public double area() {
        return Math.sqrt(getP() * (getP() - getSide1()) * (getP() - getSide2()) * (getP() - getSide3()));
    }

    public double perimeter() {
        return getP() * 2;
    }
}
