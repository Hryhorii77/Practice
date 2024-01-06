package lesson_20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new SportCar();

        v1.satrt();
        v2.satrt();

        List<String>  st1= new ArrayList<>();
        List<String>  st2 = new LinkedList<>();

        st1.add("qwer");
        st2.add("ghjk");

    }
}
