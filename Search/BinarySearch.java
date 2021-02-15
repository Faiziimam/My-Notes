package Search;

import java.util.Scanner;

public class BinarySearch {
    int binarySearch(int a[], int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - 1) / 2;
            if (a[mid] == key)
                return mid;

            if (a[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        BinarySearch obj = new BinarySearch();
        int result = obj.binarySearch(a, 0, a.length, 2);
        
        if (result == -1)
            System.out.println("Element is not there :-(");

        else
            System.out.println("Element is present at index " + result);
    }
}