package linkedlist.链表中环的检测;

import linkedlist.ListNode;

/**
 * leetcode 141
 *
 * @Author 喻可
 * @Date 2021/9/26 17:19
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    //无法创建出来一个环  最后一个节点的next总为null
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
        int[] arr = {3, 2, 0, -4};
        Solution solution = new Solution();
        ListNode list1 = solution.createLinkedList(arr);
        solution.printLinkedList(list1);
        boolean list2 = solution.hasCycle(list1);
        System.out.println(list2);
    }


}
