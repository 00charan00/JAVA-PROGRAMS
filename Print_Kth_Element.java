import java.util.*;
public class Print_Kth_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k,i,s;
        s=sc.nextInt();
        int[] arr=new int[s];
        for(i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        if(k>=0&&k<=s){
            System.out.println(arr[k-1]);
        }
        else{
            System.out.println("OUT OF BOUND");
        }
    }
}