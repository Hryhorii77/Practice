package my_practice;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if ((num < -100) || (num > 100)) {
            System.out.println(0);
        } else {
            System.out.println(num + 1);
        }
    }
}
