package day12.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. *Выполнять в подпапке task5 в day12*
 * Скопировать MusicBand из прошлого задания и доработать - теперь у участника
 * музыкальной группы есть не только имя, но и возраст. Соответственно,
 * теперь под участником понимается не строка, а объект класса MusicArtist.
 * Необходимо реализовать класс MusicArtist и доработать класс MusicBand
 * (создать копию класса) таким образом, чтобы участники были - объекты
 * класса MusicArtist. После этого, надо сделать то же самое, что и
 * требовалось в 4 задании - слить две группы и проверить состав
 * групп после слияния. Методы для слияния и для вывода участников
 * в консоль необходимо тоже переработать, чтобы они работали с объектами
 * класса MusicArtist.
 */
public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Scott Stapp", 50));
        members1.add(new MusicArtist("Mark Tremonti",48));
        members1.add(new MusicArtist("Brian Marshall", 55));
        members1.add(new MusicArtist("Scott Phillips", 58));

        MusicBand band1 = new MusicBand("Creed", 1994, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Anders Øland", 35));
        members2.add(new MusicArtist("Christian Møller Nielsen", 23));

        MusicBand band2 = new MusicBand("Barcode Brothers", 1994, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();

    }
}
