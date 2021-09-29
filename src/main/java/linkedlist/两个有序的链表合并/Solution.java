package linkedlist.两个有序的链表合并;

import linkedlist.ListNode;

import java.util.LinkedList;

/**
 * leetcode 21
 *
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
        } else if (l1.val < l2.val) {
            //递归是以栈的形式 先进后出
            // l1.getNext()指针指向很重要
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        // 把这个迭代想象成一个动画去理解，就很好理解了
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }


    public void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.printf("%d -> ", current.val);
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 4, 5};
        Solution solution = new Solution();
        ListNode list1 = solution.createLinkedList(arr1);
        ListNode list2 = solution.createLinkedList(arr2);
        solution.printLinkedList(list1);
        ListNode result = solution.mergeTwoLists(list1, list2);
        System.out.println(result);
    }
}
