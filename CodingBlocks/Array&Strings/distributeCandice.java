 public static int distributeCandice(int[] a)
  {
      int n=a.length;
      int min=0;
      Set<Integer> set = new HashSet<>();
      for(int i=0;i<n;i++)
      {
          set.add(a[i]);
      }
      min= Math.min(set.size(), n);
      return  min;
  }
