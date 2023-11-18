import java.io.*;
import java.util.*;

public class Solution {

    static private int B;
    static private int H;
    static private boolean flag;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        flag = B > 0 && H > 0;

        if (flag) {
            int area = B * H;
            System.out.println(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        sc.close();
    }
}
