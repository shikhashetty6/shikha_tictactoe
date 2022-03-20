package com.lecture.dfsbfsbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveBinaryNumber {

    void dfs(int value) {

        if ((value / 2) < 1) {
            System.out.print(value);
            return;
        }
        else {
            dfs(value/2);
            System.out.print(value%2);
        }
    }

    public static void main(String[] args) throws IOException {
        RecursiveBinaryNumber recursiveBinaryNumber = new RecursiveBinaryNumber();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        recursiveBinaryNumber.dfs(input);
    }
}
