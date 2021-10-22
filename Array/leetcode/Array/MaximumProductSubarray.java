class Solution {
    public int maxProduct(int[] a) {
     int currprod=1,n=a.length;
     int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            currprod*=a[i];
            max=Math.max(currprod,max);
            if(currprod==0)
                currprod=1;
        }
        currprod=1;
        for(int i=n-1;i>=0;i--)
        {
            currprod*=a[i];
            max=Math.max(currprod,max);
             if(currprod==0)
                currprod=1;
        }
        return max;
    }
}
