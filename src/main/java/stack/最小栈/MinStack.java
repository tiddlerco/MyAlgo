package stack.最小栈;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @title: MinStack
 * @Author yuke
 * @Date: 2021/9/28 8:07
 */
public class MinStack {

    //Java堆栈Stack类已经过时，Java官方推荐使用Deque替代Stack使用。
    // Deque堆栈操作方法：push()、pop()、peek()
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

