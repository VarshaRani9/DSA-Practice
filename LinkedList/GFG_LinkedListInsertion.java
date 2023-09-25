/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class GFG_LinkedListInsertion
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node newNode = new Node(x);
        if(head==null)return newNode;
        newNode.next = head;
        head = newNode;
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node newNode = new Node(x);
        if(head==null)return newNode;
        if(head.next==null){
            head.next = newNode;
            return head;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }
}
