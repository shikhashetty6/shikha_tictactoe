package com.boj.step.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1003 {
    Integer[][] memoArray = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        P1003 p1003 = new P1003();
        p1003.solve();
    }

    private void solve() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(bf.readLine());

        memoArray[0][0] = 1;
        memoArray[0][1] = 0;
        memoArray[1][0] = 0;
        memoArray[1][1] = 1;

        for (int i = 0; i < inputCount; i++) {
            int inputValue = Integer.parseInt(bf.readLine());
            fibonacci(inputValue);
            System.out.println(memoArray[inputValue][0] + " " + memoArray[inputValue][1]);
        }
    }

    Integer[] fibonacci(int n) {
        if (memoArray[n][0] == null || memoArray[n][1] == null) {
            memoArray[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
            memoArray[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
        }
        return memoArray[n];
    }
}

