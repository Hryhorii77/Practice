package lesson_1;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num>0) {
            if ( num <= 100) {
                System.out.println("I century");
            } else if (  num <= 200) {
                System.out.println("II century");
            } else  {
                System.out.println("III century");
            }
        }
    }
}
