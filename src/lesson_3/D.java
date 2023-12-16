package lesson_3;

public class D {
    public static void main(String[] args) {
        int[] array2 = {1, 7, 8, 5, 7, 4, 9, 19};
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < array2.length / 2; i++) {
            sum1 = sum1 + array2[i];

        }

        for (int i = array2.length / 2; i < array2.length; i++) {
            sum2 = sum2 + array2[i];
        }
        if (sum2 > sum1) {
            System.out.println(sum2);
        } else{
            System.out.println(sum1);
        }
    }
}
