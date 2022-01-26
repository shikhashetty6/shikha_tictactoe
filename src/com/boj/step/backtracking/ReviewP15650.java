package com.boj.step.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class ReviewP15650 {

    boolean[] visit;
    int[] array;
    BufferedReader br;
    BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        ReviewP15650 reviewP15650 = new ReviewP15650();
        reviewP15650.solve();
    }

    private void solve() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        array = new int[m];
        visit = new boolean[n];
        
        dfs(n, m, 0);
        bw.flush();
        bw.close();
        br.close();
    }

    private void dfs(int n, int m, int depth) throws IOException {

        if (depth == m) {
            for (int i = 0; i < array.length; i++) {
                bw.write(array[i]+" ");
            }
            bw.newLine();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                if ((depth != 0) && (array[depth - 1] >= i+1)) {
                    continue;
                }
                visit[i] = true;
                array[depth] = i+1;
                dfs(n, m, depth+1);
                visit[i] = false;
            }
        }
    }
}