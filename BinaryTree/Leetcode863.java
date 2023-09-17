// 863. All Nodes Distance K in Binary Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<Integer, TreeNode> parents;

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        parents = new HashMap<>();
        dfs(root,null);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(target);
        int dist = 0;
        HashSet<TreeNode> visited = new HashSet<>();
        visited.add(target);
        while (!queue.isEmpty() && dist!=k){
            int size = queue.size();
            for(int i = 0;i<size;i++){
                TreeNode removed = queue.remove();
                if(removed.left!=null && !visited.contains(removed.left)) {
                    queue.add(removed.left);
                    visited.add(removed.left);
                }
                if(removed.right!=null && !visited.contains(removed.right)) {
                    queue.add(removed.right);
                    visited.add(removed.right);
                }
                if(parents.containsKey(removed.val) && !visited.contains(parents.get(removed.val))) {
                    queue.add(parents.get(removed.val));
                    visited.add(parents.get(removed.val));
                }
            }
            dist++;
        }
        List<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()){
            ans.add(queue.remove().val);
        }
        return ans;
    }

    public void dfs(TreeNode node, TreeNode parent){
        if(parent!=null){
            parents.put(node.val, parent);
        }
        if(node.left!=null) dfs(node.left,node);
        if(node.right!=null) dfs(node.right,node);
    }
}
