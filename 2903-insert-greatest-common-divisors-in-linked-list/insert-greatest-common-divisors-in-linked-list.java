/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode s = head;
        ListNode f = head.next;
        while (f != null) {
            ListNode node = new ListNode(gcd(s, f));
            s.next = node;
            node.next = f;
            s = f;
            f = f.next;
        }
        return head;
    }

    int gcd(ListNode a, ListNode b) {
        int x = a.val;
        int y = b.val;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}