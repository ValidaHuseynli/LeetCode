package org.example;

import java.util.ArrayList;

public class IntersectionofTwoArraysII {
    public static int[] intersection(int[] nums1, int[] nums2) {
        boolean[] temp=new boolean[10001];

        ArrayList<Integer> arrlist=new ArrayList<>();

        for(int n: nums1){
            temp[n]=true;
        }

        for(int n: nums2){
            if(temp[n]){
                arrlist.add(n);
                temp[n]=false;
            }
        }

        int[] res=new int[arrlist.size()];
        for(int i=0; i<res.length; i++){
            res[i]=arrlist.get(i);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums={1,2,2,1};
        int[] nums2={2,2};
        intersection(nums, nums2);
    }
}
