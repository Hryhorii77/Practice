package my_practice;

import java.util.Scanner;

public class FourNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        if ((num1 % 2 == 0) || (num2 % 2 == 0) || (num3 % 2 == 0) || (num4 % 2 == 0)) {
            if (num1 > num2 && num1 > num3 && num1 > num4) {
                System.out.println(num1);
            }
            if (num2 > num3 && num2 > num4) {
                System.out.println(num2);

            }
            if (num3 > num4) {
                System.out.println(num3);
            }
            if (num4 > num3) {
                System.out.println(num4);
            }
        } else {
            System.out.println("No sch number was found");
        }
    }
}
