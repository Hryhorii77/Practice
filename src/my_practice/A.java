import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 3) {
            System.out.println(a + 10);
        } else {
            System.out.println(a - 10);
        }
    }
}
