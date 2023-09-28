
/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class AddTwoLists{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node sec){
        // code here
        // return head of sum list
        Node f = reverseList(first);
        Node s = reverseList(sec);
        Node head = null;
        int carry = 0;
        while(f!=null || s!=null){
            int sum = carry;
            if(f!=null){
                sum+=f.data;
                f = f.next;
            }
            if(s!=null){
                sum+=s.data;
                s = s.next;
            }
            int digit = sum%10;
            Node newNode = new Node(digit);
                newNode.next = head;
                head = newNode;
                carry = sum/10;
        }
        if(carry!=0){
            Node newNode = new Node(carry);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    static Node reverseList(Node head)
    {
        Node curr = head;
        Node prev = null;
        while(curr!= null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
         return prev;
    }
}
