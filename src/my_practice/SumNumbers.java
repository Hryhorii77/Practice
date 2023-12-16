package my_practice;


import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum1 = num1 + num2;
        int sum2 = num2 + num3;
        if (sum1 == num3 || sum2 == num1) {
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
}
}