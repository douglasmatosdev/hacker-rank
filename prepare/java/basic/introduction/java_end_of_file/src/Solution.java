import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int line = 1;
        while(sc.hasNext()) {
            String n = sc.nextLine();
            System.out.printf("%d %s\n", line, n);
            line++;
        }

        sc.close();
    }
}