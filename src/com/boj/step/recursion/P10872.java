package com.boj.step.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10872 {

    public static void main(String[] args) throws IOException {
        P10872 p10872 = new P10872();
        p10872.solve();
    }

    private void solve() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bf.readLine());
        int result;
        if (input == 0) result = 1;
        else result = input * factorial(input-1);
        System.out.println(result);
    }

    public int factorial(int input) {
        if (input == 0) return 1;
        else return input * factorial(input-1);
    }
}
