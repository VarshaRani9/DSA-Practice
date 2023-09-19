// User function Template for Java

/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class GFG_DiameterOfBT {
    // Function to return the diameter of a Binary Tree.
    int ans = 0;
    int diameter(Node root) {
        // Your code here
        height(root);
        return ans+1;
    }
    int height(Node root) {
        // Your code here
        if(root==null)return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        ans = Math.max(ans, lh+rh);
        return Math.max(lh,rh)+1;
    }
}
