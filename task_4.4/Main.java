/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class Main {
    public static void main(String[] args) {
        //Создаём объекты для героев мультика Том и Джерри.
        //Создаём объекты типа Mouse
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse jerryMouse2 = new Mouse("Усик", 10, 25);
        //Создаём объекты типа Dog
        Dog dog1 = new Dog("Джек", 25, 8);
        Dog dog2 = new Dog("Шарик", 30, 4);
        //Создаём объекты типа Cat
        Cat cat1 = new Cat("Том", "Разноцветный", "Домашний");
        Cat cat2 = new Cat("Матроскин", "Полосатый", "Уличный");
    }
}

//Создаём класс Dog
class Dog {
    String name;//имя для собаки
    int weight;//вес для собаки
    int age;//возвраст для собаки

    public Dog(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
}

//Создаём класс Cat
class Cat {
    String name;//имя для кота
    String color;//цвет для кота
    String breed;//порода для кота

    public Cat(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
}

//Создаём класс Mouse
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}
