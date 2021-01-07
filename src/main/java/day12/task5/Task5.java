package day12.task5;


import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        MusicBand picnic = new MusicBand("Пикник ", members1, 1978);
        members1.add(new MusicArtist("Admond Shklyrsky", 1955));

        List<MusicArtist> members2 = new ArrayList<>();
        MusicBand rammstein = new MusicBand("Rammstein ", members2, 1994);
        members2.add(new MusicArtist("Till Liderman", 1963));

        MusicBand.union(picnic, rammstein);

        for (MusicArtist member : members1) {
            System.out.print(member.getName() + " " + member.getYear() + " ");
        }


    }
}
