public class Prime_numbers_in_given_range {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            int j;
            int flag = 0;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
