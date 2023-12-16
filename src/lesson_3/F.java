package lesson_3;

import org.w3c.dom.ls.LSOutput;

public class F {
    public static void main(String[] args) {
        int []  array4 = {1,6,7,8,9,11,22};//5-10
        int sum1 = 0;

        for (int i = 0; i < array4.length; i++) {
            if (array4[i]>=5 && array4[i]<=10) {
                sum1++;
            }
        }
        System.out.println(sum1);
    }

}
