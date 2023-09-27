
/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node a = head1;
         Node b = head2;
         while(a!=b){
             if(a!=null)a=a.next;
             else a=head2;
             if(b!=null)b=b.next;
             else b=head1;
         }
         if(a==b){
        if(a==null)return -1;
        else return a.data;
         }
         else return -1;
	}
}
