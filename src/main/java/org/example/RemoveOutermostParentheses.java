package org.example;

public class RemoveOutermostParentheses {

    String removeOuterParentheses(String S) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && count++ > 0)
                res.append(c);
            if (c == ')' && count-- > 1)
                res.append(c);
        }
        return res.toString();
    }

}
