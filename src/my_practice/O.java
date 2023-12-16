package my_practice;

import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1 + num2;
        if (num1 + num3 > sum) {
            sum = num1 + num3;
        } if (num2 + num3 > sum ) {
            sum = num2 + num3;
        }
        System.out.println(sum);
    }
    }
