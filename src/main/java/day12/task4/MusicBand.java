package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public MusicBand(String name, List<String> members, int year) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void union(MusicBand band1, MusicBand band2) {
        band1.members.addAll(band2.members);
        System.out.println(band1.members);
    }

}
