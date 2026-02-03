package org.example;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {

        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==val)
                continue;
            else {
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k+1;

    }

    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        removeElement(nums, 2);
    }
}
