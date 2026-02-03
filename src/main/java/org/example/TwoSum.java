package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        for (int j=0; j< nums.length; j++) {
            for (int i = j+1; i < nums.length; i++) {
                if (nums[i]+nums[j]==target) {
                    return new int[] {j,i};
                }
            }
        }
        return null;


        /*Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];*/

    }

    public static void main(String[] args) {
        int [] nums={3,2,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
}
