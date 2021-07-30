/*
Задание: Запросить у пользователя ввод числа и сохранить это число в переменную a.Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Это нужно, чтобы можно было вводить значения с клавиатуры
        System.out.print("Введите, пожалуйста, целое число: ");
        int a = scanner.nextInt();
        if (a == 10) {
            System.out.println("Верно");
        } else {
            System.out.println("Неверно");
        }
    }
}
