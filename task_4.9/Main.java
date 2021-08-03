/*Задача, доработать код с вебинара
Составить генеалогическое древо. У вас должно быть 2 бабушки, 2 дедушки, мама, папа, ребёнок.
Для всех персонажей должен корректно работать метод info()
На экран должно попасть максимум информации.
т.е. для ребенка нужно вывести инфо о родителях, а так же о бабушках и дедушках.
Задачу сдать как task_4.9*/

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Бабушка 1", "Салтыкова", 60, null, null);
        Person p2 = new Person("Бабушка 2", "Макарова", 60, null, null);
        Person p3 = new Person("Дедушка 1", "Салтыков", 60, null, null);
        Person p4 = new Person("Дедушка 2", "Макаров", 60, null, null);
        Person p5 = new Person("Мама", "Макарова", 40, p1, p3);
        Person p6 = new Person("Папа", "Макаров", 40, p2, p4);
        Person p7 = new Person("Ребёнок", "Макаров", 20, p5, p6);
        p7.info();//Выводим информацию о ребёнке
        System.out.println();
        //выводим информацию о других членах семьи, чтобы проверить не будет-ли каких-либо исключений
        p6.info();
        p5.info();
        p4.info();
        p3.info();
        p2.info();
        p1.info();
    }
}

class Person {//описание того, как должен выглядеть человек
    String name;
    String lastname;
    int age;
    Person mother;
    Person father;

    Person(String name, String lastname, int age, Person mother, Person father) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    void sayHi(String name) {
        System.out.println("Привет, " + name);
    }

    void info() {
        String info = "Привет, меня зовут " + this.name + " " + this.lastname + "\n" +
                "Мне " + this.age + " лет \n";
        if (this.mother != null) {//проверка существования матери
            info += "Мою маму зовут " + this.mother.name + "\n";
            if (this.mother.mother != null) {
                info += "Бабушку по маминой линии зовут " + this.mother.mother.name + "\n";
            } else info += "у меня бабушки по маминой линии нет :-(" + "\n";
            if (this.mother.father != null) {
                info += "Дедушку по маминой линии зовут " + this.mother.father.name + "\n";
            } else info += "у меня дедушки по маминой линии нет :-(" + "\n";
        } else info += "у меня мамы нет :-(" + "\n";

        if (this.father != null) {
            info += "Моего папу зовут " + this.father.name + "\n";
            if (this.father.mother != null) {
                info += "Бабушку по папиной линии зовут " + this.father.mother.name + "\n";
            } else info += "у меня бабушки по папиной линии нет :-(" + "\n";
            if (this.father.father != null) {
                info += "Дедушку по папиной линии зовут " + this.father.father.name + "\n";
            } else info += "у меня дедушки по папиной линии нет :-(" + "\n";
        } else info += "у меня папы нет :-(" + "\n";
        System.out.println(info);
    }
}
