package lesson_4;

public class A {
    public static void main(String[] args) {
        int i=113;

        /*if(i==20){
            System.out.println("j");
        }else if(i==40){
            System.out.println("f");
        }else{
            System.out.println("k");
        }*/

        switch (i){
            case 10:{
                System.out.println("j");
                break;
            }
            case 11:{
                System.out.println("h");
                break;
            }
            default:{
                System.out.println("n");
            }

        }


    }
}
