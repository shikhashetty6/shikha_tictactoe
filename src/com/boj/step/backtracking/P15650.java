package com.boj.step.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class P15650 {
    public int[] arr;
    BufferedReader bf;
    BufferedWriter bw;
    int n;
    int m;

    public static void main(String[] args) throws IOException {
        P15650 p15650 = new P15650();
        p15650.solve();
    }

    private void solve() throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        arr = new int[m];
        dfs(1, 0);
        bw.flush();
        bw.close();
        bf.close();
    }
    private void dfs(int at, int depth) throws IOException {
        if (depth == m) {
            for (int i : arr) {
                bw.write(i + " ");
            }
            bw.newLine();
            return;
        }
        for (int i = at; i <= n; i++) {
            arr[depth] = i;
            dfs(i+1, depth+1);
        }
    }
}

