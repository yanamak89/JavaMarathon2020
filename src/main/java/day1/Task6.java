package day1;

public class Task6 {
    public static void main(String[] args) {

/*
6. Объявите переменную типа int, имя переменной - k. Присвойте этой переменной какую-нибудь цифру от 1 до 9. Используя цикл на ваше усмотрение (for или while),
выведите в консоль таблицу умножения для этой цифры в следующем формате:
1 x k = …
2 x k = …
3 x k = …
……
9 x k = …

Тест к этой задаче отсутствует, проверяйте себя по информации в консоле.

Пример:
k = 3

Вывод в консоль:
1 x 3 = 3
2 x 3 = 6
3 x 3 = 9
……
9 x 3 = 27

*/

        int k = 3;
        for(int i = 1; i <= 9; i=i+1){
            int j = i * k;
            System.out.println(i + " x " + k + " = " + j);
        }
    }

}
