package lesson_20;

public class SportCar implements Vehicle {

    @Override
    public void satrt() {
        System.out.println("start 2 s");
    }

    @Override
    public void stop() {
        System.out.println("stop 4 s");
    }


    public void drive() {
        System.out.println("drive slow");
    }


    public void turn() {
        System.out.println("turn left");
    }
}
