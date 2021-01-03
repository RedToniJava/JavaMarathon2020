package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figures[] figures = new Figures[]{new Triangle(10, 10, 10, "Red"), new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println(figures[2].getColor());

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }


    public static double calculateRedPerimeter(Figures[] figures) {
        double redPerimeter = 0;
        for (int i = 0; i < figures.length; i++) {

            if (figures[i].getColor() == "Red") {
                redPerimeter += figures[i].perimeter();
            }
        }
        return redPerimeter;
    }


    public static double calculateRedArea(Figures[] figures) {
        double redArea = 0;
        for (int i = 0; i < figures.length; i++) {

            if (figures[i].getColor() == "Red") {
                redArea += figures[i].area();
            }
        }
        return redArea;
    }

}
