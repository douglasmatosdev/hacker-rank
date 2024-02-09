// https://www.hackerrank.com/challenges/pattern-syntax-checker
package org.java_spring_tokens;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void solution() {
//        String[] patternsMock = {"([A-Z])(.+)", "[AZ[a-z](a-z)", "batcatpat(nat"};
        String[] patternsMock = {"([a]+)(.+)", "[.]+", "[.]*", "[ ]*", "[AAAAAAAAAAAAAAAAAAAAAAAA]*"};
        int testCases = patternsMock.length;

        String message = "";
        while (testCases > 0) {
            String pattern = patternsMock[Math.abs(testCases - patternsMock.length)];
            try {
                Pattern patt = Pattern.compile(pattern);

                if (patt != null) {
                    message += ",Valid";
                } else {
                    message += ",Invalid";
                }
            } catch (Exception e) {
                message += ",Invalid";
            }
            testCases--;
        }
        for (String m : message.split(",")) {
            if (m.length() > 0) {
                System.out.println(m);
            }
        }
    }

    public static void main(String[] args) {
        solution();
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//
//        String message = "";
//        while (testCases > 0) {
//            String pattern = in.nextLine();
//            try {
//                 Pattern patt = Pattern.compile(pattern);
//
//                if (patt != null) {
//                    message += ",Valid";
//                } else {
//                    message += ",Invalid";
//                }
//            } catch (Exception e) {
//                message += ",Invalid";
//            }
//            testCases--;
//        }
//        for (String m : message.split(",")) {
//            if (m.length() > 0) {
//                System.out.println(m);
//            }
//        }
//        in.close();
    }
}