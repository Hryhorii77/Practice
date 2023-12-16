package hw_9;

public class A {
    public static void main(String[] args) {
        String str = "Something went cool and cool and cool";
        int length = calculateLength(str);
        System.out.println(length);
        char unique = 'o';
        int numberOfLetters = calculateNumberOfCharacters(str, unique);
        System.out.println(numberOfLetters);
        int[] arr1 = {-1, -5, 7, 8, 9, 11, 25, 33};
        int sum = calculateSum(arr1);
        System.out.println(sum);
        String str2 = showReverse(str);
        System.out.println(str2);
        int[] arr2 = {-1, -5, 7, 7, 7, 8, 9, 11, 25, 33};
        int [] arr4 = findUniqueElements(arr2);
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
    }

    public static int calculateLength(String str) {
        return str.length();
    }

    public static int calculateNumberOfCharacters(String str, char unique) {
        String str2 = str.toLowerCase();
        int result = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == unique) {
                result++;
            }
        }
        return result;
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

    public static String showReverse(String str) {
        String str2 = "";
        for (int i = str.length() -1; i >= 0; i--) {
            str2 = str2 +  str.charAt(i);
        }
        return str2;
    }
    public static int [] findUniqueElements(int [] array) {// array={1,2,1,3,4,1,2}
        int [] newArr = new int [array.length];//{1,2}
        int count = 0;//2

        for (int i = 0; i <array.length ; i++) {//i=1
            count = mapMyArr(array[i], newArr, count);
        }
        return newArr;
    }

    public static int mapMyArr(int element, int[] arr, int h){
        for (int i = 0; i < h; i++) {
            if(element==arr[i]){
                return h;
            }
        }
        arr[h]=element;
        h++;
        return h;
    }
}