package day4;

import java.util.Random;

/**
 * 4. Создать новый массив размера 100 и заполнить его случайными числами
 * из диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов. Для найденной
 * тройки с максимальной суммой выведите значение суммы и индекс первого
 * элемента тройки.
 * <p>
 * Пример:
 * *Для простоты пример показан на массиве размера 10
 * <p>
 * [1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254]
 * <p>
 * Тройка с максимальной суммой: [5789, 4, 8742]
 * <p>
 * Вывод в консоль:
 * 14535
 * 5
 * <p>
 * *Пояснение. Первое число - сумма тройки [5789, 4, 8742].
 * Второе число - индекс первого элемента тройки, то есть индекс числа 5789.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        int maxSum = 0;
        int maxSumInd = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumInd = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumInd);
    }
}
