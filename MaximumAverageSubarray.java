package org.example;

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int n=nums.length;

        for(int i=0; i<k; i++){
            sum=sum+nums[i];
        }
        double maxSum=sum;

        for(int i=k; i<n; i++){
            sum=sum-nums[i-k]+nums[i];
            if(sum>maxSum)
                maxSum=sum;
        }
        return maxSum /k;



    }
}
