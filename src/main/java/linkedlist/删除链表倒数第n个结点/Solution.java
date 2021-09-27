package linkedlist.删除链表倒数第n个结点;

import linkedlist.ListNode;

import java.util.Stack;

/**
 * leetcode 19
 * @Author 喻可
 * @Date 2021/9/26 17:19
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<String> stack = new Stack<>();
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; ++i) {
            first = first.getNext();
        }
        while (first != null) {
            first = first.getNext();
            second = second.getNext();
        }
//        second.getNext() = second.getNext().getNext();
        ListNode ans = dummy.getNext();
        return ans;
    }
}
