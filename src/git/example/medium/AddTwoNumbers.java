package git.example.medium;

import java.util.List;

/***
 *  [Link]      https://leetcode.com/problems/add-two-numbers/
 *
 *  You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
 *  and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 *  You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 ***/

public class AddTwoNumbers {

    public static void main(String[] args) {
        // Result = [7,0,8]
        ListNode firstList = new ListNode(2, new ListNode(4, new ListNode(3)));     //  [2,4,3]
        ListNode secondList = new ListNode(5, new ListNode(6, new ListNode(4)));    //  [5,6,4]

        ListNode threeList =
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9)))))));     //  [2,4,3]
        ListNode fourthList =
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9)))) ;  //  [9,9,9]

        ListNode result1 = addTwoNumbers(firstList, secondList);
        ListNode result2 = addTwoNumbers(threeList, fourthList);

        System.out.println(result1.print(result1));
        System.out.println(result2.print(result2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return createNode(l1,l2,0);
    }

    private static ListNode createNode(ListNode l1, ListNode l2, int ten) {
        if (l1 == null && l2 == null)
            return ten == 0 ? null : new ListNode(ten);
        int a = l1 == null ? 0 : l1.val;
        int b = l2 == null ? 0 : l2.val;
        int c = a + b + ten;

        return new ListNode(c > 9 ? c % 10 : c, createNode(
                l1 == null ? null : l1.next == null ? null : l1.next,
                l2 == null ? null : l2.next == null ? null : l2.next,
                c > 9 ? 1 : 0
        ));
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
            this.val = val; this.next = next;
        }

        public String print(ListNode listNode) {
            if (listNode == null)
                return "";
            return listNode.val + " " + print(listNode.next);
        }

    }

}
