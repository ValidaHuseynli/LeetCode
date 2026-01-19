package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Solution solution=new Solution();
        int[] arr={8, -9, 56, -4};
        int[] arr1={0, -9, 56, -5};
        int[] ints = solution.sortedSquares(arr1);
        System.out.println(Arrays.toString(ints));*/

        /*PlusOne plusOne=new PlusOne();
        int[] digits={2,6,9};
        int[] ints = plusOne.plusOne(digits);
        System.out.println(Arrays.toString(ints));*/

        FairCandySwap fairCandySwap=new FairCandySwap();
        int[] ints = fairCandySwap.fairCandySwap(new int[]{1,2}, new int[]{2,3});
        System.out.println(Arrays.toString(ints));;


    }
}