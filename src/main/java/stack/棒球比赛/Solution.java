package stack.棒球比赛;

import java.util.Stack;

/**
 * 682
 * @Author 喻可
 * @Date 2021/9/28 14:44
 */
public class Solution {

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();

        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int ans = 0;
        for (int score : stack) {
            ans += score;
        }
        return ans;
    }
}
