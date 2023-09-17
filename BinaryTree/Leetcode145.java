// 145. Binary Tree Postorder Traversal

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        // Iterative
        List<Integer> list = new ArrayList<>();
        ArrayDeque<TreeNode> s1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> s2 = new ArrayDeque<>();
        if(root == null)return list;
        s1.push(root);
        while(!s1.isEmpty()){
           TreeNode pop = s1.pop();
           s2.push(pop);
           if(pop.left!=null)s1.push(pop.left);
           if(pop.right!=null)s1.push(pop.right);
        }
        while(!s2.isEmpty()){list.add(s2.pop().val);}
        return list;
    }
// Recursive :
    // List<Integer> list = new ArrayList<>();
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     if(root!=null)traverse(root);
    //     return list;
    // }
    // public void traverse(TreeNode node){
    //     if(node.left!=null)traverse(node.left);
    //     if(node.right!=null)traverse(node.right);
    //     list.add(node.val);
    // }
}
