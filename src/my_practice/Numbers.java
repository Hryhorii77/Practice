package my_practice;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int sum = num1 + num2;
        if ((sum > 5) && (num3 % 6 == 0) && (num4 % 3 != 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
