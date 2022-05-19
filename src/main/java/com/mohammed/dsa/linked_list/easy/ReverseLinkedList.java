package com.mohammed.dsa.linked_list.easy;

public class ReverseLinkedList {
    static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);

        ListNode result = reverseList(head);
        System.out.print("Nodes of the reversed LinkedList are: ");
        printLinkedList(result);
    }

    public static void printLinkedList(ReverseLinkedList.ListNode result) {
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }

    public static class ListNode {
        public ListNode next;
        int val;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
