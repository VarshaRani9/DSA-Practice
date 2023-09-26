
//function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/
class ReverseList
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
    
    // ITERATIVE
    //     Node curr = head;
    //     Node prev = null;
    //     while(curr!= null){
    //         Node temp = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = temp;
    //     }
    //      return prev;
    
    // RECURSIVE
        if(head==null || head.next==null)return head;
        Node temp = head.next;
        Node newNode = reverseList(head.next);
        temp.next = head;
        head.next = null;
        return newNode;
    }
}
