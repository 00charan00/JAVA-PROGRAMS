import java.util.Scanner;
public class Odd_and_Even_in_ARRAY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int odd=0;
        int even=0;
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
