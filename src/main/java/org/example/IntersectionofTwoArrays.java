package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        /*Set<Integer> arr1=new HashSet<>();
        Set<Integer> result=new HashSet<>();
        for (int i : nums1) {
            arr1.add(i);
        }
        for (int i : nums2) {
            if(arr1.contains(i)){
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();*/

        Set<Integer> result=new HashSet<>();
        for (int i : nums1) {
            for (int i1 : nums2) {
                if(i==i1){
                    result.add(i);
                    break;
                }
            }
        }
        int[] res=new int[result.size()];
        int a=0;
        for (Integer i : result) {
            res[a]=i;
            a++;
        }

        return res;

        /*boolean[] freq = new boolean[1001];
        ArrayList<Integer> list = new ArrayList<>();

        for (int n : nums1) {
            freq[n] = true;
        }

        for (int n : nums2) {
            if (freq[n]) {
                list.add(n);
                freq[n] = false; // duplicate olmasın
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;*/
    }

    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
