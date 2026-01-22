package org.example;

public class RemoveOutermostParentheses {

    String removeOuterParentheses(String S) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (int c = 0; c < S.length(); c++) {
            if (S.charAt(c) == '(' && count++ > 0)
                res.append(S.charAt(c));
            if (S.charAt(c) == ')' && count-- > 1)
                res.append(S.charAt(c));
        }
        return res.toString();
    }

}
