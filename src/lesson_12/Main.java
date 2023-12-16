package lesson_12;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Audi");


        System.out.println(c2.model + " " + c2.wheels);

        Bathroom b1 = new Bathroom("Winter", 10, 15);

        b1.about();
    }
}
