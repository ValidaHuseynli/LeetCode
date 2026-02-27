package org.example;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class NextGreaterElementI {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> ne=new HashMap<>();
        Deque<Integer> deque=new ArrayDeque<>();

        for (int i : nums2) {

            while (!deque.isEmpty() && deque.peek()<i){
                ne.put(deque.pop(), i);
            }

            deque.push(i);
        }

        int [] res=new int[nums1.length];
        for (int i=0; i<nums1.length; i++) {
            res[i]=ne.getOrDefault(nums1[i], -1);
        }
        return res;

    }


    public static void main(String[] args) {


        HashMap<Integer, Integer> a=new HashMap<>(266);

        "anar".compareTo("da");


        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        nextGreaterElement(nums1, nums2);
    }
}
