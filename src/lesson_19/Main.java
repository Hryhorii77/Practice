package lesson_19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        People p1 = new People("Alex", 35, 80, 175);
        People p2 = new People("Max", 30, 85, 178);

        Student s1 = new Student("Nick", 33, 77, 167, "Borovyk", "Plotva");
        Student s2 = new Student("Borovyk", 31, 78, 178, "Kolos", "Plast");
        showElderOne(p2, s1);

        People p = new Student("hf",22,44,14,"3tr","ert");
        System.out.println(p);

        List<String> st = new LinkedList<>();

    }

    public static void showElderOne(People p1, People p2) {
        if (p1.age > p2.age) {
            System.out.println(p1);
        } else {
            System.out.println(p2);
        }
    }
}
