package com.boj.step.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class P15651 {

    public int[] arr;
    public boolean[] visit;
    BufferedReader bf;
    BufferedWriter bw;
    int n;
    int m;

    public static void main(String[] args) throws IOException {
        P15651 p15651 = new P15651();
        p15651.solve();
    }

    private void solve() throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        arr = new int[m];
        visit = new boolean[n];
        dfs(n, m, 0);
        bw.flush();
        bw.close();
        bf.close();
    }

    private void dfs(int n, int m, int depth) throws IOException {
        if (depth == m) {
            for (int i : arr) {
                bw.write(i + " ");
            }
            bw.newLine();
            return;
        }
        for (int i = 1; i <= n; i++) {
            arr[depth] = i;
            dfs(n, m, depth+1);
        }
    }
}
