/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу(Пример: C:\\DOC\\numbers.txt): ");
        String path = scanner.nextLine();
        int[] array = null;//создаём пустой массив с числами
        try {
            BufferedReader in = new BufferedReader(new FileReader(path));
            array = in.lines().mapToInt(Integer::parseInt).toArray();//заполняем массив числами из файла
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);//Выводим массив на экран
        }
        System.out.println();
        Arrays.sort(array);//сортируем массив
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) System.out.println(array[i]);//Выводим только четные, отсортированные по возрастанию
        }
    }
}
