package day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 1. Создать список строк, добавить в него 5 марок автомобилей,
 * вывести список в консоль. Добавить в середину еще 1 автомобиль,
 * удалить самый первый автомобиль из списка. Распечатать список.
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Ford");
        cars.add("Mercedes");
        cars.add("Tesla");

        System.out.println(cars);

        cars.add(3, "Skoda");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);

    }
}
