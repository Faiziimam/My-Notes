public static int shortestDistance(String[] s,String word1,String word2)
    {
        int i1=-1,i2=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length;i++)
        {
          if(s[i].equals(word1))
          {
              i1=i;
          }   
          if(s[i].equals(word2))
          {
              i2=i;
          }
          if(i1!=-1 && i2!=-1)
          {
              min=Math.min(Math.abs(i1-i2),min);
          }
        }
      return min;
 }
  
