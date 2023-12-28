import java.util.Scanner;
class Factorial {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sol=factorial(n);
        System.out.println(sol);
    }
    static int factorial(int n)
    {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}
