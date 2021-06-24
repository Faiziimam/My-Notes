// Q Given an array arr[] of size n, find the first repeating element. The element should occurs more than once and the index of its first occurrence should be 
//   the smalles
class Solution{
    //Function to return the position of the first repeating element.
    public static int firstRepeated(int []a, int n) 
    {
        //Your code here
        final int N=(int)1e6+2;
        int[] idx=new int[N];
        for(int i=0;i<N;i++)
        {
            idx[i]=-1;
        }
       int minIndex=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(idx[a[i]]!=-1)
            {
                minIndex=Math.min(minIndex,idx[a[i]]);
            }
            else
                idx[a[i]]=i;
    }
    if(minIndex==Integer.MAX_VALUE)
    {
        return -1;
    }
      return minIndex+1;
    }
   
}
