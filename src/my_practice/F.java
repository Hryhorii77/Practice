package my_practice;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        if (number1 > number2) {
            System.out.println("Yes");
        } else {
            double temp = number1;
            number1 = number2;
            number2 = temp;
            System.out.println(number1);
            System.out.println(number2);
        }
    }
}
