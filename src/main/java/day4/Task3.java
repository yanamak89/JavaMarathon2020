package day4;

import java.util.Random;

/**
 * 3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
 * Размер матрицы задать m=12, n=8 (m - размерность по строкам,
 * n - размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна.
 * Если таких строк несколько, вывести индекс последней из них.
 * Пример сгенерированной матрицы (для простоты m=3, n=5):
 * <p>
 * 3 2 1 5 7 	// сумма - 18
 * 1 2 5 6 2 	// сумма - 16
 * 3 4 9 6 4	// сумма - 26
 * <p>
 * Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
 */
public class Task3 {
    public static void main(String[] args) {
        int[][] martix = new int[12][8];

        Random random = new Random();
        for (int i = 0; i < martix.length; i++) {
            for (int j = 0; j < martix[i].length; j++) {
                martix[i][j] = random.nextInt(50);
            }
        }

        int maxSum = 0;
        int maxSumInd = 0;
        for (int i = 0; i < martix.length; i++) {
            int sum = 0;
            for (int j = 0; j < martix[i].length; j++) {
                sum += martix[i][j];
            }

            if (sum >= maxSum) {
                maxSum = sum;
                maxSumInd = i;
            }
        }
        System.out.println(maxSumInd);
    }
}

