package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return "MusicBand{" +
                "name'" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void bandsAfrer2000(){
        MusicBand band1 = new MusicBand("Barcode Brothers", 1999);
        MusicBand band2 = new MusicBand("Catamenia", 1995);
        MusicBand band3 = new MusicBand("Marlango", 2002);
        MusicBand band4 = new MusicBand("Tesla Boy", 2008);
        MusicBand band5 = new MusicBand("Scar The Martyr", 2013);
        MusicBand band6 = new MusicBand("Dio – Distraught Overlord", 2006);
        MusicBand band7 = new MusicBand("Newsboys", 1985);
        MusicBand band8 = new MusicBand("Audio Two", 1985);
        MusicBand band9 = new MusicBand("Garmarna", 1990);
        MusicBand band10 = new MusicBand("Creed", 1994);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(musicBands);

        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();
        for (MusicBand band : musicBands) {
            if (band.getYear() > 2000) {
                musicBandsAfter2000.add(band);
            }
        }
        System.out.println(musicBandsAfter2000);
    }

}
