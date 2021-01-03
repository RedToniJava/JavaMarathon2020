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
        String mark = "оценка";
        switch (evaluation) {
            case 2:
                mark = "неудовлетворительно";
                break;
            case 3:
                mark = "удовлетворительно";
                break;
            case 4:
                mark = "хорошо";
                break;
            case 5:
                mark = "отлично";
                break;
        }
        System.out.println("Преподователь " + getName() + " оценил студента " + nameStud + " по предмету " + getEducationSubject() + " " + mark);
    }

}

class Student {
    private String name;

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
    }
}