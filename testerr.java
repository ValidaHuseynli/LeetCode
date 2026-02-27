package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class testerr {

    public static void main(String[] args) {

     /*   int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};

        Map<Integer, Integer> map=new HashMap<>();
        Deque<Integer> dq=new ArrayDeque<>();

        for (int num : nums2) {

            while (!dq.isEmpty() && dq.peek()<num){

                map.put(dq.pop(), num);

            }
            dq.push(num);

        }
        int[]res=new int[nums1.length];*/

        Period between = Period.between(LocalDate.of(2003, 02, 5), LocalDate.now());
        System.out.println(between.getYears());


    }

}
