package stacksAndQueues.nesting;

import java.util.Stack;

/**
 * Created by szymonidas on 10/17/16.
 */
public class Solution {
    public int solution(String S) {
        if (S.isEmpty())
            return 1;

        if (S.startsWith(")"))
            return 0;
        Stack brackets = new Stack();
        for (char letter : S.toCharArray()) {
            if (letter == '(')
                brackets.push(letter);
            if (letter == ')') {
                if (brackets.isEmpty()) {
                    return 0;
                }
                brackets.pop();
            }
        }
        if (brackets.isEmpty())
            return 1;

        return 0;


    }
}
