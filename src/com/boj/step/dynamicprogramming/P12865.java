package com.boj.step.dynamicprogramming;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P12865 {

    int[][] memo;
    HashMap<Integer, Integer> hashMap;
    int n;
    int k;

    public static void main(String[] args) throws IOException {
        P12865 p12865 = new P12865();
        p12865.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            hashMap.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

       // dp(1);

    }

//    private void dp(int depth) {
//        if (depth == 4) {
//            return;
//        }
//
//        for (int i = 0; i < n; i++) {
//            memo[] dp();
//        }
//
//        for (Integer integer : hashMap.keySet()) {
//            memo[][] = hashMap.get(integer) +
//        }
//    }
}
