import java.util.ArrayList;
import java.util.Scanner;
public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(1);
        for(int i=2;i<n;i++){
            arr.add(arr.get(i-2)+ arr.get(i-1));
        }
        System.out.println(arr);
    }
}


// class Solution {
//     public static int fib(int n) {
//         int a = -1, b = 1, c = 0;
//         for (int i = 0; i <= n; i++) {
//             c = a + b;
//             a = b;
//             b = c;
//         }
//         return c;
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         int result = fib(n);
//         System.out.println("Fibonacci number at position " + n + " is: " + result);
//     }
// }
