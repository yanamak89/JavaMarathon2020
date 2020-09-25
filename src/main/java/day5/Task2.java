package day5;

/**
 * 2. Создать класс Мотоцикл (англ. Motorbike), с  полями
 * “Год выпуска”, “Цвет”, “Модель”. Создать экземпляр класса
 * Мотоцикл, с помощью конструктора (сеттеры не использовать).
 * Придерживаться принципов инкапсуляции и использовать ключевое
 * слово this. Геттером получить год выпуска, цвет, модель,
 * вывести значения в консоль.
 */
public class Task2 {

    public static void main(String[] args) {

        Motorbike moto = new Motorbike(2020, "black", "Honda");
        int motoYear = moto.getYear(2020);
        String motoColor = moto.getColor("Black");
        String motoModel = moto.getModel("Honda");

        System.out.println("My " + motoModel + " is " + motoColor + " color and it's " + motoYear + " year.");


    }
}

class Motorbike{
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model=model;
    }

    public Motorbike(){}

    public int getYear(int i) {
        return year;
    }

    public String getColor(String black) {
        return color;
    }

    public String getModel(String honda) {
        return model;
    }
}