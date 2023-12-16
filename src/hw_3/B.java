package hw_3;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = a * 2.54;
        if (a <= 0) {
            System.out.println("Error");
        } else {
            System.out.println(b);
        }
    }
}
