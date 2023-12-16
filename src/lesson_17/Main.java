package lesson_17;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<People> ints = new ArrayList<>();

        People p1 = new People("Greg", "Levchenko", 30);
        People p2 = new People("Serhii", "Diachenko", 35);
        People p3 = new People("Alex", "Lytosh", 33);
        People p4 = new People("Greg", "Levchenko", 30);
        People p5 = new People("Maks", "Sobol", 31);
        People.sayHello();

        int a= Math.abs(-9);
        System.out.println(a);


        ints.add(p1);
        ints.add(p2);
        ints.add(p3);
        ints.add(p4);
        ints.add(p5);


    }

    private int searchName(String str, ArrayList<People> ints) {
        int count = 0;
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i).getName().equals(str)){
                count++;
            }
        }
        return count;
    }

}
