package lesson_3;

public class C {
    public static void main(String[] args) {
        int[] array1 = {7, 8, 5, 4, 3, 9, 12};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                System.out.println(array1[i]);
            }
        }
    }
}
