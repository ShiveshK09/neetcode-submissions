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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode newhead=new ListNode(-1);
    newhead.next=head;
    dfs(newhead,n+1);
    return newhead.next;
    }

    public int dfs(ListNode head,int k){
        if(head==null) return 0;
        int index=1+dfs(head.next,k);
        if(index==k) head.next=head.next.next;
        return index;
    }
}
