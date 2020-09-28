package day6;

import java.sql.SQLOutput;

/**
 * 1. В классах Автомобиль и Мотоцикл из прошлого дня реализовать два метода:
 * info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * yearDifference() - принимает на вход число (год), и возвращает разницу
 * между переданным годом и годом выпуска транспортного средства
 */
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2017);
        car.setColor("Black");
        car.setModel("Toyota");
        car.info();
        System.out.println("Введи год автомобиля: ");
        int diff = car.yearDifference();
        System.out.println("Разница между введенным годом и годом выпуска " + diff + " года.");

        Motorbike motorbike = new Motorbike();
        motorbike.setYear(1960);
        motorbike.info();
        System.out.println("Введи год мотоцикла: ");
        int diffMoto = motorbike.yearDifference();
        System.out.println("Разница между введенным годом и годом выпуска " + diffMoto + " года.");


    }
}

