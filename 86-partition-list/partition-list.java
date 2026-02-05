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
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;

        ListNode temp = new ListNode(0);
        temp.next = head;
        int n = 0;
        ListNode c = head;
        while (c != null) {
            n++;
            c = c.next;
        }

        ListNode s = temp;
        ListNode tail = temp;
        while (tail.next != null){
            tail = tail.next;
        }
        while (n-- > 0) {
            if (s.next == tail ||s.next.val < x) {
                s = s.next;
            } else {
                ListNode node = s.next;
                s.next = node.next;

                tail.next = node;
                node.next = null;
                tail = node;
            }
        }

        return temp.next;
    }
}
