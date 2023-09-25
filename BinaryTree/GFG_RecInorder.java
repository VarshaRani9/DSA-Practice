/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        if(root==null){
            ArrayList<Integer> res = new ArrayList<Integer>();
            return res;
        }
        ArrayList<Integer> res1 = inOrder(root.left);
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int e: res1)res.add(e);
        res.add(root.data);
        ArrayList<Integer> res2 = inOrder(root.right);
        for(int e: res2)res.add(e);
        return res;
    }
}
