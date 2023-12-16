package my_practice;

import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = 0;
        boolean flag = false;
        if (num1 % 5 == 0) {
            sum = sum + num1;
            flag = true;
        } if (num2 % 5 == 0) {
            sum = sum + num2;
            flag = true;
        }  if (num3 % 5 == 0) {
            sum = sum + num3;
            flag = true;
        } if (flag) {
            System.out.println(sum);
        } else {
            System.out.println("Error");
        }
    }
}
