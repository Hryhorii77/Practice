package lesson_13;

import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW",200, "red", 4, 15500,5);
        Car c2 = new Car("Audi", 180, "black", 4, 25500.55,3);
        Car c3 = new Car("Honda", 175, "white", 4, 30000,10);

        Employee e1 = new Employee("Alex", "Diachenko", "19.10.1990", 30000.50);
        Employee e2 = new Employee("Nick", "Melnyk","20.11.1999", 24500.35);
        Employee e3 = new Employee("Max", "Melnychuk","20.11.1989", 23500.35);

        CarsStore  store1 = new CarsStore();

        store1.addCar(c1);
        store1.addCar(c2);
        store1.addCar(c3);



        store1.addEmployee(e1);
        store1.addEmployee(e2);
        store1.addEmployee(e3);


        store1.sellCar(e1, c1);
        store1.sellCar(e1,c1);

        store1.showEmployeerAge(30);



    }
}
