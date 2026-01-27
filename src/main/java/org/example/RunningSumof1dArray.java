package org.example;

public class RunningSumof1dArray {
    public int[] runningSum(int[] nums) {

        int[] arr = new int[nums.length];
        int leftSum = nums[0];
        arr[0] = leftSum;
        for (int i = 1; i < arr.length; i++) {
            leftSum = leftSum + nums[i];
            arr[i] = leftSum;
        }
        return arr;

    }
}
