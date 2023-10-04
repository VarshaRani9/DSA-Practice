/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class CountNodes
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        //Code here
        int ct = 0;
        while(head!=null){
            ct++;
            head=head.next;
        }
        return ct;
    }
}
