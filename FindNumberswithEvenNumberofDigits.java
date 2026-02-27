package org.example;

public class FindNumberswithEvenNumberofDigits {
    public int findNumbers(int[] nums) {

        int count=0;
        for (int num : nums) {
            int count1=1;
            while (num>9){
                num=num/10;
                count1++;
            }
            if(count1%2==0){
                count++;
            }
        }
        return count;
    }
}
