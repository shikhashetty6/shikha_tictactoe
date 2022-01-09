package com.boj.step.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10870 {

    int previousValue1 = 0;
    int previousValue2 = 1;
    int input;
    int result;

    public static void main(String[] args) throws IOException {
        P10870 p10870 = new P10870();
        p10870.solve();
    }

    private void solve() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        input = Integer.parseInt(bf.readLine());

        if (input == 0) System.out.println(previousValue1);
        else if (input == 1) System.out.println(previousValue2);
        else {
            fibonacci();
            System.out.println(result);
        }
    }

    public void fibonacci() {
        result = previousValue1 + previousValue2;
        previousValue1 = previousValue2;
        previousValue2 = result;
        input--;
        if (input > 1) fibonacci();
    }
}
