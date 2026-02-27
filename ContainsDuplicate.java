package org.example;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> arr=new HashSet<>();

        for (int num : nums) {
            if(arr.contains(num))
                return true;
            else arr.add(num);
        }
        return false;
    }
}
