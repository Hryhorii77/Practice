package hw_3;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n >=0)
        for (int i = 0; i <= n; i++) {
            sum = sum +i;
        } else if (n < 0) {
            for (int i = 0; i >= n ; i--) {
                sum = sum +i;
            }
        }
        System.out.println(sum);
    }
}
