// https://www.hackerrank.com/challenges/java-biginteger
package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
//    public static void test() {
//        String[][] suiteTests = {
//                {"1234", "20" },
//                {"123456789123456789", "100000000000000000" },
//        };
//
//        for (String[] st : suiteTests) {
//            String a = st[0];
//            String b = st[1];
//
//            BigInteger iA = new BigInteger(a);
//            BigInteger iB = new BigInteger(b);
//
//
//            System.out.println(iA.add(iB));
//            System.out.println(iA.multiply(iB));
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        BigInteger iA = new BigInteger(a);
        BigInteger iB = new BigInteger(b);


        System.out.println(iA.add(iB));
        System.out.println(iA.multiply(iB));
        sc.close();
    }
}