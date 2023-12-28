import java.util.Scanner;

public class Odd_Number_in_Range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int end=sc.nextInt();
        int i=0;
        while(i<=end){
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i++;
        }
    }

}
