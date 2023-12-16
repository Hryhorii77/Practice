package hw_4;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 0) {
            System.out.println("It's not possible");
        } else {
            double millimeter = a * 1000;
            double centimeter = a * 100;
            double decimeter = a * 10;
            double kilometer = a * 0.001;
            System.out.println(millimeter);
            System.out.println(centimeter);
            System.out.println(decimeter);
            System.out.println(a);
            System.out.println(kilometer);
        }

    }
}
