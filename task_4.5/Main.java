/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main {
    public static void main(String[] args) {
        //Создаём объект лошади и вызываем метод run();
        Horse mustang = new Horse(true, "И-го-го", (byte) 4, "Рысак", "Пегий");
        mustang.run();
        //Создаём объект пегаса и вызываем метод fly();
        Pegasus ares = new Pegasus(true, "И-го-го", (byte) 4, "Рысак", "Пегий");
        ares.fly();
    }
}

//Создаём абстрактный класс Animal с характеристиками животного.
abstract class Animal {
    boolean vegeterian;//животное есть мясо или нет
    String speak;//что говорит животное
    byte paws;//Сколько лап у животного

    public Animal(boolean veg, String speak, byte paws) {
        this.vegeterian = veg;
        this.speak = speak;
        this.paws = paws;
    }
}

//Создаём класс Horse который наследуется от Animal
class Horse extends Animal {
    String breed;//добавляем к лошади характеристику - порода
    String color;//добавляем к лошади характеристику - цвет

    public Horse(boolean veg, String speak, byte paws, String breed, String color) {
        super(veg, speak, paws);
        this.breed = breed;
        this.color = color;
    }

    //реализуем метод run
    void run() {
        System.out.println("Игого, я поскакал(а)");
    }
}

//Создаём класс Pegasus который наследуется от Horse
class Pegasus extends Horse {
    public Pegasus(boolean veg, String speak, byte paws, String breed, String color) {
        super(veg, speak, paws, breed, color);
    }

    //реализуем метод fly
    void fly() {
        System.out.println("Игого, я полетел(а)");
    }
}
