package linkedlist;

import lombok.Data;

/**
 * @Author 喻可
 * @Date 2021/9/26 17:15
 */
@Data
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
