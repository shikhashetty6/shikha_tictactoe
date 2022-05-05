package com.lecture.review.R0503;

import java.util.Scanner;

public class CoinExchange0503 {

    private static int n, m, answer = Integer.MAX_VALUE;
    private static int[] coinType;

    private void dfs(int L, int sum) {
        if(sum > m) return;
        if(L >= answer) return;
        if(sum == m) {
            answer = Math.min(answer, L);
        } else{
            for (int i = 0; i < n; i++) {
                dfs(L+1, sum+coinType[i]);
            }
        }
    }

    public static void main(String[] args) {
        CoinExchange0503 coinExchange0503 = new CoinExchange0503();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        coinType = new int[n];
        for (int i = 0; i < n; i++) {
            coinType[i] = kb.nextInt();
        }
        m = kb.nextInt();
        coinExchange0503.dfs(0, 0);
        System.out.println(answer);
    }

}
