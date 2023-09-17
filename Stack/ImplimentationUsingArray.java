package stack;

class StackUsingArray {
    int a[];
    int capacity;
    int top;

    public StackUsingArray(int capacity){
        this.capacity=capacity;
        a=new int[capacity];
        top = -1;
    }

    boolean push(int element) throws Exception{
        if(top == capacity-1)throw new Exception("Array is full !!");
        top++;
        a[top]=element;
        return true;
    }

    int pop() throws Exception{
        if(top == -1) throw new Exception("Empty Stack !!");
        int ans = a[top];
        top-=1;
        return ans;
    }

    int peek() throws Exception{
        if(top == -1) throw new Exception("Empty Stack !!");
        return a[top];
    }

    boolean isEmpty(){
        return top==-1;
    }

    int size(){
        return top+1;
    }

}

public class ImplimentationUsingArray{
    public static void main(String[] args) throws Exception {
        StackUsingArray obj = new StackUsingArray(3);
        obj.push(8);
        obj.push(6);
        obj.push(5);
        System.out.println(obj.pop());
    }
}

