package org.example;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        boolean isPalindrome;

        int reverse=0;
        while (x>reverse){
            reverse=reverse*10+x%10;
            x=x/10;
        }
        if(x==reverse){
            return true;
        }else return false;
    }
}
