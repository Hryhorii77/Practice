package lesson_21;

public class Seller extends People {
    private int salary;
    public Seller(String firstName, String lastName, int age, int weight, int salary) {
        super(firstName, lastName, age, weight);
        this.salary = salary;
    }


}
