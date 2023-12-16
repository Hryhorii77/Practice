package my_practice;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        if (number1 - number2 == 100 || number2 - number1 ==100) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
