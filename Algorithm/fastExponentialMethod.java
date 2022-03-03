  public static long fastExponentialMethod(long base,long exp)
  {
    long res=1;
    while(exp>0)
    {
      if(exp%2==1)
      {
        res=(res*base)%1000000007;
      }
      base=(base*base)%1000000007;
      exp/=2;
    }
    return res%1000000007;
  }
