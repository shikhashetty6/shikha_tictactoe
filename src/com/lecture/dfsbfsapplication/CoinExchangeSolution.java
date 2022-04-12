package com.lecture.dfsbfsapplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CoinExchangeSolution {

    static int n, m, answer=Integer.MAX_VALUE;

    private void dfs(int L, int sum, Integer[] arr) {
        if (sum > m) return;
        if (L >= answer) return;
        if (sum == m) {
            answer = Math.min(answer, L);
        } else{
            for (int i = 0; i < n; i++) {
                dfs(L+1, sum+arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        CoinExchangeSolution coinExchangeSolution = new CoinExchangeSolution();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        m = kb.nextInt();
        coinExchangeSolution.dfs(0, 0, arr);
        System.out.println(answer);
    }
}
