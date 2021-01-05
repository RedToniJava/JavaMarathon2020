package day9.Task1;

class Teacher extends Human {
    private String nameSubject;

    public String getNameSubject() {
        return nameSubject;
    }

    public Teacher(String name, String nameSubject) {
        super(name);
        this.nameSubject = nameSubject;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Это учитель по имени " + getName());
    }
}
