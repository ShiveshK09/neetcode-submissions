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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode cur1=l1,cur2=l2,cur3=res;
        int carry=0;
        while(cur1!=null || cur2!=null || carry>0){
          int v1=cur1==null?0:cur1.val;
          int v2=cur2==null?0:cur2.val;
          int sum=v1+v2+carry;
          carry=sum/10;
          cur3.next=new ListNode(sum%10);
          cur3=cur3.next;
          cur1=cur1==null?cur1:cur1.next;
          cur2=cur2==null?cur2:cur2.next;
        }
        return res.next;
    }
}
