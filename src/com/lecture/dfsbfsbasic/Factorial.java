package com.lecture.dfsbfsbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    int answer = 0;

    private int dfs(int input) {
        if(input<1) return 1;
        else answer = input * dfs(input-1);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Factorial factorial = new Factorial();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        System.out.println(factorial.dfs(input));
    }
}
