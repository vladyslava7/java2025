package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Solution solver = new Solution();

        //Example 1: list1 = [1,2,4], list2 = [1,3,4]
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result1 = solver.mergeTwoLists(l1, l2);
        System.out.print("Example 1 (Expected: 1, 1, 2, 3, 4, 4): ");
        printList(result1);

        //Example 2: list1 = [], list2 = []
        ListNode l3 = null;
        ListNode l4 = null;

        ListNode result2 = solver.mergeTwoLists(l3, l4);
        System.out.print("Example 2 (Expected: []): ");
        printList(result2);

        //Example 3: list1 = [], list2 = [0]
        ListNode l5 = null;
        ListNode l6 = new ListNode(0);

        ListNode result3 = solver.mergeTwoLists(l5, l6);
        System.out.print("Example 3 (Expected: 0): ");
        printList(result3);

        LinkedList<Integer> javaList1 = new LinkedList<>();
        javaList1.add(1);
        javaList1.add(2);
        javaList1.add(4);

        LinkedList<Integer> javaList2 = new LinkedList<>();
        javaList2.add(1);
        javaList2.add(3);
        javaList2.add(4);

        System.out.println("Java List 1: " + javaList1);
        System.out.println("Java List 2: " + javaList2);

        javaList1.addAll(javaList2);

        Collections.sort(javaList1);

        System.out.println("Результат встроенного (Merged & Sorted): " + javaList1);
    }

    public static void printList(ListNode head) {
        System.out.print("[");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }
}
