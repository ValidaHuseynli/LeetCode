package org.example;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        /*String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] charArray = s1.toLowerCase().toCharArray();
        int i=0;
        while(i<=charArray.length/2){
            if(charArray[i]!=charArray[charArray.length-1-i]){
                isPalindrome=false;
                break;
            }
            i++;
        }*/


        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char c = s.charAt(left);
            char c1 = s.charAt(right);
            if (!Character.isLetterOrDigit(c)) {
                left++;
            } else if (!Character.isLetterOrDigit(c1)) {
                right--;
            } else {
                if (Character.toLowerCase(c) != Character.toLowerCase(c1))
                    isPalindrome = false;
                left++;
                right--;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
