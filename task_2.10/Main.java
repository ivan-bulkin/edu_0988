/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,0,0};
        System.out.println("Сейчас Вам надо будет ввести семь целых чисел.");
        for (int i = 1; i <= 7; i++) {
            Scanner scanner = new Scanner(System.in);//Это нужно, чтобы можно было вводить значения с клавиатуры
            System.out.print("Введите число " + i + ": ");
            nums[i-1] = scanner.nextInt();
        }
        String result = "нет";
        for (int i = 0; i < 5; i++) {
            if (nums[i] == nums[i+1]) {
                result = "да";
                break;
            }
        }
        System.out.println("Проверяем, есть или нет в массиве введённых Вами чисел два одинаковых числа подряд");
        System.out.println(result);
    }
}
