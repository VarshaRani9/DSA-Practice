// 23. Merge k Sorted Lists

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

  // Approach - 1
    public ListNode mergeKLists(ListNode[] list) {
        if(list.length==0)return null;
        ArrayList<Integer> l = new ArrayList<>();
        for(ListNode node: list){
            while(node!=null){
                l.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(l);
        ListNode head = null;
        ListNode temp = null;
        for(Integer i : l){
            if(temp ==null){
                temp = new ListNode(i);
                head = temp;
            }
            else{
                temp.next = new ListNode(i);
                temp = temp.next;
            }
        } 
        return head;
    }

    // Approach - 2
    // public ListNode mergeKLists(ListNode[] list) {
      
    //     if(list == null ||  list.length==0 )return null;
    //     int interval =  1;
    //     while(interval<list.length){
    //         for(int i =0;i+interval<list.length;i=i+interval*2){
    //             list[i]=mergeTwoLists(list[i],list[i+interval]);
    //         }
    //         interval*=2;
    //     }
    //     return list[0];
    // }
  
    // public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
    //     ListNode a = head1;
    //     ListNode b = head2;
    //     if(a==null)return b;
    //     if(b==null)return a;
    //     ListNode head = null;
    //     ListNode tail = null;
    //     if(a.val<=b.val){
    //         head = a;
    //         tail = a;
    //         a = a.next;
    //     }
    //     else{
    //         head = b;
    //         tail = b;
    //         b = b.next;
    //     }
    //     while(a!=null && b!=null){
    //         if(a.val<=b.val){
    //             tail.next = a;
    //             tail = a;
    //             a = a.next;
    //         }
    //         else{
    //             tail.next = b;
    //             tail = b;
    //             b = b.next;
    //         }
    //     }
    //         if(a==null && b!=null)tail.next=b;
    //         if(a!=null && b==null)tail.next=a;
    //     return head;
    // }
}
