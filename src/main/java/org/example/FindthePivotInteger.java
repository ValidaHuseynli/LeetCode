package org.example;

public class FindthePivotInteger {
    public int pivotInteger(int n) {

        // int totalSum=n*(n+1)/2;
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum = totalSum + i;
        }

        /*int leftSum = 0;
        for (int i = 1; i <= n; i++) {
            leftSum += i;
            int rightSum = totalSum - leftSum + i;
            if (rightSum == leftSum)
                return i;
        }*/

        double x=Math.sqrt(totalSum);
        if(x*x==totalSum)
            return (int) x;

        return -1;


    }
}
