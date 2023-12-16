package lesson_3;

public class E {
    public static void main(String[] args) {
        int[] array3 = {7, 7, 5, 4, 3, 6, 7, 8};
        int sum = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == 7) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

