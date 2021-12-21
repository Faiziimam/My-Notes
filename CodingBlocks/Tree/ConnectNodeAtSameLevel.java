/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)
        {
            return null;
        }
        
        Queue<Node> ans=new LinkedList<>();
        ans.add(root);
        ans.add(null);
        
        while(!ans.isEmpty())
        {
            Node node=ans.poll();
            if(node!=null)
            {
                if(node.left!=null){
                    ans.add(node.left);
                }
                if(node.right!=null){
                    ans.add(node.right);
                }
                node.next=ans.peek();
            }
            else
            {
                if(!ans.isEmpty())
                {
                    ans.add(null);
                }
            }
        }
        return root;
    }
}
