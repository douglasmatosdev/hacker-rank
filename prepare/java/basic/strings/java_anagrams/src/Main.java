// https://www.hackerrank.com/challenges/java-anagrams/
import java.util.Scanner;

public class Main {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int[][] matrixA = new int[a.length()][2];
        int[][] matrixB = new int[b.length()][2];

        for (int i = 0; i < a.length(); i++) {
            boolean exists = false;
            matrixA[i][1] += 1;

            for (int j = 0; j < matrixA.length; j++) {
                if (matrixA[j][0] == a.charAt(i)) {
                    matrixA[j][1] += 1;
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                matrixA[i][0] = a.toLowerCase().charAt(i);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            boolean exists = false;
            matrixB[i][1] += 1;

            for (int j = 0; j < matrixB.length; j++) {
                if (matrixB[j][0] == b.charAt(i)) {
                    matrixB[j][1] += 1;
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                matrixB[i][0] = b.toLowerCase().charAt(i);
            }
        }

        // sort matrixA
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if (String.valueOf(matrixA[i][0]).compareTo(String.valueOf(matrixA[j][0])) <= 0) { // compare UTF code for each character
                    int[] temp;
                    temp = matrixA[i];
                    matrixA[i] = matrixA[j];
                    matrixA[j] = temp;
                }
            }
        }
        // sort matrixB
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB.length; j++) {
                if (String.valueOf(matrixB[i][0]).compareTo(String.valueOf(matrixB[j][0])) <= 0) { // compare UTF code for each character
                    int[] temp;
                    temp = matrixB[i];
                    matrixB[i] = matrixB[j];
                    matrixB[j] = temp;
                }
            }
        }

        boolean r = false;
        for (int i = 0; i < matrixA.length; i++) {
            if (matrixA[i][1] == matrixB[i][1] && matrixA[i][0] == matrixB[i][0]) {
                r = true;
            } else {
                return false;
            }
        }
        return r;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
//        String a = "anagramm";
//        String b = "marganaa";
//        String a = "anagram";
//        String b = "margana";
//        String a = "Hello";
//        String b = "hello";
//        String a = "abcde";
//        String b = "xyzwf";
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}