/*
 * Дана коллекция имён.
 * 1) удалить все повторяющиеся имена из коллекции
 * 2) вывести коллекцию на экран
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");
        System.out.println(names);//выводим начальную коллекцию на экран
//Set – это коллекция уникальных элементов, или коллекция, которая не позволяет хранить одинаковые элементы.
//помещаем нашу коллекцию в сет
        Set<String> set = new HashSet<>(names);
        names.clear();//очищаем нашу старую коллекцию
        names.addAll(set);//возвращаем назад уже уникальные значения коллекции
        System.out.println(names);//выводим коллекцию на экран с уже уникальными значениями
    }
}
