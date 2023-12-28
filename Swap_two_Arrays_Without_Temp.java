import java.util.Arrays;
import java.util.Scanner;

public class Swap_two_Arrays_Without_Temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        for(i=0;i<n;i++){
            b[i]= sc.nextInt();
        }
        for(i=0;i<n;i++){
            a[i] = a[i] + b[i];
            b[i] = a[i] - b[i];
            a[i] = a[i] - b[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
