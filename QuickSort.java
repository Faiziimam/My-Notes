import java.util.Scanner;

public class QuickSort {
    public int partition(int arr[], int low, int high) {
        // 1->2->3->4->5
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    public void quickSort(int[] arr, int low, int high) {
        int pi = partition(arr, low, high);
        if (low < pi - 1) {
            quickSort(arr, low, pi - 1);
        }
        if (pi < high) {
            quickSort(arr, pi, high);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        QuickSort obj = new QuickSort();
        obj.quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
