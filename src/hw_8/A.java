package hw_8;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String str = "Something went wrong";
        calculateSum(num1, num2);
        calculateStringLength(str);
        showStringReverse(str);
        isNumberNatural(num1);
        int[] array1 = new int[8];
        int[] array2 = new int[10];
        createNewArray(array1, array2);

    }

    public static void calculateSum(int num1, int num2) {

        int sum = num1 + num2;
        System.out.println(sum);
    }

    public static void calculateStringLength(String str) {
        int result = str.length();
        System.out.println(result);
    }

    public static void showStringReverse(String str) {
       /* String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;//result =wq
        }
        System.out.println(result);*/
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
    }

    public static void isNumberNatural(int num1) {//8
        for (int i = 2; i < num1; i++) {
            if( num1 % i ==0 ){
                System.out.println("ne proste");
            }
        }
    }

    public static void createNewArray(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
