/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

//Function should return the length of the loop in LL.

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        // if(head.next.next==head)return 2;
        Node slow = head;
	    Node fast = head;
	    while(fast!=null && fast.next!=null){
	        slow = slow.next;
	        fast = fast.next.next;
	        if(slow==fast){
	            return countNodes(slow);
	        }
	    }
	    return 0;
    }
    static int countNodes(Node slow){
        int count = 1;
        Node curr = slow.next;
	    while(curr!=slow){
	       count++;
	       curr = curr.next;
	    }
	    return count;
    }
}
