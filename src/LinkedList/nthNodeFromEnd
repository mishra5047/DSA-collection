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
        if(head == null) return null;
        
        if(n == size(head)) return head.next;
        
        if(head.next == null){
            if(n == 0) return head;
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while(n-- != 0 && fast.next != null){
            fast = fast.next;
        }
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return head;
    }
    
    public static int size(ListNode head){
        int count = 0;
        while(head != null){
           head = head.next;
            count++;
        }
        
        return count;
    }
}
