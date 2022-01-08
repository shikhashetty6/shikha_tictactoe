package com.boj.step.basicmath2;

import java.io.*;
import java.util.StringTokenizer;

public class P1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());

        Integer inputA = Integer.parseInt(stringTokenizer.nextToken());
        Integer inputB = Integer.parseInt(stringTokenizer.nextToken());

        boolean[] primeList = makePrime(inputB);

        for (int i = inputA; i <= inputB; i++) {
            if (!primeList[i]) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        bf.close();
    }

    private static boolean[] makePrime(int number) {
        boolean[] primeList = new boolean[number+1];
        primeList[0] = primeList[1] = true;
        //에라토스테네스의 체 : k=2 부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(primeList[i]) {
                continue;
            }
            for(int j = i * i; j < primeList.length; j=j+i) {
                primeList[j] = true;
            }
        }
        return primeList;
    }
}
