package lesson_6;

public class B {
    public static void main(String[] args) {
        int[] arr = {7, 9, 6, 15, 20, 33};
        int multiple = 1;
        for (int i = 0; i < arr.length; i++) {
            multiple = multiple * arr[i];
        }
        System.out.println(multiple);
    }
}
