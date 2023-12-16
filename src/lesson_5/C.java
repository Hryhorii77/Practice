package lesson_5;

public class C {
    public static void main(String[] args) {
        int [] array = {21,3,8,9,35,16,19};


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];//tmp=3
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
