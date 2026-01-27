package org.example;

public class FibonacciNumber {
    public int fib(int n) {

        int[] arr=new int[31];
        int leftSum=0;
        int rightSum=1;
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<arr.length; i++){
            arr[i] =leftSum+rightSum;
            leftSum=rightSum;
            rightSum=rightSum+ arr[i];
        }

        return arr[n];

    }
}
