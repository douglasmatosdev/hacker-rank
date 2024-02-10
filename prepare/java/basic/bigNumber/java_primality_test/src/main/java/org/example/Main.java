// https://www.hackerrank.com/challenges/java-primality-test
package org.example;

import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        BigInteger bigInteger = new BigInteger(n);
        boolean isPrime = bigInteger.isProbablePrime(10); // bigInteger.probablePrime(bigInteger.bitLength(), new Random());
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        bufferedReader.close();
//
//        String[] suiteTests = {
//                /* 0 */"13", // prime
//                /* 1 */"1", // not prime
//                /* 2 */"2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251983", // prime
//                /* 3 */"2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251982", // not prime
//                /* 4 */"34263233064835421125264776608163440537925705997962346596977803462033841059628723", // prime
//                /* 5 */"669483106578092405936560831017556154622901950048903016651285", // not prime
//                /* 6 */"4901971054862853523", // not prime
//                /* 7 */"8306193547961364862906443093104785840173353478461", // not prime
//                /* 8 */"9547848065153773335707495885453566120069130270246768806790708393909999", // prime
//                /* 9 */"282755483533707287054752184321121345766861480697448703443857012153264407439766013042402571", // prime
//                /* 10 */"2", // prime
//                /* 11 */"6513516734600035718300327211250928237178281758494417357560086828416863929270451437126021949850746381" // prime
//        };
//        for (int i = 0; i < suiteTests.length; i++) {
//            String n = suiteTests[i];
//            BigInteger bigInteger = new BigInteger(n);
//            boolean isPrime = bigInteger.isProbablePrime(10); // bigInteger.probablePrime(bigInteger.bitLength(), new Random());
//            if (isPrime) {
//                System.out.println("prime");
//             } else {
//            System.out.println("not prime");
//        }
//        }

    }
}