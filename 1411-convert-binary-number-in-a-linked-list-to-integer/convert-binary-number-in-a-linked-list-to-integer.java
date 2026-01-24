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
    public int getDecimalValue(ListNode head) {
        int len=length(head);
        ListNode temp=head;
        int sum=0;
        int i=0;
        while(temp!=null){
            i++;
            sum +=temp.val*Math.pow(2,len-i);
            temp=temp.next;
        }
        return sum;
    }
    public int length(ListNode head){
        ListNode temp=head;
        int len=0;

        while(temp!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }
}