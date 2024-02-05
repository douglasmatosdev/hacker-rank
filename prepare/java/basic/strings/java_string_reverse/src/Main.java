// https://www.hackerrank.com/challenges/java-string-reverse
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        String B = "";

        // Reverse string
        for (int i = A.length() - 1; i >= 0; i--) {
            B += A.charAt(i);
        }

        /* Enter your code here. Print output to STDOUT. */
        if (A.equals(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}