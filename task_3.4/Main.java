/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/


public class Main {
    public static void main(String[] args) {
        //Проверяем, как работает функция compare
        System.out.println(compare(1, 11));//получаем на экран true
        System.out.println(compare(-100, 6));//получаем на экран false
        System.out.println(compare(5, 5));//получаем на экран false, т.к. не больше 10-ти
    }

    //Функция, которая принимает 2 целых числа. Функция возвращает boolean. Если сумма принимаемых чисел больше 10 функция возвращает - true, в противном случае получаем - false.
    public static boolean compare(int a, int b) {
        if (a + b > 10) return true;
        else return false;
    }
}
