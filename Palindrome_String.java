import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();

    int f=0;
    int l=str.length()-1;
        while(f<=l){
        if(str.charAt(f++)!=str.charAt(l--)){
            System.out.println("Not Palindrome");
            return;
        }
    }
        System.out.println("Palindrome");

}
}
