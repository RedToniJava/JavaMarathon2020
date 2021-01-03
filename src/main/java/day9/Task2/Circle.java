package day9.Task2;

class Circle extends Figures {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double perimeter() {
        return 2 * Math.PI * getRadius();
    }
}
