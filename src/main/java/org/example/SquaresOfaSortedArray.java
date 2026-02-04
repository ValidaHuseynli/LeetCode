package org.example;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int leftSide = nums[left] * nums[left];
            int rightSide = nums[right] * nums[right];
            if (leftSide > rightSide) {
                arr[index] = leftSide;
                left++;
            } else {
                arr[index] = rightSide;
                right--;
            }
            index--;
        }
        return arr;
    }
}
