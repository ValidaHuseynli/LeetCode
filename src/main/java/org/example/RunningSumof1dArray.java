package org.example;

import java.util.Arrays;

public class RunningSumof1dArray {
    public static int[] moveZeroes(int[] nums) {
        /*int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
        return nums;*/

        int j=0;
        for (int i=0; i< nums.length; i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[]nums={0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
