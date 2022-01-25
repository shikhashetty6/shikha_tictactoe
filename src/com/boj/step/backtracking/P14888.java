package com.boj.step.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class P14888 {

    int numberCount;
    int[] numberArray;
    int[] operationArray = new int[4];
    int maxValue = Integer.MIN_VALUE;
    int minValue = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        P14888 p14888 = new P14888();
        p14888.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        numberCount = Integer.parseInt(br.readLine());

        numberArray = new int[numberCount];
        StringTokenizer numberSt = new StringTokenizer(br.readLine());
        for (int i = 0; i < numberCount; i++) {
            numberArray[i] = Integer.parseInt(numberSt.nextToken());
        }
        StringTokenizer operatorSt = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operationArray[i] = Integer.parseInt(operatorSt.nextToken());
        }

        dfs(numberArray[0], 1);

        bw.write(String.valueOf(maxValue));
        bw.newLine();
        bw.write(String.valueOf(minValue));
        bw.flush();
        bw.close();
        br.close();
    }

    private void dfs(int number, int depth) {
        if (depth == numberCount) {
            maxValue = Math.max(maxValue, number);
            minValue = Math.min(minValue, number);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operationArray[i] > 0) {
                operationArray[i]--;
                switch (i) {
                    case 0:	dfs(number + numberArray[depth], depth + 1);	break;
                    case 1:	dfs(number - numberArray[depth], depth + 1);	break;
                    case 2:	dfs(number * numberArray[depth], depth + 1);	break;
                    case 3:	dfs(number / numberArray[depth], depth + 1);	break;
                }
                operationArray[i]++;
            }
        }
    }
}
