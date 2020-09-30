package day8;

public class Airplane {
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

    //Изготовитель: boeing, год выпуска: 1990, длина: 20000, вес: 60000, количество топлива в баке: 0
    public void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " +
                year + ", длина: " + length + " метров, вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public int fillUp(int tank) {
        return fuel += tank;
    }

    @Override
    public String toString() {
        return "Изготовитель: " + producer + ", год выпуска: " +
                year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel;

    }
}
