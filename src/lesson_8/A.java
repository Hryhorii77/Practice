package lesson_8;

public class A {
    public static void main(String[] args) {
        int b=9;

       calculateFacktorial(5);
       calculateFacktorial(b);
       calculateFacktorial(3);
    }

    public  static void calculateFacktorial(int a){
        int multiple=1;
        for (int i = 1; i <=a ; i++) {
            multiple = multiple * i;
        }
        System.out.println(multiple);

    }
}
