package lesson_7;

public class A {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= b; j++) {
                if (j == 0 || j == b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}

//*   *
//*   *
//*   *
//*   *
//*   *
