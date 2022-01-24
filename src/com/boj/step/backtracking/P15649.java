package com.boj.step.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class P15649 {

    public int[] arr;
    public boolean[] visit;
    BufferedReader bf;
    BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        P15649 p15649 = new P15649();
        p15649.solve();
    }

    private void solve() throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        visit = new boolean[n];
        arr = new int[m];
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
        for (int i = 0; i < n; i++) {
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth+1);
                visit[i] = false;
            }
        }
    }
}
