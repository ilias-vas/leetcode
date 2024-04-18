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

/** 
 * Create a new head node aka dummy node for future reference with ListNode.next
 * Create a current node thats equal to the position of the temp node (head of the list), we will use this to traverse through the lists
 * while list 1 and 2 arent null (empty) we check if current node of list 1 is smaller than the current node of list 2, if it is we set 
 * current node.next to l1 and then update l1 to l1.next as we need to keep traversing the list. vice versa for the opposite condition
 * once done, update the current node using currentnode.next,
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode currentNode = temp;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2; 
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }
        // Fill remaining elements of list1 and 2 if there are any. If list1 isnt null, use list1, otherwise use list2
        currentNode.next = list1 != null ? list1 : list2;
        return temp.next;
    }
}
