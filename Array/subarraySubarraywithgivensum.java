public class Leetcode {
    public ArrayList<Integer> subarraySum(int[] arr,int sum)
    {
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        int currSum=arr[0];
        int start=0;
        boolean flag=false;
        for(int i=1;i<=n;i++)
        {
            while(currSum>sum && start<i-1){
                currSum=currSum-arr[start];
                start++;
            }
            if(currSum==sum)
            {
                int p=i-1;
                res.add(start+1);
                res.add(p+1);
                flag=true;
                break;
            }
            
            if(i<n)
            {
                currSum+=arr[i];
            }
        }
        if(!flag)
        {
            res.add(-1);
        }
        return res;
    }
}
