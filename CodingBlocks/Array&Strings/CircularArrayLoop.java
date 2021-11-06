import java.util.*;

public class Main {
    public int nextElement(List<Integer> arr,int i)
{
    return (i+arr.get(i)+arr.size())%arr.size();
}
    public boolean circularLoopArray(List<Integer> arr)
    {
        int n=arr.size();
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)==0)
            {
                continue;
            }
            int slow=i,fast=i;
            while(arr.get(slow) * arr.get(nextElement(arr, slow)) >0
                    && arr.get(fast) * arr.get(nextElement(arr,fast))>0
                    && arr.get(fast) * arr.get(nextElement(arr,nextElement(arr,fast)))>0 )
            {
                slow=nextElement(arr,slow);
                fast=nextElement(arr,nextElement(arr,fast));

                if(slow==fast)
                {
                    if(slow==nextElement(arr,slow))
                    {
                        break;
                    }
                    return true;
                }
            }
            slow=i;
            int val=arr.get(slow);
            while(val*arr.get(slow)>0)
            {
                int x=slow;
                slow=nextElement(arr,slow);
                arr.set(x, 0);
            }
        }
        return false;
    }
    public static void main(String[] args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         List<Integer> arr=new ArrayList<>();
          for(int i=0;i<n;i++)
          {
              arr.add(s.nextInt());
          }
        Main obj=new Main();
        if(obj.circularLoopArray(arr))
        {
            System.out.println(1);
        }
        else
            System.out.println(0);
    }
}
