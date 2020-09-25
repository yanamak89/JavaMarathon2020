package day5;

/**
 * 1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”,
 * “Цвет”, “Модель”. Создать геттеры и сеттеры для каждого поля.
 * Создать экземпляр класса Автомобиль, задать сеттером каждое
 * поле, вывести в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */
public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car(2017, "black", "Toyota Land Cruiser 200");
        int myCarYear = myCar.getYear();
        String myCarColor = myCar.getColor();
        String myCarModel = myCar.getModel();

        System.out.println("My " + myCarModel +  " is " + myCarYear + " year and its " + myCarColor + " color." );

    }
}

class Car{
    private int year;
    private String color;
    private String model;

    public Car(int year, String color, String model){
        this.year=year;
        this.color=color;
        this.model=model;
    }

    public Car(){}

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}