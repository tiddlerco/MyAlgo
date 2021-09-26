package linkedlist.两个有序的链表合并;

import linkedlist.ListNode;

/**
 * @Author 喻可
 * @Date 2021/9/26 17:19
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.getVal() < l2.getVal()) {
            l1 = mergeTwoLists(l1.getNext(), l2);
            return l1;
        } else {
            l2 = mergeTwoLists(l1, l2.getNext());
            return l2;
        }
    }
}
