import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean pairSum(int[] a,int key)
    {
        int low=0;
        int high=a.length-1;
        while(low<high)
        {
            if(a[low]+a[high]==key)
            {
                System.out.println(low+" "+high);
                return true;
            }
            else if(a[low]+a[high]>key)
            {
                high--;
            }
            else
                low++;
        }
        return false;
    }
    public static void main (String[] args)

    {  Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        pairSum(a,31);

    }
}
