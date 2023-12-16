package hw_14;

import java.nio.channels.ScatteringByteChannel;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String data = "data.txt";
        String c1 = "Insert new data";


        switch (number) {
            case 1:
                System.out.println("Insert text to save in file");
                FileMenu.saveDataToFile(c1);
                break;
            case 2:
                System.out.println("Data from file:\n" + FileMenu.readDataFromFile());
                break;
            case 0:
                System.out.println("The program is finished.");
                System.exit(0);

            default:
                System.out.println("Incorrect number, please enter 1, 2 or 0");

        }
    }
}