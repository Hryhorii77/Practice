package lesson_4;

public class F {
    public static void main(String[] args) {
        int array [] = {2,5,7,6,7,7,8,9};
        int a = 0;
        int sum = 0;
        while (a < array.length){
            if (array[a] == 7) {
               sum ++;
            }
            a++;
        }
        System.out.println(sum);
    }
}
