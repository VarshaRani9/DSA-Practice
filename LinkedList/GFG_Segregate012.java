
//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Segregate012
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node curr = head;
        int count0 = 0,count1=0,count2=0;
        while(curr!=null){
            if(curr.data==0)count0++;
            else if(curr.data==1)count1++;
            else count2++;
            curr = curr.next;
        }
        curr = head;
        while(curr!=null && count0!=0){
            curr.data=0;
            count0--;
            curr = curr.next;
        }
        while(curr!=null && count1!=0){
            curr.data=1;
            count1--;
            curr = curr.next;
        }
        while(curr!=null && count2!=0){
            curr.data=2;
            count2--;
            curr = curr.next;
        }
        return head;
    }
}
