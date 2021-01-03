package day9.Task2;

class Rectangle extends Figures {
    private double width;
    private double height;

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return getHeight() * getWidth();
    }

    public double perimeter() {
        return (getHeight() + getWidth()) * 2;
    }
}
