package hw_15;

public class Student extends People {

    public int school;

    public Student(String firstName, String secondName, int age, int weight,
                   int height, String hobby, String colourHair, int school) {


        super(firstName, secondName, age, weight, height, hobby, colourHair);
        this.school = school;
    }

}
