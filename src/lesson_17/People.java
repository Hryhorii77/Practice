package lesson_17;

import java.util.ArrayList;

public class People {
    private static int nexId = 0;


    private int id;
    private String name;
    private String lastName;
    public int age;

    public static void sayHello() {
        System.out.println("qwer");
    }

    public People(String name, String lastName, int age) {
        this.id = nexId;
        nexId++;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
