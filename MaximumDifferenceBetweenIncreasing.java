package org.example;

public class MaximumDifferenceBetweenIncreasing {
    public static int maximumDifference(int[] nums) {
        int minNumber=nums[0];
        int maxDifference=0;
        for (int num : nums) {
            if(num<minNumber){
                minNumber=num;
            }else {
                maxDifference=Math.max(maxDifference, (num-minNumber));
            }
        }
        if(maxDifference==0)
            return -1;
        else return maxDifference;
    }

    public static void main(String[] args) {
        int[] num={7,1,5,4};
        maximumDifference(num);
    }
}
