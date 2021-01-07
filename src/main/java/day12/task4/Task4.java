package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>();
        MusicBand picnic = new MusicBand("Пикник ", members1, 1978);
        members1.add("Admon Shklyrsky");

        List<String> members2 = new ArrayList<>();
        MusicBand rammstein = new MusicBand("Rammstein ", members2, 1994);
        members2.add("Till Liderman");

        MusicBand.union(picnic, rammstein);


    }
}
