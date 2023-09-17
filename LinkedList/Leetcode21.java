// 21. Merge Two Sorted Lists

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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode a = head1;
        ListNode b = head2;
        if(a==null)return b;
        if(b==null)return a;
        ListNode head = null;
        ListNode tail = null;
        if(a.val<=b.val){
            head = a;
            tail = a;
            a = a.next;
        }
        else{
            head = b;
            tail = b;
            b = b.next;
        }
        while(a!=null && b!=null){
            if(a.val<=b.val){
                tail.next = a;
                tail = a;
                a = a.next;
            }
            else{
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
            if(a==null && b!=null)tail.next=b;
            if(a!=null && b==null)tail.next=a;
        return head;

    }
}
