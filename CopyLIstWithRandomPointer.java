/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode nodeP = head;
        while(nodeP != null){
            map.put(nodeP, new RandomListNode(nodeP.label));
            nodeP = nodeP.next;
        }
        
        nodeP = head;
        while(nodeP != null){
            map.get(nodeP).next = map.get(nodeP.next);
            map.get(nodeP).random = map.get(nodeP.random);
            nodeP = nodeP.next;
        }
        
        return map.get(head);
    }
}