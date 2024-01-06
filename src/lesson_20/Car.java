package lesson_20;

public class Car implements Vehicle, Bus{

    @Override
    public void satrt() {
        System.out.println("start 5 s");
    }

    @Override
    public void stop() {
        System.out.println("stop 10 s");
    }


    @Override
    public void drive() {
        System.out.println("fast drive");
    }

    @Override
    public void turn() {
        System.out.println("turn right");
    }
}
