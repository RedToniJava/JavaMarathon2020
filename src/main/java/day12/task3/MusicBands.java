package day12.task3;

public abstract class MusicBands {
    private String name;
    private int year;

    public String getName(){
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return getName()+" "+getYear();
    }
}
