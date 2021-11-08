 public static void removeZero(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i]!=0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
    }
