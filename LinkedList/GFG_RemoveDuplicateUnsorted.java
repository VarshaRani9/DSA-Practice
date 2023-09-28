/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class RemoveDuplicatesUnsorted
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         Set<Integer> set = new HashSet<>();
         Node prev = head;
         Node curr = head.next;
         set.add(head.data);
         while(curr!=null){
             if(set.contains(curr.data))curr = curr.next;
             else{
                 set.add(curr.data);
                 prev.next = curr;
                 prev = curr;
                 curr = curr.next;
             }
         }
         prev.next = null;
         return head;
    }
}
