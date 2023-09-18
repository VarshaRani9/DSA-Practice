/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class GFG_HeightOfBT {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node==null)return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        return Math.max(lh,rh)+1;
        
    }
}
