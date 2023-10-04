/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here
	Node slow = head;
	Node fast = head;
	while(fast!=null && fast.next!=null){
	    slow = slow.next;
	    fast = fast.next.next;
	    if(slow==fast)return true;
	}
	return false;
    }
}
