package com.mohammed.dsa.linked_list.easy;

import static com.mohammed.dsa.linked_list.easy.ReverseLinkedList.ListNode;
import static com.mohammed.dsa.linked_list.easy.ReverseLinkedList.printLinkedList;

public class MergeLinkedList {
    static ListNode mergeList(ListNode list1, ListNode list2) {
        ListNode root = new ListNode();
        ListNode previous = root;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                previous.next = list1;
                list1 = list1.next;
            } else {
                previous.next = list2;
                list2 = list2.next;
            }
            previous = previous.next;
        }
        previous.next = list1 != null ? list1 : list2;
        return root.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode result = mergeList(l1, l2);
        System.out.print("Nodes of the merged LinkedList are: ");
        printLinkedList(result);
    }
}
