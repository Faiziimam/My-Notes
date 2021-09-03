import java.util.*;

public class Main {
    private int[] items=new int[5];
    private int count;
    public void add(int item)
    {
        if(isFull())
            throw new IllegalArgumentException();

        int i=shifItemtoInsert(item);
        items[i+1]=item;
        count++;
    }
    public int shifItemtoInsert(int item)
    {
        int i;
        for(i=count-1;i>=0;i--)
        {
            if(items[i]>item)
            {
                items[i+1]=items[i];
            }
            else
                break;
        }
        return i+1;
    }
    public int remove()
    {
        if(isEmpty())
        {
            throw new IllegalArgumentException();
        }
        return items[--count];
    }
    public boolean isFull() { return count==items.length; }
    public boolean isEmpty(){return count==0;}
    @Override
    public String toString()
    {
        return Arrays.toString(items);
    }
        public static void main (String[]args)
        {
         Main obj=new Main();
         obj.add(3);
         obj.add(2);
         obj.add(1);
            System.out.println(obj);
            while(!obj.isEmpty())
            {
                System.out.println(obj.remove());
            }
        }
}
