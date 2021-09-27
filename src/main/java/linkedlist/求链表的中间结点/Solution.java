package linkedlist.求链表的中间结点;

import linkedlist.ListNode;


/**
 * leetcode 876
 *
 * @Author 喻可
 * @Date 2021/9/26 17:19
 */
public class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }
}
