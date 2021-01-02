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
        String non = "неудовлетворительно";
        String three = "удовлетворительно";
        String four = "хорошо";
        String five = "отлично";
        switch (evaluation) {
            case 2:
                System.out.println("Преподователь " + getName() + " оценил студента " + nameStud + " по предмету " + getEducationSubject() + " " + non);
                break;
            case 3:
                System.out.println("Преподователь " + getName() + " оценил студента " + nameStud + " по предмету " + getEducationSubject() + " " + three);
                break;
            case 4:
                System.out.println("Преподователь " + getName() + " оценил студента " + nameStud + " по предмету " + getEducationSubject() + " " + four);
                break;
            case 5:
                System.out.println("Преподователь " + getName() + " оценил студента " + nameStud + " по предмету " + getEducationSubject() + " " + five);
                break;
        }

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