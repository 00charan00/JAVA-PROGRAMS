import java.util.Scanner;
public class Words_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        int wordCount = countWords(inputString);
        System.out.println("Total words in the string: " + wordCount);
        sc.close();
    }
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");
        return words.length;
    }
}
