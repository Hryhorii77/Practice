package lesson_18;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Masik", 7, "brown", 50);
        Animal a2 = new Animal("Marsik", 5, "white", 40);
        Animal a3 = new Animal("Barsik", 5, "red", 30);
        Animal a4 = new Animal("Marsik", 5, "white", 20);

        Zoo z1 = new Zoo();
        z1.addAnimals(a1);
        z1.addAnimals(a2);
        z1.addAnimals(a3);
        z1.addAnimals(a4);
        System.out.println(z1.getArray1());

        String name = "Vlad";
        z1.showResult(name);
        System.out.println(z1.showResult(name));

        z1.deleteName("Masik");
        System.out.println(z1.getArray1());

        z1.edit("Barsik", "wert");
        System.out.println(z1.getArray1());
    }
}
