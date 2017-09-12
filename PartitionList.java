/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode low = new ListNode(0);
        ListNode high = new ListNode(0);
        ListNode lowP = low;
        ListNode highP = high;
        while(head != null){
            if(head.val >= x){
                high.next = head;
                high = high.next;
            }
            else{
                low.next = head;
                low = low.next;
            }
            head = head.next;
        }
        high.next = null;
        low.next = highP.next;
        return lowP.next;
       
    }
}