package org.example;

public class ReverseString {
    public static void reverseString(char[] s) {

        int n=s.length;
        int i=0;
        while (n/2>i){
            char temp=s[i];
            s[i]=s[n-1];
            s[n-1]=temp;
            i++;
            n--;
        }

    }

    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }

}
