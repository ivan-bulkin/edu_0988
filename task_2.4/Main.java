/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Это нужно, чтобы можно было вводить значения с клавиатуры
//Делаем допущение, что проценты капитилизируются каждый год
        System.out.print("Введите размер Вашего вклада (целое число): ");
        int vklad = scanner.nextInt();
        System.out.print("Введите ежегодный процент на вклад, который начисляет Вам Ваш банк(пример: 4,4): ");
        double protsent = scanner.nextDouble();
        for (int i = 1; i < 6; i++) {
            System.out.println("Год " + i + " Ваш вклад: " + vklad + "\t");
            vklad = (int) (vklad + vklad * protsent / 100);
        }
    }
}
