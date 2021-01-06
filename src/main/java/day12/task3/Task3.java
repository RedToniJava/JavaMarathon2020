package day12.task3;

import java.util.*;


public class Task3 {
    public static void main(String[] args) {

        MusicBand picnic = new MusicBand("Пикник ", 1978);
        MusicBand rammstein = new MusicBand("Rammstein ", 1994);
        MusicBand cellarDarling = new MusicBand("Cellar Darling ", 2016);
        MusicBand vaccines = new MusicBand("Vaccines ", 2010);
        MusicBand ddt = new MusicBand("ДДТ ", 1980);
        MusicBand iriao = new MusicBand("Iriao ", 2013);
        MusicBand blondfire = new MusicBand("Blondfire ", 2005);
        MusicBand kukryniksy = new MusicBand("Кукрыни́ксы ", 1997);
        MusicBand leningrad = new MusicBand("Ленинград ", 1997);
        MusicBand kissogram = new MusicBand("Kissogram ", 1999);
        MusicBand alice = new MusicBand("Алиса ", 1983);

        List<MusicBand> bands = new ArrayList<>();
        
        bands.add(picnic);
        bands.add(cellarDarling);
        bands.add(vaccines);
        bands.add(ddt);
        bands.add(iriao);
        bands.add(blondfire);
        bands.add(kukryniksy);
        bands.add(leningrad);
        bands.add(kissogram);
        bands.add(alice);
        bands.add(rammstein);
        bands.add(rammstein);
        groupsAfter2000(bands);
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {

        List<MusicBand> groupsAfter2000 = new ArrayList<>();


      for (MusicBand element : bands) {
          for (int i = 0; i <= bands.size(); i++) {
              element.getYear();


              if (element.getYear() > 2000) {
                  bands.remove(element);
                  groupsAfter2000.add(element);
              }
          }
      }

            return groupsAfter2000;
    }




    }

