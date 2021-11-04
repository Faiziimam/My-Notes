/*  
 For this we have used Boyer-Moore Majority Voting Algorithm which is very optimal for finding majority Elements.
*/




import java.util.*;
public class Main {
    public static void majorityElement(int[] nums) {
    int el1=0,el2=0,c1=0,c2=0;
    for(int n:nums)
    {
        if(n==el1)
        {
            c1++;
        }
        else if(n==el2)
        {
            c2++;
        }
        else if(c1==0)
        {
            el1=n;
            c1++;
        }
        else if(c2==0)
        {
            el2=n;
            c2++;
        }
        else
        {
            c1--;
            c2--;
        }
    }
    c1=0;c2=0;
    for(int n:nums)
    {
        if(n==el1)
        {
            c1++;
        }
        else if(n==el2)
        {
            c2++;
        }
    }
    List<Integer> res=new ArrayList<>();
    if(c1>nums.length/3)
    {
        System.out.print(el1 +" ");
    }
    if(c2>nums.length/3)
    {
        System.out.print(el2);
    }
     if(c1<nums.length/3 && c2<nums.length/3)
    {
        System.out.println("No Majority Elements");
    }
}
    public static void main (String args[]) {
    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        majorityElement(a);
    }
}
