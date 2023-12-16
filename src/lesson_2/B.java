package lesson_2;

public class B {
    public static void main(String[] args) {
        int a = 150;
        int b = 140;
        int c = 300;
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
