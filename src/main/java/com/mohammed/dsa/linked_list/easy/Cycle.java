package com.mohammed.dsa.linked_list.easy;

import static com.mohammed.dsa.linked_list.easy.ReverseLinkedList.ListNode;

public class Cycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
