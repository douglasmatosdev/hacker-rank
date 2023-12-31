import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            int n = in.nextInt();

            double result = a;

            for (int j = 0; j < n; j++) { // "n" times
                double z = Math.pow(2, j);
                result += z * b;
                System.out.printf("%.0f ", result);
            }
            System.out.println();

        }

        in.close();
    }
}