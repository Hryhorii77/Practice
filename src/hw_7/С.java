package hw_7;

public class С {
    public static void main(String[] args) {
        int a = 6;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= 2 * a; j++) {
                if (j == i || j == 2 * a - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 2 * a; j++) {
              if (j == a) {
                  System.out.print("*");
              } else {
                  System.out.print(" ");
              }
            }
            System.out.println();
        }
    }


}
