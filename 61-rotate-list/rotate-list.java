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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode tail = head;
        int len = 1;

        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        ListNode s=head;
        ListNode f=head.next;
        ListNode n=s;
        int x=k%len;
        int i=0;
        while(i<(x)){
            while(f.next!=null ){
                f=f.next;
                n=n.next;
            }
            f.next=s;
            n.next=null;
            n=f;
            f=s;
            s=n;
            i++;
        }
        return n;
    }
}