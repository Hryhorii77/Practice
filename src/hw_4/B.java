package hw_4;

public class B {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(i);
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println();
        }

    }
}
