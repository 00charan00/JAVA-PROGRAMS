import java.util.Scanner;
public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,x,y,i,j,k;
        a=sc.nextInt();
        b=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        if(b!=x){
            System.out.println("Cannot Multiply");
            return;
        }
        int[][] m1=new int[a][b];
        int[][] m2=new int[x][y];
        int[][] res=new int[a][y];
        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<x;i++){
            for(j=0;j<y;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<a;i++){
            for(j=0;j<y;j++){
                res[i][j]=0;
                for(k=0;k<y;k++){
                    res[i][j]+=((m1[i][k])*(m2[k][j]));
                }
            }
        }
        for(i=0;i<a;i++){
            for(j=0;j<y;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
