import java.util.*;
class Main {
    static void reverse(int[] a,int s,int e)
    {
        while(s<=e)
        {
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
	public static void main(String args[]) {
		// Your code goes here
//     Logic 
//     Sort first half i.e 0 - arr.len-k-1
//     sort second half i.e arr.length-k - arr.length-1;
//     sort entire array
        int arr[]={180,165,170,12,45};
        int k=-1;
        k=k%10;
        if(k<0)
            k+=arr.length;
        // For 1st half
        reverse(arr,0,arr.length-k-1);
        // 2nd half
        reverse(arr,arr.length-k,arr.length-1);
        // 3rd half
        reverse(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    
	}
	
}
