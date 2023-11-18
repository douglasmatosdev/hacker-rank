import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        boolean isOdd = N % 2 != 0 ? true : false;

        if (isOdd) {
            System.out.println("Weird");
        } else if (!isOdd && N > 2 && N < 5) {
            System.out.println("Not Weird");
        } else if (!isOdd && N > 6 && N < 20) {
            System.out.println("Weird");
        } else if (!isOdd && N > 20) {
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}