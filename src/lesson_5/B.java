package lesson_5;

public class B {
    public static void main(String[] args) {
        int [] arr = {-10,-5,-4};
        int max =Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
