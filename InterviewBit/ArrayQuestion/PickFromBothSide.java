public void solve(int[] a,int b)
{
  int res=0,int sum=0;
  int n=a.length;
   
  for(int i=0;i<b;i++)
    res+=a[i];
   
   //To avoid data loss
   sum=res;
   
   for(int i=0;i<b;i++)
   {
     sum-=a[b-1-i];
     sum+=a[n-1-i];
     
     res=Math.max(res,sum);
   }
   return res;
}


//Explanation
/*
Let me try to explain the logic with an example for better clarity.


Consider the input as arr{ 5, -2, 3, 1, 2 } and B=3


Step 1. Calculate the sum of 3 values from the starting of the arr vector and store it in res. This is done in the first for loop.

res = 5 + (-2) + 3 = 6


Step 2. Copy the value of res to sum in order to avoid data loss.

sum = 6;


Step 3. In the second for loop, we subtract from sum the value at the index arr[B-1-i] and update the sum value. At the same time you add the value to sum from the index arr[n-1-i].


sum = sum - arr[3-1-i];

sum = sum + arr[5-1-i]; // since int n = arr.size();


when i =0:

sum = sum - arr[2]; // sum = 6 - 3 = 3;

Here we intend to subtract the last value (arr[2]) from sum which was considered in the first for loop.


sum = sum + arr[4]; //sum = 3 + 2 = 5

Here we are adding the first value from the right side of the array (arr[4]) as a replacement to the value subtracted in the previous step.


By the end of this step, we will be having the sum with B-1 values from left side of array and 1 value from the right side.


Also there is a comparison in the for loop to update the res value by comparing the res and sum value using the max function.

res = max(res, sum);

res = max(6,5) // res will retain the value of 6 as it is the max value.


when i =1:

the second for loop calculate the sum with B-2 values from left side of array and 2 value from the right side.

sum = sum - arr[1]; // sum = 5 - (-2) = 7;

sum = sum + arr[3]; //sum = 7 + 1 = 8

res = max(6,8) // res will get updated to 8 as it is the max value.


when i =2:

the second for loop calculate the sum with B-2 values from left side of array and 2 value from the right side.

sum = sum - arr[0]; // sum = 8 - 5= 3;

sum = sum + arr[2]; //sum = 3 + 3 = 6

res = max(8,6) // res will retain the value as 8 as it is the max value.


So the final result will be 8 which is the sum of (5+1+2).
*/
