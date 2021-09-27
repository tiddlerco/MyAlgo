package linkedlist.链表中环的检测;

import linkedlist.ListNode;

/**
 * leetcode 141
 * @Author 喻可
 * @Date 2021/9/26 17:19
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.getNext() == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.getNext();
        while (slow != fast) {
            if (fast == null || fast.getNext() == null) {
                return false;
            }
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return true;
    }
}
