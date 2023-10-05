/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node head=null,tail=null;
     Node h1 = head1;
     Node h2 = head2;
     if(h1.data<=h2.data){
         head = h1;
         tail = h1;
         h1 = h1.next;
     }
     else {
         head = h2;
         tail = h2;
         h2 = h2.next;
     }
     while(h1!=null && h2!=null){
        if(h1.data<=h2.data){
         tail.next = h1;
         tail = h1;
         h1 = h1.next;
        }
        else {
         tail.next = h2;
         tail = h2;
         h2 = h2.next;
        }
     }
     if(h1!=null)tail.next=h1;
     if(h2!=null)tail.next = h2;
     return head;
   } 
}
