package day5;

public class Task1 {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.setYear(2020);
        tesla.setColor("Black");
        tesla.setModel("Tesla model T");
        System.out.println("Автомобиль - " + tesla.getModel() + ", " + tesla.getColor() + ", " + tesla.getYear());

    }
}

class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
