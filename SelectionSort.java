import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        // {5,4,3,2,1}--> 5-->{4,3,2,1}-->swap 5 with 1
        int min;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int i : a)
            System.out.print(i + " ");
    }
}
