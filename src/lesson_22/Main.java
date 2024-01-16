package lesson_22;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alex", "Baks", 30);
        Person p2 = new Person("Maks", "Copilot", 35);
        Person p3 = new Person("Nick", "Black", 25);
        Person p4 = new Person("Nick", "Black", 29);

       Map<String,Person> array = new LinkedHashMap<>();
       array.put(p1.getLastName(),p1);
       array.put(p2.getLastName(),p2);
       array.put(p3.getLastName(),p3);
       array.put(p4.getLastName(),p4);
        System.out.println(array);
    }
}
