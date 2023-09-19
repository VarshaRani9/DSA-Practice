//User function Template for Java



// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class GFG_RecPreorder
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        if(root==null){
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.data);
        ArrayList<Integer> list1 = preorder(root.left);
        ArrayList<Integer> list2 = preorder(root.right);
        for(int e:list1)list.add(e);
        for(int e:list2)list.add(e);
        return list;
    }

}
