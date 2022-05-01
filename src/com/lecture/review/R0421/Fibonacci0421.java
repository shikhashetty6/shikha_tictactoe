package com.lecture.review.R0421;

import java.util.Scanner;

public class Fibonacci0421 {

    static int[] fibo = new int[46];

    public static void main(String[] args) {
        Fibonacci0421 fibonacci0421 = new Fibonacci0421();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci0421.dfs(i) + " ");
        }
    }

    private int dfs(int input) {
        if(fibo[input]!=0) return fibo[input];
        if(input==1) return 1;
        else if(input==2) return 1;
        else return fibo[input] = dfs(input-1) + dfs(input-2);
    }
}
