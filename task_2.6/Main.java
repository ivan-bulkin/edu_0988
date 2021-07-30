/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Это нужно, чтобы можно было вводить значения с клавиатуры
        System.out.print("Введите, пожалуйста, целое число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите, пожалуйста, целое число b: ");
        int b = scanner.nextInt();
        System.out.println("Сейчас мы будем делить a на b и узнаем, будет или нет остаток от деления.");
        if (a % b == 0) {
            System.out.println("a на b делится без остатка. " + a + "/" + b + "=" + a / b);
        } else {
            System.out.println("a на b делится с остатком. " + a + "/" + b + ", остаток от деления: " + a % b);
        }
    }
}
