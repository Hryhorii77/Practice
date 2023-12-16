package my_practice;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        if (x < 7) {
            System.out.println("Yes");
        } else if (x > 10) {
            System.out.println("No");
        } else if (x == 9) {
            System.out.println("Error");
        }else {
            System.out.println("All good");
        }
    }
}
