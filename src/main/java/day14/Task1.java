package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Создать .txt файл в папке проекта, как показано в видео ъ
 * (урок 36, время 15:30). Заполнить его вручную десятью
 * произвольными числами. Реализовать программу,
 * которая считает сумму всех чисел в этом файле и выводит ее
 * на экран.
 *
 * Если файла не существует в папке проекта, в программе необходимо
 * выбрасывать исключение и выводить в консоль сообщение
 * “Файл не найден”.
 *
 * Помимо этого, если чисел в файле меньше
 * или больше 10, необходимо выбрасывать исключение и выводить в
 * консоль сообщение “Некорректный входной файл”.
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("test1");

        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            if(numbersString.length != 10){
                throw new IllegalArgumentException();
            }

            int sum = 0;

            for (String number : numbersString){
                sum = Integer.parseInt(number);
            }

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException i){
            System.out.println("Некорректный входной файл");
        }
    }
}