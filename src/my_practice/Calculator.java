package my_practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter number 2: ");
        double b = sc.nextDouble();
        System.out.print("Enter math sym: ");
        sc.nextLine();
        char math = sc.nextLine().charAt(0);
       // math = sc.nextLine().charAt(0);
        double res = 0;
        switch (math) {
            case '+':
                res = a + b;
                System.out.println("Res: " + res);
                break;
            case '-':
                res = a - b;
                System.out.println("Res: " + res);
                break;
            case '*':
                res = a * b;
                System.out.println("Res: " + res);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error, as it is not possible to devide by 0");
                } else {
                    res = a / b;
                    System.out.println("Res: " + res);
                }
                break;
            default:
                System.out.println("Error occured");
        }
    }
}
