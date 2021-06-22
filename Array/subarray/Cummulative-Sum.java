Time-Complexity=O(n^2)

public void cummulative(int[] a)
{
  int maxSum=Integer.MIN_VALUE;
  int currentSum[]=new int[a.length+1];
  currentSum[0]=0;
  for(int i=1;i<=a.length;i++)
  {
      currentSum[i]=currentSum[i-1]+a[i-1];
  }
  for(int i=1;i<=a.length;i++)
  {
   maxSum=Math.max(maxSum,currentSum[i]);
    for(int i=1;i<=a.length;i++)
    {
        sum=currentSum[i]+currentSum[j-1];
         maxSum=Math.max(maxSum,sum);
    }
  }
    System.out.print(maxSum);
}
