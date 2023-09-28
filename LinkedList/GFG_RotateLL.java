
/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class RotateLL{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        int count = 1;
        Node curr = head;
        while(curr.next!=null && count<k){
            curr = curr.next;
            count++;
        }
        if(curr.next==null)return head;
        Node toBeHead = curr.next;
        curr.next = null;
        curr = toBeHead;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = head;
        head = toBeHead;
        return head;
    }
}
