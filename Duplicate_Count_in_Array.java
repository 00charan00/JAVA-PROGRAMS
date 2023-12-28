import java.util.*;
public class Duplicate_Count_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        int count=0;
        for(int i=0;i<n;i++){
            int c=sc.nextInt();

            if(a.contains(c)){
                count++;
            }
            a.add(c);
        }
        System.out.println(count);
    }
}
