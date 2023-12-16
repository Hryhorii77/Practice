package my_practice;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int count = 0;
        if (num1 > 0) {
            count++;
        }

        if (num2> 0) {
            count++;
        }

        if (num3 > 0 ) {
            count++;
        }
        System.out.println(count);
    }
}
