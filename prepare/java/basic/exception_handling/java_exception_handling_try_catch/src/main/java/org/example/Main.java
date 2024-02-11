package org.example;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;

        try {
            x = sc.nextInt();
            y = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
            return;
        } finally {
            sc.close();
        }

        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            if (y == 0) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
            return;
        } finally {
            sc.close();
        }

        sc.close();
    }
}