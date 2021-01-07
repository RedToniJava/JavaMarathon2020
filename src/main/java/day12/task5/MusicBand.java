package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public MusicBand(String name, List<MusicArtist> members, int year) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void union(MusicBand band1, MusicBand band2) {
        band1.members.addAll(band2.members);

    }

}
