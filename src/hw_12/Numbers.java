package hw_12;

public class Numbers {
    public static void main(String[] args) {
        int n = 17;
        boolean ugly =isUglyNumber(n);
        System.out.println(ugly);
    }

    public  static boolean isUglyNumber(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }
}
