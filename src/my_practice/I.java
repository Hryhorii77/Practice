package my_practice;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if ((num1 != 10) && (num2 != 10) && (num1 % 2 == 0)) {
            System.out.println(num1 + num2);
        } else {
            System.out.println(num1 * num2);
        }
    }
}
