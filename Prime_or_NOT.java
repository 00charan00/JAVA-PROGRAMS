import java.util.Scanner;

public class Prime_or_NOT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int squareroot= (int)Math.sqrt(number);
        for(int i=2;i<=squareroot;i++){
            if(number%i==0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
