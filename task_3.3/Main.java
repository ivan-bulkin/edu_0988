/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/

public class Main {
    public static void main(String[] args) {
        //Проверяем, как работает функция compare
        System.out.println(compare(5, 6));//получаем на экран false
        System.out.println(compare(6, 6));//получаем на экран true
    }

    //Функция, которая принимает 2 целых числа. Функция возвращает boolean. Если эти числа равны - true, если не равны - false.
    public static boolean compare(int a, int b) {
        if (a == b) return true;
        else return false;
    }
}
