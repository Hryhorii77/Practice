package hw_15;

public class Animal {

    private String name;
    private int age;
    private String colour;
    private int legs;

    public Animal(String name, int age, String colour, int legs) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){
            this.age=age;
        }

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", legs=" + legs +
                '}';
    }
}
