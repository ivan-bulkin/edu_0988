/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 0, 0, 0};
        System.out.println("Сейчас Вам надо будет ввести семь целых чисел.");
        for (int i = 1; i <= 7; i++) {
            Scanner scanner = new Scanner(System.in);//Это нужно, чтобы можно было вводить значения с клавиатуры
            System.out.print("Введите число " + i + ": ");
            nums[i - 1] = scanner.nextInt();
        }
        int sum = 0;
        int result = 0;
        boolean bol = false;
        for (int i = 0; i < 6; i++) {
            sum = sum + nums[i];
            if (sum > 10) {
                result++;
                bol = true;
                break;
            }
            result++;
        }
        System.out.println("Узнаём, сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти");
        if (bol == false) {
            System.out.println("К сожалению, сколько ни складывай элементы из массива чисел, которые Вы ввели, их сумма не будет более 10-ти");
        } else {
            System.out.println(result + " - столько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти");
        }
    }
}
