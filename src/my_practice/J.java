package my_practice;

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        if (number >= 2 && number <= 5) {
            System.out.println(number + 10);
        } else if (number >= 7 && number <= 40) {
            System.out.println(number - 100);
        } else if (number <= 0 || number >= 3000) {
            System.out.println(number * 3);
        } else {
            number = 0;
            System.out.println(number);
        }

    }
}
