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
        public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(n==0) return null;
        int interval=1;
        while(interval<n)
        {
            for(int i=0;i+interval<n;i=i+2*interval)
            {
                lists[i]=mergeTwoList(lists[i],lists[i+interval]);
            }
            interval *=2;
        }
        return lists[0];
    }
    public ListNode mergeTwoList(ListNode p1,ListNode p2)
    {
        ListNode newhead=new ListNode(-1);
        ListNode cur=newhead;
        while(p1!=null && p2!=null)
        {
           if(p1.val<p2.val)
           {
            cur.next=p1;
            cur=cur.next;
            p1=p1.next;
           }
           else
           {
            cur.next=p2;
            cur=cur.next;
            p2=p2.next;
           }
        }
        if(p1==null)cur.next=p2;
        if(p2==null) cur.next=p1;
        return newhead.next;
    }
}
