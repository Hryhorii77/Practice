package lesson_2;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double factorial = 1;
        if (a <= 0) {
            System.out.println("Error");

        } else {
            for (int i = 1; i < a; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
        }
    }
}
