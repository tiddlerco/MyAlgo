package linkedlist.单链表反转;

import linkedlist.ListNode;

/**
 * leetcode 206
 * @Author 喻可
 * @Date 2021/9/26 17:19
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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
        int[] arr = {1, 2, 3, 4, 5};
        Solution solution = new Solution();
        ListNode list1 = solution.createLinkedList(arr);
        solution.printLinkedList(list1);
        ListNode list2 = solution.reverseList(list1);
        System.out.println(list2);
    }
}
