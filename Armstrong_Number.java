import java.util.Scanner;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    private static boolean isArmstrongNumber(int num) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = num;
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }
        originalNumber = num;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }
        return result == num;
    }
}