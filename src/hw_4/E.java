package hw_4;

public class E {
    public static void main(String[] args) {
        int[] myArr = {10, 22, 9, 33, 21, 50, 41, 60, 80};

        int currentLength = 1;
        for (int i = 1; i < myArr.length; i++) {
            if (myArr[i] < myArr[i - 1]) {
                currentLength = i;
                break;
            }
        }
        System.out.println(currentLength);
    }
}
