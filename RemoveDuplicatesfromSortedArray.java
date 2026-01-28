package org.example;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;


        int k= 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[k]) {
                k++;
                nums[k] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        return k + 1;
    }

    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
