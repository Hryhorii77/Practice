package hw_15.part1;

public class Main {
    public static void main(String[] args) {
        Bathroom b1 = new Bathroom("Fialka", 180, "blue", "red");
        Bathroom b2 = new Bathroom("Romashka", 170, "yellow", "grey");
        Bathroom b3 = new Bathroom("Osyka", 175, "brown", "black");

        Kitchen k1 = new Kitchen("Misty",168,"Purple",12);
        Kitchen k2 = new Kitchen("Nice",169,"White",14);
        Kitchen k3 = new Kitchen("Brooklin",178,"White",16);

        Room [] array = {b1,b2,b3,k1,k2,k3};

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].getHeight() > result)
            result = array[i].getHeight();
        }
        System.out.println(result);
    }
}
