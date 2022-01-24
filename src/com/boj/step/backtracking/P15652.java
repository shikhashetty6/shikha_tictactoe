package com.boj.step.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class P15652 {
    public int[] arr;
    BufferedReader bf;
    BufferedWriter bw;
    int n;
    int m;

    public static void main(String[] args) throws IOException {
        P15652 p15652 = new P15652();
        p15652.solve();
    }

    private void solve() throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
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
        for (int i = 1; i <= n; i++) {
            arr[depth] = i;
            if ((depth == 0) || (arr[depth-1] <= i)) {
                dfs(n, m, depth+1);
            } else {
                continue;
            }
        }
    }
}
