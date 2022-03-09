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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null) return head;
        ListNode temp = head;
        
        
        if(temp.next == null){
            return head;
        }
        else {

        while (temp.next != null){
            if (temp.val == temp.next.val){
                ListNode p = temp.next;
                
                temp.next = p.next;
               
            }
            else {
                temp = temp.next;
            }
        }
        }
        return head;
    }
}