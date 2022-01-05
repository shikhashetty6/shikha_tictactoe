package com.boj.step.basicmath2;

import java.io.*;

public class P9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer inputCount = Integer.parseInt(bf.readLine());
        boolean[] primeList = makePrime();

        for (int i = 0; i < inputCount; i++) {
            Integer inputValue = Integer.parseInt(bf.readLine());

            int firstValue = inputValue / 2;
            int secondValue = inputValue / 2;

            while (true) {
                if (!primeList[firstValue] && !primeList[secondValue]) {
                    bw.write(firstValue + " " + secondValue);
                    bw.newLine();
                    break;}
                firstValue--;
                secondValue++;
            }
        }

        bw.flush();
        bw.close();
        bf.close();
    }



    private static boolean[] makePrime() {
        boolean[] primeList = new boolean[10001];
        primeList[0] = primeList[1] = true;
        //에라토스테네스의 체 : k=2 부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다
        for(int i = 2; i <= Math.sqrt(primeList.length); i++) {
            if(primeList[i]) continue;
            for(int j = i * i; j < primeList.length; j=j+i) primeList[j] = true;
        }
        return primeList;
    }
}
