package my_practice;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        if (number1 > number2) {
            System.out.println(number1 + " is bigger");
        } else if (number2 > number1) {
            System.out.println(number2 + " is bigger");
        } else {
            System.out.println("They are equal");
        }
    }
}

