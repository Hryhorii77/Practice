package lesson_5;

public class A {
    public static void main(String[] args) {
        int [] arr = {-9,5,4,7,19,8,9,6,15};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
