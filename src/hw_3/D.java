package hw_3;

public class D {
    public static void main(String[] args) {
        int arr[]= {1,5,3,4};
        int totalSum = 0;
        int arraySum = 0;
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }
        System.out.println(totalSum);

        for (int i = 1; i <= arr.length + 1; i++) {
            arraySum = arraySum + i;
        }
        System.out.println(arraySum);
       a = arraySum - totalSum;
        System.out.println(a);
    }
}
