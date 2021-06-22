T-C=O(N)

public void kadane(int [] a)
{
  int maxSum=Integer.MIN_VALUE;
  int currSum=0;
  for(int i=0;i<a.length;i++)
  {
   currSum+=a[i];
    if(currSum<0)
      currSum=0;
    maxSum=Math.max(maxSum,currSum);
  }
  System.out.print(maxSum);
}
