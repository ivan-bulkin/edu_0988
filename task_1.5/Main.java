/*
ВНИМАНИЕ! ДЛЯ РЕШЕНИЯ ЗАДАЧИ НЕОБХОДИМО ПРОСМОТРЕТЬ УРОК №4 https://www.youtube.com/watch?v=WmZ6kVTlWtg&list=PLOep0pi-UBExIxCNegkvCrBuDh0TE7Ihq&index=4
Программа запрашивает у пользователя значение в градусах Цельсия. Программа должена переводить температуру и выводить на экран
значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
Пример:
на вход подается значение 41.
Пример вывода:
105.8 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Это нужно, чтобы можно было вводить значения с клавиатуры
        System.out.println("Сейчас мы будем переводить температуру в градусах Цельсия в температуру в градусах Фаренгейта.");
        System.out.print("Введите температуру в градусах Цельсия: ");
        float temp = scanner.nextFloat();
        double tempF = 9.0 / 5.0 * temp + 32.0;
        System.out.println(temp + " гр. по Цельсию это " + tempF + " гр. по Фаренгейту.");
    }
}
