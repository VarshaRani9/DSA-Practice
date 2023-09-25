/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class NthNodeFromLast
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	Node p = head;
    	Node q = head;
    	for(int i =0;i<n-1;i++){
    	    if(q.next!=null)q=q.next;
    	    else return -1;
    	}
    	q=q.next;
    	while(q!=null){
    	    p=p.next;
    	    q=q.next;
    	}
    	return p.data;
    }
}
