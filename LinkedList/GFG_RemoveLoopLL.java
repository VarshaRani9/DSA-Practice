
/*
class Node
{
    int data;
    Node next;
}
*/

class RemoveLoopLL
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node slow = head;
	    Node fast = head;
	    while(fast!=null && fast.next!=null){
	        slow = slow.next;
	        fast = fast.next.next;
	        if(slow==fast){
	            break;
	        }
	    }
	    if(slow!=fast)return;
	    slow = head;
	    if(slow!=fast){
	        while(slow.next!=fast.next){
	            slow = slow.next;
	            fast = fast.next;
	        }
	    }
	   // when slow fast meets at start
	    else{
	        while(fast.next!=slow)fast= fast.next;
	    }
	    fast.next=null;
    }
}
