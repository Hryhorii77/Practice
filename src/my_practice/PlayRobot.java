package my_practice;

import java.util.Scanner;

public class PlayRobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int direction = sc.nextInt();
        int command = sc.nextInt();
        if (direction == 11) {
            if (command == 1) {
                System.out.println("North");
            } else if (command == 0) {
                System.out.println("West");
            } else if (command == -1) {
                System.out.println("East");
            } else {
                System.out.println("Command is wrong");
            }
        }
        if (direction == 12) {
            if (command == 1) {
                System.out.println("South");
            } else if (command == 0) {
                System.out.println("West");
            } else if (command == -1) {
                System.out.println("North");
            } else {
                System.out.println("Command is wrong");
            }
        }
        if (direction == 13) {
            if (command == 1) {
                System.out.println("East");
            } else if (command == 0) {
                System.out.println("South");
            } else if (command == -1) {
                System.out.println("West");
            } else {
                System.out.println("Command is wrong");
            }
        }
        if (direction == 14) {
            if (command == 1) {
                System.out.println("North");
            } else if (command == 0) {
                System.out.println("East");
            } else if (command == -1) {
                System.out.println("South");
            } else {
                System.out.println("Command is wrong");
            }
        }
        else{
            System.out.println("No such direction");
        }
    }
}
