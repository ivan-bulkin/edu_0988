/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Это нужно, чтобы можно было вводить значения с клавиатуры
        System.out.println("Сейчас мы будем вводить число и затем прибавим к этому числу 15%.");
        System.out.print("Введите целое число: ");
        int a = scanner.nextInt();
        double b = a * 1.15;
        System.out.println("Ваше  число " + a + " 15% = " + b);
    }
}
