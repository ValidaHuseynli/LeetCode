package org.example;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;
        for (int bobSize : bobSizes) {
            sumBob = sumBob + bobSize;
        }
        for (int aliceSize : aliceSizes) {
            sumAlice = sumAlice + aliceSize;
        }
        int diff = (sumAlice - sumBob) / 2;

        Set<Integer> bobSet = new HashSet<>();
        for (int b : bobSizes) {
            bobSet.add(b);
        }

        for (int a : aliceSizes) {
            int b = a - diff;
            if (bobSet.contains(b)) {
                return new int[]{a, b};
            }
        }
        return new int[0];
    }
}
