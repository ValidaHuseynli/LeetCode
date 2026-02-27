package org.example;

public class SortArraybyParity {
    public static int[] sortArrayByParity(int[] nums) {

        /*int[] result=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for (int num : nums) {
            if(num%2==0){
                result[left++]=num;
            }else result[right--]=num;
        }
        return result;   //1ms 46%*/

        int left=0;
        int right=nums.length-1;
        while (left<right){
            while (left<right && nums[left] %2==0){
                left++;
            }
            while (left<right && nums[right]%2!=0){
                right--;
            }
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums={1, 2, 3, 4, 5, 6};
        sortArrayByParity(nums);
    }
}
