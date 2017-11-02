/*
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Difficulty: easy
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode ret = new ListNode(0);
        ListNode retP = ret;
        while(l1 != null && l2 != null){
            ListNode tmp = null;
            if(l1.val < l2.val){
                tmp = l1;
                l1 = l1.next;
            }
            else if (l1.val >= l2.val){
                tmp = l2;
                l2 = l2.next;
            }
            retP.next = tmp;
            retP = retP.next;
        }
        if(l1 != null){
            retP.next = l1;
        }
        if(l2 != null){
            retP.next = l2;
        }
        return ret.next;
    }
}
