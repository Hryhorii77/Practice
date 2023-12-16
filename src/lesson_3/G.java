package lesson_3;

public class G {
    public static void main(String[] args) {
        int[] array5 = {11, 12, 5, 77, 88, 99};
        int a = 5;
        boolean have = false;
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] == a) {
                have = true;
            }
        }
        if (have) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
