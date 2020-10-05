package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 3. *Выполнять в подпапке task3 в day12*
 * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
 * (название музыкальной группы и год основания). Создать 10 или более
 * экземпляров класса MusicBand , добавить их в список (выбирайте такие
 * музыкальные группы, которые были созданы как до 2000 года, так и после,
 * жанр не важен). Перемешать список. Создать статический метод в классе
 * Task3:
 * public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает
 * новый список, состоящий из групп, основанных после 2000 года.
 * Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main()
 * на вашем списке из 10 групп. Вывести в консоль оба списка
 * (оригинальный и с группами, основанными после 2000 года).
 */
public class Task3 {
    public static void main(String[] args) {
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
