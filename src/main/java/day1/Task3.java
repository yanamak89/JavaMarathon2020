package day1;
/**
Вывести на экран слово “JAVA”, в столбик, чтобы оно повторилось 10 раз, используя цикл на ваше усмотрение (for или while).
Вывод в консоль должен быть таким:
JAVA
JAVA
JAVA
JAVA
JAVA
JAVA
JAVA
JAVA
JAVA

*/
public class Task3 {
    public static void main(String[] args) {

        int value = 0;
        while (value < 10) {
            System.out.println("JAVA");
            value = value + 1;
        }

    }
}
