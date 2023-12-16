package lesson_13;

public class Car {
    public String model;
    public int speed;
    public String colour;
    public int wheels;

    public double price;

    public int countCar;

    public Car(String model, int speed, String colour, int wheels) {
        this.model = model;
        this.speed = speed;
        this.colour = colour;
        this.wheels = wheels;
    }

    public Car(String model, int speed, String colour, int wheels, double price, int countCar) {
        this.model = model;
        this.speed = speed;
        this.colour = colour;
        this.wheels = wheels;
        this.countCar = countCar;
        this.price = price;
    }

    public void about (){
        System.out.println(this.model + " " + this.speed + " " + this.colour + " " + this.wheels + " " + this.price+" "+this.countCar);
    }
}
