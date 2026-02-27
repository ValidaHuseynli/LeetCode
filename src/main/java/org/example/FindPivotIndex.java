package org.example;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {

        int totalSum=0;
        for (int num : nums) {
            totalSum=totalSum+num;
        }
        int leftsum=0;
        for (int i=0; i<nums.length; i++) {
            int rightSum=totalSum-leftsum-nums[i];
            if(rightSum==leftsum)
                return i;
            else leftsum+=nums[i];
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println(pivotIndex( nums));
    }
}
