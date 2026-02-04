package org.example;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {

        s=s.trim();

        int i = s.lastIndexOf(' ');
        if(i!=-1){
            return s.substring(i).length()-1;
        }else
            return s.length()-1;



    }
}
