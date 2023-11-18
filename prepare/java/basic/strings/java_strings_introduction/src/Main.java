// https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String captalize(String text) {
        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }

    private static String alphabetically(String a, String b) {
        String result;
        char charA = a.charAt(0);
        char charB = b.charAt(0);
        char[] chars = {charA, charB};
        Arrays.sort(chars);
        String sorted = new String(chars);

        if (sorted.charAt(0) == charA) {
            result = "No";
        } else {
            result = "Yes";
        }

        return  result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        System.out.println(alphabetically(A, B));
        System.out.printf("%s %s", captalize(A), captalize(B));
    }
}