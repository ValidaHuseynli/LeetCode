package org.example;

import java.util.Arrays;

public class MoveZeroes {
   /* public void moveZeroes(int[] nums) {*/
   public static void main(String[] args) {
       int pos=0;
       int[] nums={0,1,0,3,12};
       int[] arr=new int[nums.length];
       for (int num : nums) {
           if(num!=0){
               arr[pos]=num;
               pos++;
           }
       }
       System.out.println(Arrays.toString(arr));
   }




}
