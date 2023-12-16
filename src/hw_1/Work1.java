package hw_1;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextInt();
        if (b % 3 == 0 && b !=0) {
            System.out.println(b);
        }
        else {
            System.out.println("even number");
        }
    }
}
