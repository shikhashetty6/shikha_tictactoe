package com.lecture.array;

import java.util.Scanner;

public class EratosthenesSolution {
    public static void main(String[] args) {
        EratosthenesSolution eratosthenes = new EratosthenesSolution();
        // 에라토스테네스 체는 소수구하는 방법에서는 가장 빠르다.
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(eratosthenes.solution(n));
    }

    private int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];
        for (int i = 2; i <= n; i++) {
            if(ch[i]==0){
                answer++;
                for (int j = i; j <= n; j=j+i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }
}
