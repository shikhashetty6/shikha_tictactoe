package com.boj.step.dynamicprogramming;

import java.io.*;
import java.util.StringTokenizer;

public class ReviewP9184 {

    private int[][][] array = new int[101][101][101];

    public static void main(String[] args) throws IOException {
        ReviewP9184 reviewP9184 = new ReviewP9184();
        reviewP9184.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());
            if (a == -1 && b == -1 && c == -1) break;

            bw.write("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0){
            return 1;
        }
        else if (a > 20 || b > 20 || c > 20){
            if (array[20][20][20] == 0) array[20][20][20] = w(20, 20, 20);
            return array[20][20][20];
        } else if (a < b && b < c){
            if (array[a][b][c - 1] == 0) array[a][b][c - 1] = w(a, b, c-1);
            if (array[a][b - 1][c - 1] == 0) array[a][b - 1][c - 1] = w(a, b-1, c-1);
            if (array[a][b - 1][c] == 0) array[a][b - 1][c] = w(a, b-1, c);

            return array[a][b][c - 1] + array[a][b - 1][c - 1] - array[a][b - 1][c];
        }
        else  {
            if (array[a-1][b][c] == 0) array[a-1][b][c] = w(a-1, b, c);
            if (array[a-1][b-1][c] == 0) array[a-1][b-1][c] = w(a-1, b-1, c);
            if (array[a-1][b][c-1] == 0) array[a-1][b][c-1] = w(a-1, b, c-1);
            if (array[a-1][b-1][c-1] == 0) array[a-1][b-1][c-1] = w(a-1, b-1, c-1);

            return array[a-1][b][c] + array[a-1][b-1][c] + array[a-1][b][c-1] - array[a-1][b-1][c-1];
        }
    }
}

