// 445. Add Two Numbers II

class Solution {
    public ListNode addTwoNumbers(ListNode h1, ListNode h2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(h1!=null){
            s1.add(h1.val);
            h1 = h1.next;
        }
        while(h2!=null){
            s2.add(h2.val);
            h2 = h2.next;
        }
        ListNode res = null;
        int carry = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            int digit1=0;
            int digit2 =0; 
            if(!s1.isEmpty()){
                digit1 = s1.pop();
            }
            if(!s2.isEmpty()){
                digit2 = s2.pop();
            }
            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            if(res==null)res = newNode;
            else{
             newNode.next = res;
             res = newNode;
            }
        }
        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            newNode.next = res;
            res = newNode;
        }
        return res;
    }
}
