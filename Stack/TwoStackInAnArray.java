public class TwoStackInAnArray {

    int arr[];
    int capacity;
    int top1, top2;

    TwoStackInAnArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        top1 = -1;
        top2 = capacity;
    }

    void push1(int x){
        if(top1<top2-1){
            top1++;
            arr[top1] = x;
            System.out.println("Element Inserted : " + arr[top1]);
        }
        else{{
            throw new RuntimeException("Stack1 is full");
        }
    }
    }
    void push2(int x){
        if(top1<top2-1){
            top2--;
            arr[top2] = x;
            System.out.println("Element Inserted : " + arr[top2]);
        }
        else{{
            throw new RuntimeException("Stack2 is full");
        }
    }
    }

    int pop1(){
        if(top1>=0){
            int x = arr[top1];
            top1--;
            return x;
        }
        else{
            throw new RuntimeException("Stack1 is empty");
        }
    }

    int pop2(){
        if(top2<capacity){
            int x = arr[top2];
            top2++;
            return x;
        }
        else{
            throw new RuntimeException("Stack2 is empty");
        }
    }

    int peek1(){
        if(top1>=0){
            int x = arr[top1];
            return x;
        }
        else{
            throw new RuntimeException("Stack1 is empty");
        }
    }

    int peek2(){
        if(top2<capacity){
            int x = arr[top2];
            return x;
        }
        else{
            throw new RuntimeException("Stack2 is empty");
        }
    }

    int size1(){
        return top1 +1;
    }

    int size2(){
        return arr.length - top2;
    }

    boolean isEmpty1(){
        return top1 == -1;
    }

    boolean isEmpty2(){
        return top2 == capacity;
    }

    public static void main(String[] args) {
        int capacity = 6;
        TwoStackInAnArray twoStacks = new TwoStackInAnArray(capacity);
        twoStacks.push1(10);
        twoStacks.push1(20);        
        twoStacks.push1(30);
        System.out.println(twoStacks.peek1());
        twoStacks.push2(40);
        System.out.println(twoStacks.peek2());
        twoStacks.push1(50);        
        twoStacks.pop1();
        System.out.println(twoStacks.peek1());
    }
}
