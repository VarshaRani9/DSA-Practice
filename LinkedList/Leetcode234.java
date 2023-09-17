// 234. Palindrome Linked List

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
    public boolean isPalindrome(ListNode head) {
        if(head == null)return true;
        ListNode mid = middle(head);
        ListNode reverse = rev(mid);
        ListNode left = head;
        ListNode right = reverse;
        while(right!=null){
            if(left.val!=right.val)return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode rev(ListNode mid){
        ListNode cur = mid,prev = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    } 
}
