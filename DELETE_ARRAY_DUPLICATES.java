import java.util.HashSet;
import java.util.Scanner;
public class DELETE_ARRAY_DUPLICATES {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> newarr=new HashSet<>();
        for(int i=0;i<n;i++){
            newarr.add(arr[i]);
        }
        System.out.println(newarr);
    }
}
