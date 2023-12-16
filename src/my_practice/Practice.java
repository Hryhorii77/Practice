package my_practice;

public class Practice {
    public static void main(String[] args) {
       /* int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ") ");
        long myLongValue = 100000L;
        short myMinShortValue = Short.MIN_VALUE;
        myMinIntValue = Integer.MIN_VALUE;
        int myTotalValue = myMinIntValue / 2;
        System.out.println(myTotalValue);
        byte myNewByteValue = 100;
        short myNewShortValue = 12000;
        int myNewIntValue = 10000000;
        long myNewLongValue = 50000L;
        long myTotalVal = myNewLongValue + 10L * (myNewByteValue + myMinShortValue + myNewIntValue);
        System.out.println(myTotalVal);
        float myOtherFloatNumber = (float) 10.25;// 10.25.f
        System.out.println(myOtherFloatNumber);
        double numberOfPounds = 100d;
        double numberOfKilos;
        numberOfKilos = numberOfPounds * 0.45359237;
        System.out.println("Converted Kilograms = " + numberOfKilos);
        char myChar = '\u0044';
        System.out.println(myChar);
        char mySimpleChar = 'L';
        char myUnicodeChar = '\u004C';
        char myDecimalChar = 76;
        System.out.println("My values are " + mySimpleChar + " " + myUnicodeChar + " " + myDecimalChar);
        char myFirstChar = 'Main';
        char mySecondChar = 'B';
        System.out.println(myFirstChar + mySecondChar);
        System.out.println("" + myFirstChar + mySecondChar);*/

        String[] worldParts = {"North", "South", "West", "East"};
        for (int i = 0; i < worldParts.length; i++) {
            System.out.println(worldParts[i]);
        }
        System.out.println(worldParts.length);

       /* int[] myArray = new int[10];
        for (int i = 1; i < 10;  i++) {
            myArray[i] = i * 4;
            System.out.print(" " + myArray[i]);
        }*/
        int[] myArr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int sum = 0;
        for (int i = 0; i < myArr.length; i++) {
            sum = sum + myArr[i];
        }
        System.out.println(sum);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < myArr.length; i++) {
            if (min > myArr[i]) {
                min = myArr[i];
            }
        }
        System.out.println(min);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < myArr.length; i++) {
            if (max < myArr[i]) {
                max = myArr[i];
            }
        }
        System.out.println(max);
    }

}
