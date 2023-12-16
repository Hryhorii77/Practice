package my_practice;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       if (num >= -10 && num < 10) {
           System.out.println(num + 5);
       } else {
           System.out.println(num - 10);
       }

    }
}
