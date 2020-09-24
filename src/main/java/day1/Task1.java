package day1;
/**
1. Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, используя цикл while.
Вывод в консоль должен быть таким:
JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
*/
public class Task1 {
    public static void main(String[] args) {

        int value = 0;
        while (value < 10) {
            System.out.print("JAVA ");
            value ++;
        }

    }
}
