package my_practice;

import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if ((num1 < 5) && (num2 < 5) && (num3 > 5) || (num1 < 5) && (num2 > 5) && (num3 < 5) || (num1 > 5) && (num2 < 5) && (num3 < 5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
