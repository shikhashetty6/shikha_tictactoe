package com.boj.step.numbertheoryandcombinationtheory;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P11051 {

    private BigInteger[] array;
    private BigInteger bigInteger2 = new BigInteger("2");
    private BigInteger bigInteger1 = new BigInteger("1");

    public static void main(String[] args) throws IOException {
        P11051 p11051 = new P11051();
        p11051.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        array = new BigInteger[n+1];

        BigInteger result = factorial(n).divide(factorial(k).multiply(factorial(n - k))).remainder(new BigInteger("10007"));

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();

    }

    private BigInteger factorial(int i) {
        if (i<2) {
            return bigInteger1;
        }
        if (array[i] == null) {
            BigInteger bigInteger = new BigInteger(String.valueOf(i));
            array[i] = bigInteger.multiply(factorial(i - 1));
        }
        return array[i];
    }
}
