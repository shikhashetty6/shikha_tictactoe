package com.boj.step.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class ReviewP14888 {

    int count;
    int[] numberArray;
    int[] operationArray = new int[4];
    int maxValue = Integer.MIN_VALUE;
    int minValue = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        ReviewP14888 reviewP14888 = new ReviewP14888();
        reviewP14888.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        count = Integer.parseInt(br.readLine());
        numberArray = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            numberArray[i] = Integer.parseInt(st.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operationArray[i] = Integer.parseInt(st2.nextToken());
        }

        dfs(numberArray[0], 1);

        bw.write(String.valueOf(maxValue));
        bw.newLine();
        bw.write(String.valueOf(minValue));
        bw.flush();
        bw.close();
        br.close();
    }

    private void dfs(int value, int depth) {

        if (depth == count) {
            maxValue = Math.max(maxValue, value);
            minValue = Math.min(minValue, value);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operationArray[i] > 0) {
                operationArray[i]--;
                switch (i) {
                    case 0: dfs(value+numberArray[depth], depth+1); break;
                    case 1: dfs(value-numberArray[depth], depth+1); break;
                    case 2: dfs(value*numberArray[depth], depth+1); break;
                    case 3: dfs(value/numberArray[depth], depth+1); break;
                }
                operationArray[i]++;
            }

        }
    }
}
