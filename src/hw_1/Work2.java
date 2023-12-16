package hw_1;

import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextInt();
        if (c % 3 == 0 && c % 5 == 0) {
            System.out.println(c);
        } else {
            System.out.println("even number");
        }
    }
}
