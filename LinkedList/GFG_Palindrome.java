/* Structure of class Node is
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

class Palindrome
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head==null || head.next ==null)return true;
        if(head.next.next==null){
            if(head.data == head.next.data)return true;
        }
        Node middle = mid(head);
        Node reversed = rev(middle);
        Node left = head;
        Node right = reversed;
        while(right!=null){
            if(left.data!=right.data)return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }  
    Node mid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    Node rev(Node mid){
        Node prev = null;
        Node curr = mid;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
    return prev;
    }
}
