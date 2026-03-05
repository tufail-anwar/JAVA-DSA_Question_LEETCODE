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
    public ListNode swapNodes(ListNode head, int k) {
        int len=length(head);
        int count=1;
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        while(temp!=null){
            if(count==k){
                slow=temp;
            }
            count++;
            temp=temp.next;
            if(count == (len - k + 1)){
                fast = temp;
            }
        }
        int temp_val=slow.val;
        slow.val=fast.val;
        fast.val=temp_val;
        return head;
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