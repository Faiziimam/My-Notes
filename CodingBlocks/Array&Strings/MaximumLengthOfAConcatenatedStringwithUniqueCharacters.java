
// A very simple problem which is done with the help of Recursion 
class Solution {
    public int maxLength(List<String> arr,int i, String ans)
    {
        if(i==arr.size())
        {
            int[] freq=new int[26];
            for(int k=0;k<ans.length();k++)
            {
                if(freq[ans.charAt(k)-'a']==1)
                {
                    return 0;
                }
                freq[ans.charAt(k)-'a']++;
            }
            return ans.length();
        }
        
        int include=Integer.MIN_VALUE,exclude=include;
        if(ans.length()+arr.get(i).length()<=26)
        {
            include=maxLength(arr,i+1,ans+arr.get(i));
        }
        exclude=maxLength(arr,i+1,ans);
        return Math.max(include,exclude);
    }
    public int maxLength(List<String> arr) {
        return maxLength(arr,0,"");
    }
}
