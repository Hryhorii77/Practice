package lesson_6;

public class C {
    public static void main(String[] args) {
        int[] array = {5, 4, 6, 7, 8, 9, 22};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sum1 = sum1 + array[i];
            sum2 = sum2 + array[i + array.length / 2 + 1];

        }
        if (sum1 > sum2) {
            System.out.println(sum1 + " is bigger than " + sum2);
        } else {
            System.out.println(sum2 + " is bigger than " + sum1);

        }

    }
}
