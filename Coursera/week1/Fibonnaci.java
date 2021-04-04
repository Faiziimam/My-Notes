import java.util.Scanner;

public class Fibonnaci {
    /*
     * fibonacci algo recursive if(n<1) return n; return fibo(n-1)+fibo(n-2);
     */
    static boolean perfectSquare(int n) {
        int s = (int) Math.sqrt(n);
        return (s * s == n);

    }

    static boolean fibo(int n) {
        return perfectSquare(5 * n * n + 4) || perfectSquare(5 * n * n - 4);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibo(n) ? n + " is a Fibonacci Number" : n + " is a not Fibonacci Number");
    }
}
