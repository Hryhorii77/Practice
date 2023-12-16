package lesson_11;

public class Main {
    public static void main(String[] args) {
        Animals a1 = new Animals();
        a1.name = "Bobik";
        a1.age = 5;
        a1.type = "Buldog";

        Animals a2 = new Animals();
        a2.name = "Sharik";
        a2.age = 7;
        a2.type = "Terier";

        Zoo p1 = new Zoo();
        p1.addAnimals(a1);
        p1.addAnimals(a2);

        p1.showAnimals();

        p1.calculateAvarageAge();

        p1.showName("Much");
    }
}
