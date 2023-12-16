package my_practice;

import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if ((num1 > 10) && (num2 > 10) && (num3 > 10) && (num1 % 3 ==0) && (num2 % 3 ==0)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
