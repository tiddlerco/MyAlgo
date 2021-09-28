package stack.有效括号;


import java.util.Stack;


/**
 * leetcode 20
 *
 * @Author 喻可
 * @Date 2021/9/26 17:19
 */
public class Solution1 {

    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.empty() || c != stack.pop()) {
                return false;
            }

        }
        return stack.empty();
    }
}
