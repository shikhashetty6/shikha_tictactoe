package com.boj.step.backtracking;

import java.io.*;

public class P9663 {

    public int[] arr;
    public int n;
    public int count = 0;

    public static void main(String[] args) throws IOException {
        P9663 p9663 = new P9663();
        p9663.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        nQueen(0);
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }

    public void nQueen(int depth) {
        if (depth == n) {
            count++;
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[depth] = i;
            if (possible(depth)) {
                nQueen(depth + 1);
            }
        }

    }

    public boolean possible(int col) {
        for (int i = 0; i < col; i++) {
            // queen의 갈 수 있는 경우의 수인, 행이 같은지, 열이 같은지를 체크
            if (arr[col] == arr[i]) {
                return false;
            }
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}