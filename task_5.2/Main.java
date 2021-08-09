/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*        List<String> list = new ArrayList<>();
        while (true) {
            System.out.print("Введите: ");
            String family = scanner.nextLine();
            if (family.isEmpty()) {
                break;
            }
            list.add(family);
        }
        System.out.println(list);
        // Read the house number
        int houseNumber = scanner.nextInt();

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }*/
//создаём двумерный ArrayList массив для хранения связки Фамилия семьи/Город проживания семьи
        ArrayList<List<String>> list = new ArrayList<List<String>>();
//заполняем новый массив значениями. Ввод будет продолжаться до тех пор, пока не будет введено пустое значение
        System.out.println("Сейчас будем заполнять массив Фамилия семьи/Город проживания семьи");
        String family;
        String city;
        while (true) {//бесконечный цикл
            System.out.print("Введите Фамилию семьи: ");
            family = scanner.nextLine();
            if (family.isEmpty()) {//выходим, если ничего не введено
                break;
            }
            System.out.print("Введите Город проживания семьи: ");
            city = scanner.nextLine();
            list.add(Arrays.asList(family, city));
        }
        System.out.println(list);//выведем коллекцию на экран, чтобы посмотреть, как она заполнилась
//блок кода, где осуществляется поиск Фамилии семьи по Городу проживания.
//При необходимости можно завернуть в бесконечный цикл и делать поиск бесконечно
        System.out.println("Поиск семьи по Городу проживания");
        System.out.print("Введите Город проживания семьи: ");
        city = scanner.nextLine();
        family = "не найдено";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(city)) {
                family = list.get(i).get(0);
                System.out.println("В Городе " + city + " живут: " + family);//Выводим на экран найденный элемент Коллекции
            }
        }
        if (family == "не найдено") System.out.println("В Городе " + city + " ни кто не живёт.");
    }
}
