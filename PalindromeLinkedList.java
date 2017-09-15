/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        int length = 0;
        ListNode it = head;
        while(it != null){
            length++;
            it = it.next;
        }
        int[] arr = new int[length];
        it = head;
        int i = 0;
        while(it != null){
            arr[i++] = it.val;
            it = it.next;
        }
        int start = 0;
        int end = length - 1;
        while(start < end){
            if(arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}