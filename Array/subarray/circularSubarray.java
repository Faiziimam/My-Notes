package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static  int kadane(int a[])
{
    int maxSum=Integer.MIN_VALUE;
    int currSum=0;
    for(int i=0;i<a.length;i++)
    {
        currSum+=a[i];
        if(currSum<0)
        {
            currSum=0;
        }
        maxSum=Math.max(maxSum,currSum);
    }
    return maxSum;
  }
    public static void main (String[] args)

    {  Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        int wrapSum;
        int nonWrap=kadane(a);
        int totalsum=0;
        for(int i=0;i<a.length;i++)
        {
            totalsum+=a[i];
            a[i]=-a[i];
        }
        wrapSum=totalsum+kadane(a);
        System.out.println(Math.max(wrapSum,nonWrap));

    }
}
