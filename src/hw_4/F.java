package hw_4;

public class F {
    public static void main(String[] args) {
        int [] arr = {10, 22, 9, 33, 21, 500, 41, 60, 80, 150};
        int max = 0;
        int a = 0;
        while (a < arr.length){
            if (arr[a]>max){
                max=arr[a];
            }
            a++;
        }
        System.out.println(max);
    }
}
