//User function Template for Java

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

class GFG_LevelOrderTraversal
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList <Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node ele = q.remove();
            res.add(ele.data);
            if(ele.left!=null)q.add(ele.left);
            if(ele.right!=null)q.add(ele.right);
        }
        return res;
    }
}
