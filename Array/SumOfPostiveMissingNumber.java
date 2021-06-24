public int postiveMissing(int a[],int n)
{
  boolean[] present=new boolean[n+1];
  for(int i=0;i<n;i++)
  {
     if(a[i]>0 && a[i]<=n)
         present[a[i]]=true;
  }
  for(int i=1;i<=n;i++)
  {
    if(!present)
      return i;
  }
  return n+1;
}
