package hw_1;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        if (a % 2==0 && a != 0) {
            System.out.println("Fizz");
        } else if (a % 3 == 0 && a != 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Some error");
        }
    }
}
