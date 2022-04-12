package com.lecture.dfsbfsapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinExchange {

    static int[] coinArray;
    static int n,m;
    static int answer=Integer.MAX_VALUE;

    private void dfs(int L, int sum) {
        if (sum >= m) {
            if (sum == m) {
                answer = Math.min(answer, L);
            }
            return;
        }
        else{
            for (int i = 0; i < n; i++) {
                dfs(L+1,sum+coinArray[i]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        CoinExchange coinExchange = new CoinExchange();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        coinArray = new int[n];
        for (int i = 0; i < n; i++) {
            coinArray[i] = Integer.parseInt(st.nextToken());
        }
        m = Integer.parseInt(br.readLine());
        coinExchange.dfs(0, 0);
        System.out.println(answer);
    }

}
