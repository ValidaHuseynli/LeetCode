package org.example;

public class DuplicateZeroes {
    public static void duplicateZeros(int[] arr) {

        int n = arr.length;
        int j = 0;
        int[] temp = new int[n];
        for (int k : arr) {
            if (j < n) {
                temp[j]=arr[k];
                j++;
            }
            if(k==0 && j<n){
               temp[j]=0;
               j++;
            }
        }
        for (int i=0; i<n; i++) {
            arr[i]=temp[i];
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(nums);
    }

}
