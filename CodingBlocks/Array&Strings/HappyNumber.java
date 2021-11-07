class Solution {
    
    public int update(int n)
    {
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        return sum;
    }
    
    public boolean check(Set<Integer> set, int n)
    {
        if(n==1)
            return true;
        if(set.contains(n))
            return false;
        
        set.add(n);
        n=update(n);
        return check(set,n);
    }
    
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        return check(set,n);
    }
}
