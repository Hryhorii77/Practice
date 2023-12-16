package lesson_8;

public class B {
    public static void main(String[] args) {
        int[] array = {7, 6, 7, 8, 9, 5};
        int qwe = 7;
        int num = 9;
        calculateQuantityOfNumbers(array, qwe);
        calculateQuantityOfNumbers(array, num);
        calculateMaxNumber(array);
        calculateAverageNum(array);

    }

    public static void calculateQuantityOfNumbers(int[] array, int num) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static void calculateMaxNumber(int[] array) {
        int num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > num) {
                num = array[i];
            }
        }
        System.out.println(num);
    }
    public static void calculateAverageNum(int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum/array.length);
    }
}
