package git.example.easy;

/***
 *
 * [Level]:             Easy
 *
 * [Link]:              https://leetcode.com/problems/merge-two-sorted-lists/
 *
 * [Description]:       You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 *
 * [Constraints]:
 *
 ***/


public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.println(mergeTwoLists(list1, list2));
    }

    /**
     *
     * Runtime = 0 ms
     * Memory = 41.8 MB
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val < list2.val) {
            result.val = list1.val;
            result.next = mergeTwoLists(list1.next, list2);
        } else {
            result.val = list2.val;
            result.next = mergeTwoLists(list2.next, list1);
        }

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return val + " " + (next == null ? "" : next.toString());
        }
    }
}
