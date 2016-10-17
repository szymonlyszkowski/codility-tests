package stacksAndQueues.brackets;

import java.util.Stack;

/**
 * 100%
 */
public class Solution {

    public int solution(String S) {
        if (S.isEmpty())
            return 1;
        if (S.length() == 1)
            return 0;
        if (S.startsWith("}") || S.startsWith(")") || S.startsWith("]"))
            return 0;
        Stack brackets = new Stack();
        for (char character : S.toCharArray()) {
            if (character == '{' || character == '(' || character == '[') {
                brackets.push(character);
            }
            if (!brackets.isEmpty() && !brackets.get(brackets.size() - 1).equals('}') && !brackets.get(brackets.size() - 1).equals(')') && !brackets.get(brackets.size() - 1).equals(')')) {
                if (character == '}' && brackets.get(brackets.size() - 1).equals('{')) {
                    brackets.pop();
                    continue;
                }
                if (character == ')' && brackets.get(brackets.size() - 1).equals('(')) {
                    brackets.pop();
                    continue;
                }
                if (character == ']' && brackets.get(brackets.size() - 1).equals('[')) {
                    brackets.pop();
                    continue;
                }
            }
            else{
                return 0;
            }
        }
        if (brackets.isEmpty())
            return 1;

        return 0;


    }
}
