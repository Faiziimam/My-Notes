 static void transpose(int a[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

    static void reverse(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            int start=0,end=a.length-1;
            while(start<end)
            {
                int temp=a[i][start];
                a[i][start]=a[i][end];
                a[i][end]=temp;
                start++;
                end--;
            }
        }
    }
