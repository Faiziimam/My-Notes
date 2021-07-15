// O(N)
public static int solve(int[] array)
    {
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++)
        {

            // Updating max and min variables
            // as described in algorithm.
            max1 = Math.max(max1, array[i] + i);
            min1 = Math.min(min1, array[i] + i);
            max2 = Math.max(max2, array[i] - i);
            min2 = Math.min(min2, array[i] - i);
        }

        // Calculating maximum absolute difference.
        return Math.max(max1 - min1, max2 - min2);
    }








// O(N^2)
    public static int calDiff(int i,int j,int[] a)
    {
        return  Math.abs(a[i]-a[j])+Math.abs(i-j);
    }
    public static int solve(int[] a,int n)
    {
       int maxSum=0;
       for(int i=0;i<n;i++)
       {
           for(int j=i;j<n;j++)
           {

               maxSum=Math.max(maxSum,calDiff(i,j,a));
           }
       }
       return maxSum;
    }
