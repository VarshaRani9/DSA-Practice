/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        // your code here
        Node rev1 = reverse(head);
        int max = -1;
        Node curr = rev1;
        Node prev = null;
        while(curr!=null){
            // System.out.println(curr.data+" "+max);
            if(curr.data>=max){
                max = curr.data;
                prev = curr;
                curr = curr.next;
            }
            else{
                curr = curr.next;
                prev.next = curr;
            }
        }
        Node head1 = reverse(rev1);
        return head1;
    }
    Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
