package org.example;

import java.util.Arrays;

public class NumArray {
    private int[] prefixSum;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n];
        if (n > 0) {
            prefixSum[0] = nums[0];
            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + nums[i];
            }
        }
        System.out.println(Arrays.toString(prefixSum));
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefixSum[right];
        }
        return prefixSum[right] - prefixSum[left - 1];
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }
}
