// GCD 
    /* 
     Euclid division is one of the oldest algo to fing GCD 
     if a>b a=a-b 
     else b=b-a
    */
    public int gcd(int a,int b)
    {
      int divisor=b;
      int dividend=a;
      while(divisor!=0)
      {
        int rem=dividend % divisor;
        dividend=divisor;
        divisor=rem;
      }
//  2nd
    public int gcd(int a,int b)
    {
      // a==dividend && b==Divisor
      if(b==0)
          return a;
          return gcd(b,a%b);
      
    }
// #3rd
 public int gcd(int a,int b)
    {
      // a==dividend && b==Divisor
      if(a==0)
        return b;
      if(b==0)
        return a;
      if(a>b)
        return gcd(a-b, b);
      
        return gcd(a, b-a);
      
    }
