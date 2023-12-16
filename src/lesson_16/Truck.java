package lesson_16;

public class Truck extends Car {
    public Truck(String colour, int price, String model, int wheel) {
        super(colour, price, model, wheel);
    }

    @Override
    public void drive() {

        System.out.println("broke");
    }

}
