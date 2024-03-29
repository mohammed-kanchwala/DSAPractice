package com.mohammed.dsa.linked_list.medium;

import com.mohammed.dsa.linked_list.easy.ReverseLinkedList.ListNode;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);

        ListNode left = dummy;
        ListNode right = head;
        while (n > 0 && right != null) {
            right = right.next;
            n--;
        }

        while (right != null) {
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;

        return dummy.next;
    }
}
