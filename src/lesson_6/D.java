package lesson_6;

public class D {
    public static void main(String[] args) {
        int [] myArr = {6,8,9,-11,12,17,-18};
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > 10 || myArr[i] < -10) {
                myArr[i] =0;
            }
        }
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }

    }
}
