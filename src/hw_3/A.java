package hw_3;

public class A {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8};

        int a=1;
        for (int i = 0; i < array.length; i++) {
            if (a != array[i]){
                System.out.println(a);
                break;
            }
            a++;
        }
    }
}
