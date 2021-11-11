class Solution {
    public int[] sumZero(int n) {
       List<Integer> res=new ArrayList<>();
        int n1=(int) Math.floor(n/2.0);
        for(int i=1;i<=n1;i++)
        {
            res.add(i);
            res.add(-1*i);
        }
        if(n%2==1)
            res.add(0);
        
      int[] a=new int[n];
        for(int i=0;i<res.size();i++)
        {
            a[i]=res.get(i);
        }
        return a;
    }
}
