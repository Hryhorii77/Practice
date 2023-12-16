package hw_6;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 8;
        int f=num;

        if (num < 0) {
            System.out.println("Error");
        } else {
            for (int i = 0; i < num; i++) {//i=1
                for (int j = 0; j <= num; j++) {//j=0 f=6
                    if (j < f) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                f--;
                System.out.println();
            }
        }
    }
}

//   *
//  **
// ***
//****
