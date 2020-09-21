package day1;

public class Task5 {
    public static void main(String[] args) {
/*
5. Повторить задание 4, но используя цикл for.
*/

        int year = 1980;
        for (int i = year; i <= 2020; i = i + 3) {
            System.out.println("Олимпиада " + i + " года.");
            i++;
        }
    }
}
