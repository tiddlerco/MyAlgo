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
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
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
        ListNode list2 = solution.removeNthFromEnd(list1,3);
        System.out.println(list2);
    }

}
