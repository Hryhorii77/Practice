package lesson_9;

public class B {
    public static void main(String[] args) {
        int a = calculateSum(5, 9);
        System.out.println(a);
        String st="fghjk";
        char b = showElement(st,1);
        System.out.println(b);

    }

    public static int calculateSum(int num1, int num2) {

        return num1+num2;
    }

    //qwert in 4
    public static char showElement(String str, int num) {
        if(str.length()<num){
            System.out.println("ERROR");
            return ' ';
        }
        char str2;
        str2 = str.charAt(num);
        return str2;

    }
}
