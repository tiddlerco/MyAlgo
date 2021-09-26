package linkedlist.单链表反转;

import linkedlist.ListNode;

/**
 * @Author 喻可
 * @Date 2021/9/26 17:19
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.getNext();
            curr = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
