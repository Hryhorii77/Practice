package hw_7;

public class B {
    public static void main(String[] args) {
        int a = 5;
        int b=a;
        for (int i = 0; i <a ; i++) {// i=2
            for (int j = 0; j < a-i; j++) {// a-i =1
                System.out.print(" ");

            }
            for (int j = 0; j < 2*i+1; j++) {//2*i+1=5
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a-2; i >= 0; i--) {//3
            for (int j = 0; j < a-i; j++) {//a-i=2
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i+1; j++) {//7
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//  *
// ***
//*****

//  ***
//   *
