package lesson_2;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
       /* int a=11;

        if(a%2==0){
            System.out.println("par");
        }else{
            System.out.println("ne par");
        }*/
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if (a%3==0){
            System.out.println("кратне");

        } else {
            System.out.println("не кратне");
        }
    }
}

