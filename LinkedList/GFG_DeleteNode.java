
/* Linklist node structure
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class DeleteNode
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
	if(head==null)return head;
	if(x==1){
	    head = head.next;
	    return head;
	}
	int count=1;
	Node curr = head;
	Node prev = null;
	while(curr!=null){
	    if(count==x){
	        prev.next = curr.next;
	        return head;
	    }
	    else {
	        count++;
	        prev = curr;
	        curr = curr.next;
	    }
	}
	return head;
    }
}
