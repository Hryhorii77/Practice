package lesson_19;

public class Student extends People {
    String lastName;
    String schoolName;

    public Student(String name, int age, int weight, int height, String lastName, String schoolName) {
        super(name, age, weight, height);
        this.lastName = lastName;
        this.schoolName = schoolName;
    }


}
