//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class GFG_KDistFromRoot
{
     ArrayList<Integer> Kdistance(Node root, int k)
     {
        // Your code here
        if(root==null){
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(k==0)list.add(root.data);
        ArrayList<Integer> res1 = Kdistance(root.left,k-1);
        ArrayList<Integer>  res2 = Kdistance(root.right,k-1);
        for(int e : res1)list.add(e);
        for(int e: res2)list.add(e);
        return list;
     }
}
