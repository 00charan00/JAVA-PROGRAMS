import java.util.Scanner;

public class LCM {
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=gcd(x,y);
        int lcm=(x*y)/a;
        System.out.println(lcm);
    }

}
