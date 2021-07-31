/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("Сейчас Вам надо будет ввести десять целых чисел.");
        Scanner scanner = new Scanner(System.in);//Это нужно, чтобы можно было вводить значения с клавиатуры
        for (int i = 1; i <= 10; i++) {            
            System.out.print("Введите число " + i + ": ");
            nums[i - 1] = scanner.nextInt();
        }
        int result = 1;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            result = 1;
            for (int j = i + 1; j < 10; j++) {
                if (nums[i] == nums[j]) {
                    result++;
                } else {
                    if (result > max) {
                        max = result;
                    }
                    break;
                }
            }
        }
        System.out.println("Длина самой длинной последовательности повторяющихся чисел в списке:");
        System.out.println(max);
    }
}
