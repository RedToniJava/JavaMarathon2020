package day9.Task1;

class Human {
    private String name;


    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Это человек по имени "+getName());
    }
}
