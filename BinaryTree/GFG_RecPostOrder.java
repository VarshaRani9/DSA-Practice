//User function Template for Java

/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class RecPostOrder
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       if(root==null){
            ArrayList<Integer> res = new ArrayList<Integer>();
            return res;
        }
        ArrayList<Integer> res1 = postOrder(root.left);
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int e: res1)res.add(e);
        ArrayList<Integer> res2 = postOrder(root.right);
        for(int e: res2)res.add(e);
        res.add(root.data);
        return res;
    }
}
