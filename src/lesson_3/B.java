package lesson_3;

public class B {
    public static void main(String[] args) {
        int [] array = {3,5,6,7,8,9,11};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
             sum = sum + array[i];
        }

        System.out.println(sum);

    }
}
