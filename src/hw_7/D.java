package hw_7;

public class D {
    public static void main(String[] args) {

        int a = 6;

        for (int i = 1; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 1 || i == a - 1 || j == 0 || i == a / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


