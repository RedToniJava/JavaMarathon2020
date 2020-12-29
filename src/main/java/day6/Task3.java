package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teach = new Teacher("Tom", "History");
        Student stud = new Student("Bob");
        teach.evaluate(stud.getName());

    }
}

class Teacher {
    private String name;
    private String educationSubject;
    Random rand = new Random();

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setEducationSubject(String educationSubject) {
        this.educationSubject = educationSubject;
    }

    public String getEducationSubject() {
        return educationSubject;
    }

    public Teacher(String name, String educationSubject) {
        this.name = name;
        this.educationSubject = educationSubject;
    }


    void evaluate(String nameStud) {
        int evaluation = rand.nextInt(4) + 2;
        if (evaluation == 2)
            System.out.println("Преподователь " + getName() + " оценил студента " + nameStud + " по предмету " + getEducationSubject() + " на неудовлетворительно");
        if (evaluation == 3)
            System.out.println("Преподователь " + getName() + " оценил студента " + nameStud + " по предмету " + getEducationSubject() + " на удовлетворительно");
        if (evaluation == 4)
            System.out.println("Преподователь " + getName() + " оценил студента " + nameStud + " по предмету " + getEducationSubject() + " на хорошо");
        if (evaluation == 5)
            System.out.println("Преподователь " + getName() + " оценил студента " + nameStud + " по предмету " + getEducationSubject() + " на отлично");

    }


}

class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
    }
}