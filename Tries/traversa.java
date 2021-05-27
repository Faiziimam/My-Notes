// In trie we can traverse in two ways
//   1.Pre Order (Root.data -> child.value)
// 	2. Post Order (child.vale -> root.data)
	
public node[] getChildern() 
{ 
  return  children.values().toArray(new node[0]);
}
// Pre Order
  public void PreOrdertraverse(node root)
    {
        System.out.println(root.value);
        for(var ch:root.getChildern())
        {
            PreOrdertraverse(ch);
        }
    }
		
// 		Post Order Traversal
public void postOrderTraversal(node root)
{
  for(var ch:root.getChildern())
		postOrderTraversal(root);
	System.out.println(root.value);
}
