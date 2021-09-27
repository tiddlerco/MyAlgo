package linkedlist.两个有序的链表合并;

import linkedlist.ListNode;

import java.util.LinkedList;

/**
 * leetcode 21
 * @Author 喻可
 * @Date 2021/9/26 17:19
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        LinkedList<String> list = new LinkedList<>();
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.getVal() < l2.getVal()) {
            //递归是以栈的形式 先进后出
            // l1.getNext()指针指向很重要
//            l1.getNext() = mergeTwoLists(l1.getNext(), l2);
            return l1;
        } else {
//            l2.getNext() = mergeTwoLists(l1, l2.getNext());
            return l2;
        }
    }
}
