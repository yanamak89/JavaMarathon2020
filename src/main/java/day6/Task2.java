package day6;

/**
 * 2. Создать класс Самолет (Airplane) с полями:
 * producer (изготовитель),
 * year (год выпуска),
 * length (длина),
 * weight (вес),
 * fuel (количество топлива в баке) + геттер для этого поля.
 * Создать конструктор в классе Самолет, принимающий в качестве
 * аргументов значения четырех полей класса (значение поля “количество
 * топлива в баке” установить равным 0). В конструкторе для передачи
 * полям значений использовать ключевое слово this. Помимо этого, в
 * классе необходимо реализовать метод info(), который выводит сообщение
 * в следующем формате:
 * “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество
 * топлива в баке: …”
 * Также, необходимо реализовать метод fillUp(), который в качестве
 * аргумента принимает число и заправляет топливный бак самолета на
 * это значение.
 * Создать новый объект класса Самолет с произвольными данными.
 * Изменить год выпуска и длину с помощью сеттеров, вызвать метод
 * fillUp() два раза, передав разные значения. Вызвать метод info().
 */
public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Bombardier Aerospace", 2014 , 27, 15000);
        airplane.setProducer("Bombardier Aerospace");
        airplane.setYear(2011);
        airplane.setLength(35);
        airplane.fillUp(500);
        airplane.fillUp(700);
        airplane.info();

    }
}

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight ) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }


    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " +
                            year + ", длина: " + length + " метров, вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public int fillUp(int tank) {
        return fuel += tank;
    }
}