package lesson_13;

import java.util.Date;

public class Employee {
    public String firstName;
    public String lastName;

    public String dateOfBirth;

    public double salary;

    public Car [] arrayCars  = new Car [100];

    public int countEmployeeCars = 0;

    public Employee(String firstname, String lastName, String dateOfBirth, double salary) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public void about() {
        System.out.println("First name" + ":" + " " + this.firstName + "," + " " + "Last name" + ":" + " " + this.lastName + "," + " " + "Date of Birth" + ":" + " " + this.dateOfBirth + "," + " " + "Salary" + ":" + " " + this.salary);
    }

    public void addEmployeeCar (Car car) {
        arrayCars[countEmployeeCars] = car;
        countEmployeeCars++;
    }
}
