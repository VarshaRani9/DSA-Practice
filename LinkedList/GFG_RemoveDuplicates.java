
/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class RemoveDuplicates
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	    Node curr = head;
	    Node prev = head;
	    while(curr!=null){
	        while(curr!=null && prev.data == curr.data){
	            curr = curr.next;
	        }
	        prev.next=curr;
	        prev = curr;
	    }
	    return head;
    }
}
