/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     () {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode ans = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            
            int sum = l1Val + l2Val + carry;
            
            carry = sum >= 10 ? 1 : 0;
            sum = sum % 10;
            
            result.next = new ListNode(sum);
            if(ans == null) {
                ans = result.next;
            }
            result = result.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next: null;
        }
        
        if (carry != 0) {
            result.next = new ListNode(carry);
        }
        
        return ans;
    }
}
