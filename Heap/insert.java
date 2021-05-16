public class Heap {
    private int[] item=new int[10];
    private int size;

    public void insert(int data)
    {
        if(size==item.length)
        {
            throw new IllegalStateException();
        }
        item[size++]=data;
        var index=size-1;
        var parentIndex=(index-1)/2;

        while(index>0 && item[index]>item[parentIndex])
        {
            swap(index,parentIndex);
            index=(index-1)/2;
        }
    }

    private void swap(int first, int second) {
        var temp=item[first];
        item[first]=item[second];
        item[second]=temp;
    }


    public static void main(String[] args)
    {
         Heap heap=new Main();
         heap.insert(10);
         heap.insert(5);
         heap.insert(17);
        System.out.println("Done");


    }
}
