class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int prod[]=new int[n];
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++)
        {
            left[i]=nums[i-1]*left[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            right[i]=nums[i+1]*right[i+1];
        }
    
        for(int i=0;i<n;i++)
        {
            prod[i]=left[i]*right[i];
        }
        return prod;
    }
}
