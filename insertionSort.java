public static  void insertionSort(int a[])
{
    int j=0;
    for(int i=1;i<a.length;i++)
    {
        int key=a[i];
        j=i-1;
        while(j>=0 && a[j]>key)
        {
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=key;
    }
}
