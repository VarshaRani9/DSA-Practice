// LeetCode : 707. Design Linked List

class MyLinkedList {
    Node head;
    int length;

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public MyLinkedList() {
        head = null;
        length = 1;
    }
    
    public int get(int index) {
        if(head==null || index>=length || index<0)return -1;
        Node temp = head;
        for(int i =0;i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        length++;
    }
    
    public void addAtIndex(int index, int val) {
        if((head==null && index!=0 )|| index>length || index<0)return;
        if(index==0) {
        	addAtHead(val);
        	return;
        }
        if(index==length) {
        	addAtTail(val);
        	return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        int i =1; 
        while(i<index) {
          temp = temp.next;
          i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=length || index<0)return;
        if (index == 0) head = head.next;
        else{
        Node temp = head;
        int i =1; 
        while(i<index) {
          temp = temp.next;
          i++;
        }
        temp.next = temp.next.next;
        length--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
