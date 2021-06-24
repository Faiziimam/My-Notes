  static ArrayList<Integer> subarraySum(int[] a, int n, int sum) 
    {
       ArrayList<Integer> value=new ArrayList<>();
       int currSum=a[0];
       int start=0;
       boolean flag=false;
       for(int i=1;i<=n;i++)
       {
           while(currSum>sum && start<i-1)
           {
               currSum=currSum-a[start];
               start++;
           }
           if(currSum==sum)
           {
               int p=i-1;
               value.add(start+1);
               value.add(p+1);
               flag=true;
               break;
          }
      if(i<n){ currSum+=a[i];}
   }
         if(flag==false)
        {
            value.add(-1);
        }
       return value;
    }
