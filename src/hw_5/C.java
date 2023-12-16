package hw_5;

public class C {
    public static void main(String[] args) {
        String[] array = {"September", "Aughust", "November", "July", "October"};
        int n = array.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - 1; j++) {
                if(array[j].charAt(0) > array[j+1].charAt(0)) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println( array[i]);
        }

    }
}
