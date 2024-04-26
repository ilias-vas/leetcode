/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/* 
 * Create two pointers, a slow pointer and fast pointer and start them at position head
 * from there, while the fast pointer and its next value isnt null (meaning that if there is a null value at all in the list that means the loop breaks) 
 * set the slow pointer to next, and the fast pointer to next.next, meaning the slow pointer will move by 1 and the fast pointer by 2. 
 * If the slow pointer is equal to the fast pointer, that means there is a cycle, as the fast pointer should always be ahead of the slow pointer in 
 * the case of no cycle, and if they meet up, it means that the fast pointer has gotten to the end of the list and then made it back to the slow pointer.
 * outside of the loop, just return false because as eplained earlier, if the fast pointer encounters a node that is null or points to null, that means
 * that there is no cycle in the list
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head; 
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) {
                return true;
            } 
        }
        return false;
    }
}
