package lesson_7;

public class B {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        b = b + 2;

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0  || i == b-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

}

//*****
//
//
//
//*****