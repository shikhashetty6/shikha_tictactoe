package com.boj.step.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2447 {
    public char[][] array;

    public static void main(String[] args) throws IOException {
        P2447 p2447 = new P2447();
        p2447.solve();
    }

    private void solve() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer input = Integer.parseInt(bf.readLine());

        array = new char[input][input];

        //printStar();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                printStar(i, j, input);
            }
        }

    }

    public void printStar(int i, int j, int input) {
        if (j % 3 == 0) {

        }
        System.out.println("***");
    }

}
