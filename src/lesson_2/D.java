package lesson_2;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        /*int sum=0;
        for (int i = 1; i < 10; i++) {//sum=10
            sum=sum+i;
        }
        System.out.println(sum);*/
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        if (a > b) {
            System.out.println("Error");

        } else {

            for (int i = a; i <= b; i++) {
                sum = sum + i;
            }

            System.out.println(sum);

        }
    }
}
