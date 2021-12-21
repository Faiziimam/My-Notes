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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        q.add(root);
        q.add(null);
        int level=0;
        while(!q.isEmpty())
        {
            TreeNode node=q.poll();
            if(node==null)
            {
                if(level%2==0)
                {
                    ans.add(l);
                }
                else{
                    Collections.reverse(l);
                    ans.add(l);
                }
                level++;
                if(!q.isEmpty())
                {
                    q.add(null);
                }
                l=new ArrayList<>();
            }
            else
            {
                l.add(node.val);
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
        }
        return ans;
    }
}
