package com.boj.step.basicmath2;

import java.io.*;

public class P4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer input;
        while ((input = Integer.parseInt(bf.readLine())) != 0) {
            int count = 0;
            boolean[] primeList = makePrime(input * 2);
            for (int i = input+1; i <= input * 2; i++) {
                if (!primeList[i]) {
                    count++;
                }
            }
            bw.write(String.valueOf(count));
            bw.newLine();
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
