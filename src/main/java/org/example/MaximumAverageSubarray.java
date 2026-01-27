package org.example;

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0; i<k; i++){
            sum=sum+nums[i];
        }
        System.out.println(sum);

        double maxSum=sum;
        for(int i=k; i<nums.length; i++){
            sum=sum-nums[i-k]+nums[i];
            if(maxSum<sum){
                maxSum=sum;
            }
        }
        return maxSum/k;
    }


}
