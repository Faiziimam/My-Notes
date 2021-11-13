class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String[] str=new String[n];
        for(int i=0;i<n;i++)
        {
          str[i]=String.valueOf(nums[i]);
        }
       Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String a = s1 + s2;
                String b = s2 + s1;

                return b.compareTo(a);
            }
        };
          
        Arrays.sort(str,comp);
        StringBuilder ans=new StringBuilder("");
        for(String s: str)
            ans.append(s);
        
       if(ans.charAt(0) == '0')
            return "0";
        
        return ans.toString();
    }
}
