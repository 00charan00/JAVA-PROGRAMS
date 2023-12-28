import java.util.*;
public class Sum_of_Matrix {
    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();

        // Prompt the user to enter elements for the first matrix
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        // Prompt the user to enter elements for the second matrix
        int b[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        // Create another matrix to store the sum of two matrices
        int c[][] = new int[n][n];  // n rows and n columns

        // Adding and printing the addition of 2 matrices
        System.out.println("Matrix Addition Result:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println(); // new line
        }

        // Close the Scanner
        scanner.close();
    }

}
