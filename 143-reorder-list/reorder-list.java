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
    public void reorderList(ListNode head) {
     if(head==null || head.next==null){
            return;
        }
        ListNode mid=middleNode(head);
        ListNode hs=reversal(mid);
        ListNode hf=head;
        // rearrange
        while(hs!=null&& hs!=null) {
            if(hf.next==null){
                return;
            }
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;
            temp=hs.next;
            hs.next=hf;
            hs=temp;

        }
        if(hf!=null){
            hf.next=null;
        }
    }
     public ListNode reversal(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode Next=pres.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=Next;
            if(Next!=null){
                Next=Next.next;
            }
        }
        head=prev;
        return head;
}
public ListNode middleNode(ListNode head){
    ListNode s=head;
    ListNode f=head;
    while(f!= null && f.next!=null){
        s=s.next;
        f=f.next.next;
    }
    return s;
}
}