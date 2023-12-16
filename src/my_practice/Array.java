package my_practice;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 500;
        nums[1] = 600;
        nums[2] = 400;

        byte[] nums2 = {6, 5, 7, 3, 7, 8};

        System.out.print("Enter num: ");
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        short[] nums3 = new short[userNum];
        for (int i = 0; i < userNum; i++) {
            System.out.println("Enter element " + i + ": ");
            nums3[i] = sc.nextShort();
        }
        short maxNum = nums3[0];
        for (int i = 0; i < userNum; i++) {
            if (nums3[i] > maxNum) {
                maxNum = nums3[i];
            }
        }

        for (int i = 0; i < userNum; i++) {
            System.out.println(nums3[i]);
        }
        System.out.println("Max element: " + maxNum);
    }
}
