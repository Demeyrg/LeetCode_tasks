package git.example.easy;

/***
 *
 * [Level]:         Easy
 *
 * [Link]:          https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 *
 * [Description]:   Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 *                  Return the linked list sorted as well.
 *
 * [Constraints]:   The number of nodes in the list is in the range [0, 300].
 *                  -100 <= Node.val <= 100
 *                  The list is guaranteed to be sorted in ascending order.
 *
 ***/

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode listNode2 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))));
        ListNode listNode3 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))));
        System.out.println(deleteDuplicates(listNode1));
        System.out.println(deleteDuplicates(listNode2));
        System.out.println(deleteDuplicates(listNode3));
    }

    /**
     *      0 ms,   41.8 MB
     * @param head as {@link ListNode}
     * @return {@link ListNode}
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        if (head.val == head.next.val) {
            while (head.next != null && head.val == head.next.val) {
                head.next = head.next.next;
            }
        }
        if (head.next != null)
            deleteDuplicates(head.next);
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return val + " " + next;
    }
}