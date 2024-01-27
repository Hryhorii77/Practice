package lesson_23;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Plane p1 = new Plane (1234,240,12,1000,"White");
        Plane p2 = new Plane (1255,140,10,800,"Red");
        Plane p3 = new Plane (1264,180,11,900,"White");
        Plane p4 = new Plane (1277,200,14,1200,"White");

        Map<Integer, Plane> map = new HashMap<>();
        map.put(p1.hex, p1);
        map.put(p1.hex,p2);

        System.out.println(map.get(1255));
    }
}
