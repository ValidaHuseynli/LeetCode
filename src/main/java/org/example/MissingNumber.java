package org.example;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int totalSum=n*(n+1)/2;
        int sum=0;
        for (int num : nums) {
            sum=sum+num;
        }
        return totalSum-sum;
    }




    public static void main(String[] args) {
        int [] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(nums.length);
    }
}
