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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums,0,nums.length-1);
    }
    public TreeNode constructMaximumBinaryTree(int[] nums,int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int maxIndex=maxIndex(nums,start,end);
        TreeNode root=new TreeNode(nums[maxIndex]);
        root.left=constructMaximumBinaryTree(nums,start,maxIndex-1);
        root.right=constructMaximumBinaryTree(nums,maxIndex+1,end);
        
        return root;
    }
     public int maxIndex(int[] nums,int start,int end)
    {
        int index=start;   
        int max=0;
       for(int i=start;i<=end;i++)
       {
           if(nums[i]>max)
           { 
             max=nums[i];
               index=i;
           }
       }
       return index;
   }
}
