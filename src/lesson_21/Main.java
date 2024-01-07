package lesson_21;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        People p1 = new People("Alex", "Prudkyi", 33, 85);
        People p2 = new People("Mark", "Mask", 30, 80);
        People p3 = new People("Hosha", "", 34, 90);

        Seller s = new Seller("Nick", "Nike", 28, 90, 3200);
        Seller s2 = new Seller("Maks", "Dyor", 25, 88, 5200);
        Seller s3 = new Seller("Luton", "bayer", 23, 70, 6200);

        Store  soccer = new Store();
        soccer.addSeller(s);
        soccer.addSeller(s2);
        soccer.addSeller(s3);
    }

    private static void findPeople(List<People> arr){
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getLastName().equals("")) {
                System.out.println(arr.get(i));
            }
            }
        }
        private static void findAverageAge(List<People> arr){
            int averageAge =0;
        for (int i = 0; i < arr.size(); i++) {
                averageAge = arr.get(i).getAge() + averageAge;
            }
        int age = averageAge / arr.size();
            System.out.println(age);
        }
    }

