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
        ListNode n = new ListNode();
        ListNode k = n;

        int carry = 0;
        while(l1!=null || l2!=null){
            int l1_val = (l1 != null)?l1.val:0;
            int l2_val = (l2 != null)?l2.val:0;

            int currVal = l1_val + l2_val + carry; 
            carry = currVal/10;
            int unit = currVal % 10;

            ListNode newNode = new ListNode(unit);
            k.next = newNode;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            k = k.next;
        }

        if(carry > 0){
            ListNode newNode = new ListNode(carry);
            k.next = newNode;
            k = k.next;
        }
        return n.next;
    }
}
