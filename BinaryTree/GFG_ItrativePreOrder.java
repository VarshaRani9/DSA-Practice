//User function Template for Java

// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class GFG_ItrativePreOrder
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node pop = stack.pop();
            res.add(pop.data);
            if(pop.right!=null)stack.push(pop.right);
            if(pop.left!=null)stack.push(pop.left);
        }
        return res;
    }
