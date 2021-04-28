public boolean equal(Main other)
{
    if(other==null)
    {
        return true;
    }
    return equal(root,other.root);
}
private boolean equal(node first, node second)
{
  if(first==null && second==null)
  {
      return true;
  }
  if(first!=null && second != null)
  {
      return first.data==second.data
              && equal(first.left,second.left)
              && equal(first.right,second.right);
  }
  return false;
}
