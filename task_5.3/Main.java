/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();//создаём коллекцию с целыми числами
//заполняем коллекцию целыми числами
        numbers.add(0);
        numbers.add(-1);
        numbers.add(10);
        numbers.add(11);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(8);
        System.out.println(numbers);//выводим коллекцию на экран
        ArrayList<Integer> numbersNew = new ArrayList<>();//создаём новую коллекцию с целыми числами
        for (int i = 0; i < numbers.size(); i++) {//цикл, который будет идти по всем элементам первой коллекции
            if (numbers.get(i) > 0 && numbers.get(i) < 10) {//заносим в новую коллекцию только те элементы из первой коллекции, которые больше нуля и меньше десяти
                numbersNew.add(numbers.get(i));
            }
        }
        System.out.println(numbersNew);//выводим новую коллекцию на экран
    }
}
