package lesson_4;

public class E {
    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 7, 2, 8};
        int sum = 0;
        int a = 0;
        while (a < arr.length) {
            sum = sum + arr[a];
            a++;
        }
        System.out.println(sum);
    }
}
