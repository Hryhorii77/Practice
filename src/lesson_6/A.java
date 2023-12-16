package lesson_6;

public class A {
    public static void main(String[] args) {
        int []arr={4,7,38,30,2};
        int n = arr.length;

            for (int j = 0; j < n/2; j++) {

                int temp = arr[j];
                arr[j]= arr[n-1-j];
                arr[n-1-j] = temp;

        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
