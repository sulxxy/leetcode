/**
 *
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * Difficulty: medium
 *
 */

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp1 = l1;
        ListNode tmp2 = l2;
        ListNode ret = new ListNode(0);
        ListNode rettmp = ret;
        ListNode tmpNode;
        int carryVal = 0;
        int tmpval = 0;
        while(tmp1 != null && tmp2 != null){
            tmpNode = new ListNode(0);
            tmpval = tmp1.val + tmp2.val + carryVal;
            if(tmpval >= 10){
                tmpNode.val = tmpval%10;
                carryVal = 1;
            }
            else{
                tmpNode.val = tmpval;
                carryVal = 0;
            }
            rettmp.next = tmpNode;
            rettmp = rettmp.next;
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
        }
        while(tmp1 != null){
            tmpNode = new ListNode(0);
            tmpval = tmp1.val + carryVal;
            if(tmpval >= 10){
                tmpNode.val = tmpval%10;
                carryVal = 1;
            }
            else{
                tmpNode.val = tmpval;
                carryVal = 0;
            }
            rettmp.next = tmpNode;
            rettmp = rettmp.next;
            tmp1 = tmp1.next;
        }
        while(tmp2 != null){
            tmpNode = new ListNode(0);
            tmpval = tmp2.val + carryVal;
            if(tmpval >= 10){
                tmpNode.val = tmpval%10;
                carryVal = 1;
            }
            else{
                tmpNode.val = tmpval;
                carryVal = 0;
            }
            rettmp.next = tmpNode;
            rettmp = rettmp.next;
            tmp2 = tmp2.next;
        }
        if(tmp1 == null && tmp2 == null){
            if(carryVal == 1){
                tmpNode = new ListNode(0);
                tmpNode.val = 1;
                rettmp.next = tmpNode;
                rettmp = rettmp.next;
            }
        }
        return ret.next;
    }
}
