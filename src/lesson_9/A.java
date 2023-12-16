package lesson_9;

public class A {
    public static void main(String[] args) {
        int []arr1={3,6,93,2};
        int []arr2={3,8,04,7};

        int arr5[] = createNewArray(arr1,arr2);
        int arr6 [] = multipleEachElement(arr5);
        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i]+" ");
        }


    }
    public static int[] createNewArray(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        return array3;
    }
    public static int [] multipleEachElement ( int [] arr5) {
       int [] arr6 = new int [arr5.length];
        for (int i = 0; i < arr5.length; i++) {
            arr6[i] = arr5[i] *2;
        }
        return arr6;
    }
}
