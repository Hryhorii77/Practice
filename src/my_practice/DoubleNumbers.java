package my_practice;
import java.util.Scanner;
public class DoubleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if ( num1 > 30 || num2 > 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
