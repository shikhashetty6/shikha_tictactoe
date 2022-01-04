package com.boj.step.basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());

        BigInteger a = new BigInteger(stringTokenizer.nextToken());
        BigInteger b = new BigInteger(stringTokenizer.nextToken());

        System.out.println(a.add(b));

    }
}
