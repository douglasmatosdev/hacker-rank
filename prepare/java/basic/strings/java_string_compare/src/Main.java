// https://www.hackerrank.com/challenges/java-string-compare

import java.util.Scanner;

public class Main {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        // array size
        int arraySize = s.length() - (k - 1);
        String[] list = new String[arraySize];

        // Create chunks from string split with "k" size
        for (int i = 0; i < s.length(); i++) {
            int range = i + k;
            if (range <= s.length()) {
                list[i] = s.substring(i, range);
            }
        }

        // Simple Sort
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i].compareTo(list[j]) <= 0) { // compare UTF code for each character
                    String temp;
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        smallest = list[0];
        largest = list[list.length - 1];

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}