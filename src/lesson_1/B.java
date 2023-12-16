package lesson_1;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Grownup");
        }
        else {
            System.out.println("Child");
        }
    }
}
