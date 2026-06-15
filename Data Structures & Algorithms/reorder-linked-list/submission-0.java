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
    public ListNode reverse(ListNode head){
        if(head==null) return null;
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
    public void reorderList(ListNode head) {
        if(head==null|| head.next==null) return;
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
        slow.next=null;
        second=reverse(second);
        ListNode first=head;
        while(first!=null && second!=null){
            ListNode t1=first.next;
            ListNode t2=second.next;
            first.next=second;
            second.next=t1;
            first=t1;
            second=t2;
        }
    }
}
