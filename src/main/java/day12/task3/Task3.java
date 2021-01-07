package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> bands = new ArrayList<>();

        bands.add(new MusicBand("Пикник ", 1978));
        bands.add(new MusicBand("Rammstein ", 1994));
        bands.add(new MusicBand("Cellar Darling ", 2016));
        bands.add(new MusicBand("ДДТ ", 1980));
        bands.add(new MusicBand("Iriao ", 2013));
        bands.add(new MusicBand("Blondfire ", 2005));
        bands.add(new MusicBand("Кукрыни́ксы ", 1997));
        bands.add(new MusicBand("Ленинград ", 1997));
        bands.add(new MusicBand("Kissogram ", 1999));
        bands.add(new MusicBand("Алиса ", 1983));
        bands.add(new MusicBand("Vaccines ", 2010));

        groupsAfter2000(bands);
        System.out.println();
        for (MusicBand band : bands) {
            System.out.print(band.getName() + " ");
        }

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {

        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                groupsAfter2000.add(band);
                System.out.print(band.getName() + " ");
            }
        }
        return groupsAfter2000;
    }

}

